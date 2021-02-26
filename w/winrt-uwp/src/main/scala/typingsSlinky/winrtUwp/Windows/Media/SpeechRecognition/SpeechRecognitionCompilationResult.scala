package typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of compiling the constraints set for a SpeechRecognizer object. */
@js.native
trait SpeechRecognitionCompilationResult extends StObject {
  
  /** Gets the result state ( SpeechRecognitionResultStatus ) from the compiling of grammar constraints. */
  var status: SpeechRecognitionResultStatus = js.native
}
object SpeechRecognitionCompilationResult {
  
  @scala.inline
  def apply(status: SpeechRecognitionResultStatus): SpeechRecognitionCompilationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionCompilationResult]
  }
  
  @scala.inline
  implicit class SpeechRecognitionCompilationResultMutableBuilder[Self <: SpeechRecognitionCompilationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: SpeechRecognitionResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
