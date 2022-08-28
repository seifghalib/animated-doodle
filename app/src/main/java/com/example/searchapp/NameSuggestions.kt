package com.example.searchapp

import android.content.SearchRecentSuggestionsProvider

class NameSuggestions : SearchRecentSuggestionsProvider() {

    companion object {
        const val AUTHORITY = "com.example.searchapp.NameSuggestions"
        const val MODE = DATABASE_MODE_QUERIES
    }

    init {
        setupSuggestions(AUTHORITY, MODE)
    }
}