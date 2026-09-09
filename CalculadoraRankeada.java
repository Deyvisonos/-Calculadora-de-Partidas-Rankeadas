public class CalculadoraRankeada {
    
    
//* Inicio do algoritmo com as variáveis */
    public static String calcularNivel(int vitorias, int derrotas) {
        int saldoVitorias = vitorias - derrotas;
        String nivel = null;
//* Tabela de Ranks  */
        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias <= 100) {
            nivel = "Lendário";
        } else if (vitorias <= 101) {
            nivel = "Imortal";
        }
//* returno com mensagem do rank do Heroi */
        return "O Heroi tem de saldo de " + saldoVitorias +
               " esta no nivel de " + nivel;
    }

    public static void main(String[] args) {

        int vitorias = 85;
        int derrotas = 20;

        String resultado = calcularNivel(vitorias, derrotas);

        System.out.println(resultado);
    }
}
