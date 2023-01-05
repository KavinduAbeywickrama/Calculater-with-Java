package com.company.Version4.numberRepository;

import java.io.IOException;

public interface NumberRepository {
    int[] read() throws IOException;
}
