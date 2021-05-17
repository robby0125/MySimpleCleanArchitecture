package com.robby.mysimplecleanarchitecture.data

import com.robby.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}