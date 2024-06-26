package com.pedrofreires.SwiftConvert.domain.converter;

import com.pedrofreires.SwiftConvert.domain.arquivo.Arquivo;

import java.io.IOException;

public interface ConverterService {

    Boolean convertMimeTypeFile(Arquivo arquivo, String resultMimeType) throws IOException;
}
