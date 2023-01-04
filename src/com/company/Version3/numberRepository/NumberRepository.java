package com.company.Version3.numberRepository;

import java.io.IOException;

public interface NumberRepository {
    int[] read() throws IOException;
}
