import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class serach {


        public void serach(String keyword) {
            String apiUrl = "https://api.arasaac.org/api/pictograms/fr/search/"+keyword;

            List<Integer> pictogramIds = new ArrayList<>();
            List<String> links = new ArrayList<>();
            try {
                // Définir les informations du proxy
                String proxyHost = "Proxy.univ-lemans.fr";
                int proxyPort = 3128;
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));

                // Établir une connexion HTTP avec le proxy
                HttpURLConnection conn = (HttpURLConnection) new URL(apiUrl).openConnection(proxy);
                conn.setRequestMethod("GET");

                // Lire la réponse de l'API
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Convertir la réponse JSON en objet JsonNode
                ObjectMapper mapper = new ObjectMapper();
                JsonNode jsonNode = mapper.readTree(response.toString());

                // Parcourir les éléments du tableau JSON
                for (JsonNode node : jsonNode) {
                    // Extraire l'ID de chaque objet JSON et l'ajouter à la liste
                    int id = node.get("_id").asInt();
                    pictogramIds.add(id);
                }

                // Fermer la connexion
                conn.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Afficher les IDs des pictogrammes
            for (int id : pictogramIds) {
                System.out.println(id);
                links.add("https://static.arasaac.org/pictograms/" + id + "/" + id + "_2500.png");
            }
            for(String link : links ){
                System.out.println(link);
            }


    }
}
