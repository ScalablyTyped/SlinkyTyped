package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for an application that is a target for share operations. */
@js.native
trait ShareTargetActivatedEventArgs extends StObject {
  
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets information about data included in a share operation. */
  var shareOperation: ShareOperation = js.native
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}
object ShareTargetActivatedEventArgs {
  
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    shareOperation: ShareOperation,
    splashScreen: SplashScreen
  ): ShareTargetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], shareOperation = shareOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTargetActivatedEventArgs]
  }
  
  @scala.inline
  implicit class ShareTargetActivatedEventArgsMutableBuilder[Self <: ShareTargetActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareOperation(value: ShareOperation): Self = StObject.set(x, "shareOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
