
import org.junit.jupiter.api.Test;

public class CollectibleTests {
/*
    >Hay un juego de cartas coleccionables que existe en el mercado.
    >Las cartas se distribuyen en packs cerrados de 14 cartas, de las cuales puede haber cartas comunes, infrecuentes, o raras.
        >Cada carta tiene un nombre y un año de lanzamiento.
        >Según el mercado, tienen un precio de lanzamiento.
        >El precio de las cartas en un determinado momento nunca puede ser menor a 1.
        >Las cartas tienen una valorización diferente según su rareza.
            >Las comunes se deprecian con el tiempo un 10% el primer año, un 20% el segundo, un 30% el tercero y así sucesivamente.
            >Las infrecuentes no varían
            >Las raras se aprecian, cada año su valor se duplica respecto al año anterior.

        Por ej. La carta común GOGL se lanzó en el 2000 con un precio de 100ARS en Argentina.
        En el año 2001 valía 90ARS, es decir se depreció un 10%. Luego en 2002 valía 80ARS, es decir se depreció un 20%.
 */
    @Test
    void shouldGetCardValuation(){
        //Obtener la valuacion para una carta común del año 2000, en el mercado argentino en el 2006.

        //Carta GOGL precio en el año 2000 en el mercado argentino: 100 ARS.
        //Precio esperado en el 2006 40ARS.
    }

    @Test
    void shouldGetPackValuation(){
        //Obtener la valuacion para una pack de cartas del año 2000, en el mercado argentino en el 2006.

        //Podemos asumir que el pack tiene:
        // >10 cartas comunes GOGL (100ARS)
        // >3 cartas infrecuentes: FB (100ARS), SPY (300ARS) y MELI (500ARS)
        // >1 carta rara: QQQ que en su lanzamiento valía 1500ARS y cada año aumenta su valor respecto al año anterior.

        //El pack debería valer 97300ARS
    }

    @Test
    void shouldGetPackValuationConvertedToUSD(){
        //Obtener la valuacion para una pack de cartas igual al pack anterior, pero en el mercado mexicano la valuacion inicial fue de un 50% respecto de la valuación argentina.
        //Las cartas se encuentran valuadas en MXN y queremos obtener su valuación en USD.
    }
}
