package com.example.study.domain;

import com.example.study.support.DateTimeConverter;
import org.apache.commons.csv.CSVRecord;

public class DummyUserMapper {
    public static DummyUser toEntity(CSVRecord record) {
        return new DummyUser(
                record.get(0),
                record.get(1),
                record.get(2),
                record.get(3),
                record.get(4),
                DateTimeConverter.stringToLocalDateTime(record.get(5))
        );
    }
}
