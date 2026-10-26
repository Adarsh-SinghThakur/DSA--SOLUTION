
public class cq3 {
    public static void main(String[] args) {
        String I1= "Fi_er";
        String I2= "FEVER:filer:filter:offer:FiBre:Fiber:Fixer:Tailor";
        String output= "";
         int index= I1.indexOf('_');
        String [] s=I2.split(":");
        for(String r:s){
            String temp= I1;
            char ch= r.charAt(index);
            temp = temp.replace('_',ch);

            if (r.equalsIgnoreCase(temp)) {
                if (output.isEmpty()) {
                    output = r;
                }
                else {
                    output = output + ":" + r;
                }
            }


        }
        System.out.println(output);
    }
}
