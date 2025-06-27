package com.demo.custom;


import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomBalanceSerializer extends StdSerializer<BigDecimal> {

    public CustomBalanceSerializer() {
        this(null);
    }

    protected CustomBalanceSerializer(Class<BigDecimal> t) {
        super(t);
    }

    @Override
    public void serialize(BigDecimal balance, JsonGenerator gen, SerializerProvider provider) throws IOException {
        DecimalFormat deFormat = new DecimalFormat("0.00");  
        gen.writeString(deFormat.format(balance));
    }
}
