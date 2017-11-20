
package br.edu.ifpb.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 20/11/2017
 */

@FacesConverter(forClass = LocalDate.class, value = "localDateConverter")
public class LocalDateConverter implements Converter<LocalDate> {

    @Override
    public LocalDate getAsObject(FacesContext fc, UIComponent uic, String date) {
        String[] dados = date.split("/");
        int day = Integer.parseInt(dados[0]);
        int mont = Integer.parseInt(dados[1]);
        int year = Integer.parseInt(dados[2]);
        return LocalDate.of(year, mont, day);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
