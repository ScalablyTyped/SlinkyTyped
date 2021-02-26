package typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the UI settings for the SpeechRecognizer.RecognizeWithUIAsync method. */
@js.native
trait SpeechRecognizerUIOptions extends StObject {
  
  /** Gets or sets the heading text that is displayed on the Listening screen. The default is "Listening...". */
  var audiblePrompt: String = js.native
  
  /** Gets or sets the example text shown on the Listening screen. */
  var exampleText: String = js.native
  
  /** Gets or sets whether the recognized text is spoken back to the user on the Heard you say screen. */
  var isReadBackEnabled: Boolean = js.native
  
  /** Gets or sets whether a Heard you say screen is shown to the user after speech recognition is completed. */
  var showConfirmation: Boolean = js.native
}
object SpeechRecognizerUIOptions {
  
  @scala.inline
  def apply(audiblePrompt: String, exampleText: String, isReadBackEnabled: Boolean, showConfirmation: Boolean): SpeechRecognizerUIOptions = {
    val __obj = js.Dynamic.literal(audiblePrompt = audiblePrompt.asInstanceOf[js.Any], exampleText = exampleText.asInstanceOf[js.Any], isReadBackEnabled = isReadBackEnabled.asInstanceOf[js.Any], showConfirmation = showConfirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerUIOptions]
  }
  
  @scala.inline
  implicit class SpeechRecognizerUIOptionsMutableBuilder[Self <: SpeechRecognizerUIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudiblePrompt(value: String): Self = StObject.set(x, "audiblePrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleText(value: String): Self = StObject.set(x, "exampleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadBackEnabled(value: Boolean): Self = StObject.set(x, "isReadBackEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConfirmation(value: Boolean): Self = StObject.set(x, "showConfirmation", value.asInstanceOf[js.Any])
  }
}
