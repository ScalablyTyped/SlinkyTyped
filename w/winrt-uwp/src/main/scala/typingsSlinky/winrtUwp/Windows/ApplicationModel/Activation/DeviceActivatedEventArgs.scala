package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for a device that invokes AutoPlay. */
@js.native
trait DeviceActivatedEventArgs extends StObject {
  
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the device identifier for the device that invoked AutoPlay. */
  var deviceInformationId: String = js.native
  
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the action associated with the activated device. */
  var verb: String = js.native
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}
object DeviceActivatedEventArgs {
  
  @scala.inline
  def apply(
    currentlyShownApplicationViewId: Double,
    deviceInformationId: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String,
    viewSwitcher: ActivationViewSwitcher
  ): DeviceActivatedEventArgs = {
    val __obj = js.Dynamic.literal(currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], deviceInformationId = deviceInformationId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceActivatedEventArgs]
  }
  
  @scala.inline
  implicit class DeviceActivatedEventArgsMutableBuilder[Self <: DeviceActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentlyShownApplicationViewId(value: Double): Self = StObject.set(x, "currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceInformationId(value: String): Self = StObject.set(x, "deviceInformationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewSwitcher(value: ActivationViewSwitcher): Self = StObject.set(x, "viewSwitcher", value.asInstanceOf[js.Any])
  }
}
