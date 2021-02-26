package typingsSlinky.wordsToTimeConverter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("words-to-time-converter", "wordsToHours")
  @js.native
  def wordsToHours(text: String): String = js.native
  @JSImport("words-to-time-converter", "wordsToHours")
  @js.native
  def wordsToHours(text: String, speed: SpeedType): String = js.native
  
  @JSImport("words-to-time-converter", "wordsToMinutes")
  @js.native
  def wordsToMinutes(text: String): String = js.native
  @JSImport("words-to-time-converter", "wordsToMinutes")
  @js.native
  def wordsToMinutes(text: String, speed: SpeedType): String = js.native
  
  @JSImport("words-to-time-converter", "wordsToSeconds")
  @js.native
  def wordsToSeconds(text: String): String = js.native
  @JSImport("words-to-time-converter", "wordsToSeconds")
  @js.native
  def wordsToSeconds(text: String, speed: SpeedType): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.slow
    - typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.average
    - typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.fast
  */
  trait SpeedType extends StObject
  object SpeedType {
    
    @scala.inline
    def average: typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.average = "average".asInstanceOf[typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.average]
    
    @scala.inline
    def fast: typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.fast = "fast".asInstanceOf[typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.fast]
    
    @scala.inline
    def slow: typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.slow = "slow".asInstanceOf[typingsSlinky.wordsToTimeConverter.wordsToTimeConverterStrings.slow]
  }
}
