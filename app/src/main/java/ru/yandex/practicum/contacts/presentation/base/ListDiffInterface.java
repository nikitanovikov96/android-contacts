package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T>{

    boolean theSameAs(T some);

    boolean equals(Object o);

}
