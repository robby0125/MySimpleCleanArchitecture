package com.robby.mysimplecleanarchitecture.di

import com.robby.mysimplecleanarchitecture.data.IMessageDataSource
import com.robby.mysimplecleanarchitecture.data.MessageDataSource
import com.robby.mysimplecleanarchitecture.data.MessageRepository
import com.robby.mysimplecleanarchitecture.domain.IMessageRepository
import com.robby.mysimplecleanarchitecture.domain.MessageInteractor
import com.robby.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}