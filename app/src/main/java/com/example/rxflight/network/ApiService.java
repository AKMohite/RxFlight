package com.example.rxflight.network;
import com.example.rxflight.network.model.Price;
import com.example.rxflight.network.model.Ticket;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface ApiService {
    @GET("airline-tickets.php")
    Single<List<Ticket>> searchTickets(@Query("from") String from, @Query("to") String to);

    @GET("airline-tickets-price.php")
    Single<Price> getPrice(@Query("flight_number") String flightNumber, @Query("from") String from, @Query("to") String to);
}
