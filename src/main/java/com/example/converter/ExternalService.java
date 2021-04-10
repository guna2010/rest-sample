package com.example.converter;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ExternalService {
   CompletableFuture<List<User2>> getItemsFromExtService1() throws Exception;// throws Exception;
   CompletableFuture<List<User2>> getItemsFromExtService2() throws Exception;
}
