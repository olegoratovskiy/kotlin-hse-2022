/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package homework03

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main(args: Array<String>) = runBlocking {
    val redditClient = RedditClient()
    val pathToSaveFiles = System.getProperty("user.dir")
    args.forEach {
        launch { redditClient.saveTopicInfo(it, pathToSaveFiles) }
    }
}
