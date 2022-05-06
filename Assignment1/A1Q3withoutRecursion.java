public class A1Q3withoutRecursion {
    public static void main(String[] args) {
        char[] str={'c','a','r','b','o','n'};
        int c=0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < str.length; k++) {
                    for (int l = 0; l < str.length; l++) {
                        for (int m = 0; m < str.length; m++) {
                            for (int n = 0; n < str.length; n++) {
                                if((i!=j)&&(i!=k)&&(i!=l)&&(i!=m)&&(i!=n)&&
                                        (j!=k)&&(j!=l)&&(j!=m)&&(j!=n)&&(k!=l)&&
                                        (k!=m)&&(k!=n)&&(l!=m)&&(l!=n)&&(m!=n)){
                                            System.out.println(str[i]+" "+str[j]+" "+str[k]+" "+str[l]+" "+str[m]+" "+str[n]);
                                            c++;
                                        }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}
