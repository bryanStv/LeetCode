public class RomanNumbers {
    public static void main(String[] args) {
        String romanNumber = "MCMXCIV";
        System.out.println(romanToInt(romanNumber));;
    }

    public static int romanToInt(String s) {
        int resultado = 0 , contador=0;
        char value;

        while(contador <= s.length()-1) {
            value = Character.valueOf(s.charAt(contador));
            switch (value) {
                case 'I':
                    if(contador != s.length()-1){
                        if(s.charAt(contador+1) == 'V'){
                            resultado += 4;
                            contador++;
                            break;
                        }else if(s.charAt(contador+1) == 'X'){
                            resultado += 9;
                            contador++;
                            break;
                        }
                    }
                    resultado++;
                    break;
                case 'V':
                    resultado+=5;
                    break;
                case 'X':
                    if(contador != s.length()-1) {
                        if (s.charAt(contador + 1) == 'L') {
                            resultado += 40;
                            contador++;
                            break;
                        } else if (s.charAt(contador + 1) == 'C') {
                            resultado += 90;
                            contador++;
                            break;
                        }
                    }
                    resultado+=10;
                    break;
                case 'L':
                    resultado+=50;
                    break;
                case 'C':
                    if(contador != s.length()-1) {
                        if (s.charAt(contador + 1) == 'D') {
                            resultado += 400;
                            contador++;
                            break;
                        } else if (s.charAt(contador + 1) == 'M') {
                            resultado += 900;
                            contador++;
                            break;
                        }
                    }
                    resultado+=100;
                    break;
                case 'D':
                    resultado+=500;
                    break;
                case 'M':
                    resultado+=1000;
                    break;
            }
            contador++;
        }
        return resultado;
    }
}