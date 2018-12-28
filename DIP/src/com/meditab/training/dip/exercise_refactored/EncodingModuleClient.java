package com.meditab.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodeFiles encodefiles = new EncodeFiles();
        encodefiles.encodeWithFiles();
        EncodeDatabase&Network encodeDbandNw=new EncodeDatabase&Network();
        encodeDbandNw.encodeBasedOnNetworkAndDatabase();
    }
}
