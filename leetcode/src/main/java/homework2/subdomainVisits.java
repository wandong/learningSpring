package homework2;

public class subdomainVisits {


    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {

            Map<String, Integer> counts = new HashMap();


            for(String domains : cpdomains){

                String[] tmp = domains.split("\\s+");
                int n = Integer.valueOf(tmp[0]);

                for(String subDomain: subdomains(tmp[1])){

                    int tmpC = counts.getOrDefault(subDomain,0);


                    counts.put(subDomain,tmpC+n);


                }

            }

            List<String> ans = new ArrayList();
            for (String dom: counts.keySet())
                ans.add("" + counts.get(dom) + " " + dom);
            return ans;




        }



        public List<String> subdomains(String domains){

            List<String> ans = new ArrayList<String>();
            ans.add(domains);

            if(domains.length()==0||!domains.contains(".")){

                return ans;

            }


            String[] tmpSplit = domains.split("\\.",2);


            List<String> ansSub = subdomains(tmpSplit[1]);
            if(ansSub!=null) ans.addAll(ansSub);

            return ans;

        }
    }
}
