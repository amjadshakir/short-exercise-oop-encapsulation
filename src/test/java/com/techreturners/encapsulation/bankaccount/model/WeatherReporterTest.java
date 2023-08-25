package com.techreturners.encapsulation.bankaccount.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReporterTest {

    @Test
    public void checkLondonWeather(){
        WeatherReporter weatherReporter = new WeatherReporter("London",28.5);
        assertEquals("I am in London and it is 🌦. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 83.3.", weatherReporter.print());
    }
    @Test
    public void checkCaliforniaWeather(){
        WeatherReporter weatherReporter = new WeatherReporter("California",16.3);
        assertEquals("I am in California and it is 🌅. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 61.34.", weatherReporter.print());
    }
    @Test
    public void checkCapeTownWeather(){
        WeatherReporter weatherReporter = new WeatherReporter("Cape Town",8.2);
        assertEquals("I am in Cape Town and it is 🌤. It's too cold 🥶!. The temperature in Fahrenheit is 46.76.", weatherReporter.print());
    }
    @Test
    public void checkJapanWeather(){
        WeatherReporter weatherReporter = new WeatherReporter("France",0.5);
        assertEquals("I am in France and it is 🔆. It's too cold 🥶!. The temperature in Fahrenheit is 32.9.", weatherReporter.print());
    }
    @Test
    public void checkWeatherForTemperatureGreaterThan30(){
        WeatherReporter weatherReporter = new WeatherReporter("Japan",33.6);
        assertEquals("I am in Japan and it is 🔆. It's too hot 🥵!. The temperature in Fahrenheit is 92.48.", weatherReporter.print());
    }
    @Test
    public void checkWeatherForTemperatureLessThan10(){
        WeatherReporter weatherReporter = new WeatherReporter("Japan",6.5);
        assertEquals("I am in Japan and it is 🔆. It's too cold 🥶!. The temperature in Fahrenheit is 43.7.", weatherReporter.print());
    }
    @Test
    public void checkWeatherForTemperatureBetween30And10(){
        WeatherReporter weatherReporter = new WeatherReporter("Japan",15.5);
        assertEquals("I am in Japan and it is 🔆. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 59.9.", weatherReporter.print());
    }
    @Test
    public void checkWeatherForTemperature30(){
        WeatherReporter weatherReporter = new WeatherReporter("Japan",30);
        assertEquals("I am in Japan and it is 🔆. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 86.", weatherReporter.print());
    }
    @Test
    public void checkWeatherForTemperature10(){
        WeatherReporter weatherReporter = new WeatherReporter("Iceland",10);
        assertEquals("I am in Iceland and it is 🔆. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 50.", weatherReporter.print());
    }
    @Test
    public void checkTemperatureInFahrenheitForZeroValue(){
        WeatherReporter weatherReporter = new WeatherReporter("Iceland",0);
        assertEquals("I am in Iceland and it is 🔆. It's too cold 🥶!. The temperature in Fahrenheit is 32.", weatherReporter.print());
    }
    @Test
    public void checkTemperatureInFahrenheitForNegativeValue(){
        WeatherReporter weatherReporter = new WeatherReporter("Iceland",-10);
        assertEquals("I am in Iceland and it is 🔆. It's too cold 🥶!. The temperature in Fahrenheit is 14.", weatherReporter.print());
    }
    @Test
    public void checkTemperatureInFahrenheitForPositiveValue(){
        WeatherReporter weatherReporter = new WeatherReporter("Iceland",34);
        assertEquals("I am in Iceland and it is 🔆. It's too hot 🥵!. The temperature in Fahrenheit is 93.2.", weatherReporter.print());
    }

}
