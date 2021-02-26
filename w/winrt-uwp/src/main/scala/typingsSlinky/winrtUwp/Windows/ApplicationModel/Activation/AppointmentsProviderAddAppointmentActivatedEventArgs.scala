package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to add an appointment to the user’s calendar. */
@js.native
trait AppointmentsProviderAddAppointmentActivatedEventArgs extends StObject {
  
  /** Gets the appointment that is provided to the app when the user tries to add it. */
  var addAppointmentOperation: AddAppointmentOperation = js.native
  
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the action to be performed by the appointments provider. */
  var verb: String = js.native
}
object AppointmentsProviderAddAppointmentActivatedEventArgs {
  
  @scala.inline
  def apply(
    addAppointmentOperation: AddAppointmentOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): AppointmentsProviderAddAppointmentActivatedEventArgs = {
    val __obj = js.Dynamic.literal(addAppointmentOperation = addAppointmentOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsProviderAddAppointmentActivatedEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentsProviderAddAppointmentActivatedEventArgsMutableBuilder[Self <: AppointmentsProviderAddAppointmentActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAppointmentOperation(value: AddAppointmentOperation): Self = StObject.set(x, "addAppointmentOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
