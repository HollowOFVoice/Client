package com.example.client.response;

import com.example.client.Entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor

public class BookListResponse extends BaseResponse{

    public BookListResponse(Iterable<BookEntity>data){
        super(true,"Книги");
        this.data=data;
    }
    private Iterable<BookEntity>data;
}
