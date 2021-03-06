package com.github.CCwexiao.dsl.literal.interpreter;

import com.github.CCwexiao.dsl.literal.AbstractLiteralInterpreter;
import com.github.CCwexiao.dsl.type.HexBytes;

/**
 * @author leojie 2020/11/28 6:08 下午
 */
public class HexBytesInterpreter extends AbstractLiteralInterpreter {
    @Override
    protected Object interpretInternal(String literalValue) {
        return new HexBytes(literalValue);
    }

    @Override
    public Class<?> getTypeCanInterpret() {
        return HexBytes.class;
    }
}
