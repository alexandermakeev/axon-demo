package ru.tproger.axondemo.domain.queries;

import lombok.Data;

//запрос на выборку книги по id
@Data
public class BookQuery {
    private final String bookId;
}
