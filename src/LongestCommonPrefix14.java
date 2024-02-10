public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] palabras = {"flower","flow","flight"};
        //palabras = new String[]{"baab", "bacb", "b", "cbc"};
        //palabras = new String[]{"cb","cbb","a"};
        //palabras = new String[]{"aaa","aa","aaa"};
        palabras = new String[]{"abca","aba","aaab"};
        System.out.println(longestCommonPrefix(palabras));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1 || strs[0].isEmpty()) return strs[0];
        String prefijo2 = "";
        String resultado = "";
        String prefijo1 = strs[0];
        Character character1,character2;
        int contador = 0;
        for(int i = 1; i < strs.length;i++) {
            for (int j = 0; j < strs[i].length(); j++){
                if(contador > prefijo1.length()-1) break;
                character1 = strs[i].charAt(j);
                character2 = prefijo1.charAt(contador);
                if(character1 == character2){
                    prefijo2+=character1;
                    contador++;
                }else{
                    if(i == strs.length-1){
                        if(j==0) return "";
                        else return prefijo2;
                    }else{
                        if(i == strs.length-1) return "";
                        else break;
                    }
                }
            }
            prefijo1 = prefijo2;
            resultado = prefijo2;
            prefijo2 = "";
            contador = 0;
        }
        return resultado;
    }
}
