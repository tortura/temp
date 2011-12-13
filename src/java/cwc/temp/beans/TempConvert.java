package cwc.temp.beans;

import cwc.temp.services.Conversion;
import cwc.temp.services.ConversionImpl;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TempConvert {
    private Conversion converter;
    private String fahrenheitStr;
    private String celsiusStr;

    public TempConvert() {
        converter = new ConversionImpl();
        fahrenheitStr = "32.0";
        celsiusStr = "0.0";
    }

    public String getCelsiusStr() {
        return celsiusStr;
    }

    public void setCelsiusStr(String celciusStr) {
        this.celsiusStr = celciusStr;
    }

    public String getFahrenheitStr() {
        return fahrenheitStr;
    }

    public void setFahrenheitStr(String fahrenheitStr) {
        this.fahrenheitStr = fahrenheitStr;
    }
    
    public String convertFahToCel(String fahTempStr) {
        double fahrenheit = Double.parseDouble(fahTempStr);
        double celcius = converter.fahrenheitToCelcius(fahrenheit);
        return Double.toString(celcius);
    }
    
    public String convertCeltoFah(String celTempStr) {
        double celcius = Double.parseDouble(celTempStr);
        double fahrenheit = converter.celciusToFahrenheit(celcius);
        return Double.toString(fahrenheit);
    }
}
