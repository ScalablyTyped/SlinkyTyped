package typingsSlinky.winrtUwp.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event raised when the app is activated from a voice command. */
@js.native
trait WebUIVoiceCommandActivatedEventArgs extends StObject {
  
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the SpeechRecognitionResult object representing the voice command that activated the app. */
  var result: SpeechRecognitionResult = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}
object WebUIVoiceCommandActivatedEventArgs {
  
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    result: SpeechRecognitionResult,
    splashScreen: SplashScreen
  ): WebUIVoiceCommandActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIVoiceCommandActivatedEventArgs]
  }
  
  @scala.inline
  implicit class WebUIVoiceCommandActivatedEventArgsMutableBuilder[Self <: WebUIVoiceCommandActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: SpeechRecognitionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
