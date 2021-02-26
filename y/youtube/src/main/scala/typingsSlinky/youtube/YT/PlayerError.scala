package typingsSlinky.youtube.YT

import typingsSlinky.youtube.youtubeNumbers.`100`
import typingsSlinky.youtube.youtubeNumbers.`101`
import typingsSlinky.youtube.youtubeNumbers.`150`
import typingsSlinky.youtube.youtubeNumbers.`2`
import typingsSlinky.youtube.youtubeNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.youtube.youtubeNumbers.`2`
  - typingsSlinky.youtube.youtubeNumbers.`5`
  - typingsSlinky.youtube.youtubeNumbers.`100`
  - typingsSlinky.youtube.youtubeNumbers.`101`
  - typingsSlinky.youtube.youtubeNumbers.`150`
*/
trait PlayerError extends StObject
object PlayerError {
  
  /**
    * The owner of the requested video does not allow it to be played in embedded players.
    */
  @scala.inline
  def EmbeddingNotAllowed: `101` = 101.asInstanceOf[`101`]
  
  /**
    * This error is the same as 101. It's just a 101 error in disguise!
    */
  @scala.inline
  def EmbeddingNotAllowed2: `150` = 150.asInstanceOf[`150`]
  
  /**
    * The requested content cannot be played in an HTML5 player.
    */
  @scala.inline
  def Html5Error: `5` = 5.asInstanceOf[`5`]
  
  /**
    * The request contained an invalid parameter value.
    */
  @scala.inline
  def InvalidParam: `2` = 2.asInstanceOf[`2`]
  
  /**
    * The video requested was not found.
    */
  @scala.inline
  def VideoNotFound: `100` = 100.asInstanceOf[`100`]
}
