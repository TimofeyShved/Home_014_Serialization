package com.company;

import java.io.Serializable;

// так же можно применить на наследниках
public class User implements Serializable {
    int levl; // будет сохранён
    static int timelevl; // пропускается
    transient char Rang; // помечен на пропуск
}
