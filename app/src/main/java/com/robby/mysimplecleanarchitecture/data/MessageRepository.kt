package com.robby.mysimplecleanarchitecture.data

import com.robby.mysimplecleanarchitecture.domain.IMessageRepository
import com.robby.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}