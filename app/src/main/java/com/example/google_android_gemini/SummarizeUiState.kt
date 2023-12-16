package com.example.google_android_gemini

/**
 * A sealed hierarchy describing the state of the text generation.
 */
sealed interface SummarizeUiState {
    object Initial : SummarizeUiState
    object Loading : SummarizeUiState
    data class Success(val outputText: String) : SummarizeUiState
    data class Error(val errorMessage: String) : SummarizeUiState
}