package com.ifma.questao5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEUA implements Data{

    @Override
    public String data() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
}
