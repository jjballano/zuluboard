package com.unzulua.board.domain

import grails.trello.domain.Card

class Task {
    String description
    Date dueDate
    String cardId

    static Task from(Card card) {
        Task task = new Task(cardId: card.id, dueDate: card.dueDate)
        task.description = card.name
        if (card.description){
            task.description += " - ${card.description}"
        }
        task
    }
}