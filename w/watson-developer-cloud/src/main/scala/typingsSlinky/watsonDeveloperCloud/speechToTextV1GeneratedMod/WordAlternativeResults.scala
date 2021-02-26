package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WordAlternativeResults. */
@js.native
trait WordAlternativeResults extends StObject {
  
  /** An array of alternative hypotheses for a word from the input audio. */
  var alternatives: js.Array[WordAlternativeResult] = js.native
  
  /** The end time in seconds of the word from the input audio that corresponds to the word alternatives. */
  var end_time: Double = js.native
  
  /** The start time in seconds of the word from the input audio that corresponds to the word alternatives. */
  var start_time: Double = js.native
}
object WordAlternativeResults {
  
  @scala.inline
  def apply(alternatives: js.Array[WordAlternativeResult], end_time: Double, start_time: Double): WordAlternativeResults = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordAlternativeResults]
  }
  
  @scala.inline
  implicit class WordAlternativeResultsMutableBuilder[Self <: WordAlternativeResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[WordAlternativeResult]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesVarargs(value: WordAlternativeResult*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    @scala.inline
    def setEnd_time(value: Double): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
