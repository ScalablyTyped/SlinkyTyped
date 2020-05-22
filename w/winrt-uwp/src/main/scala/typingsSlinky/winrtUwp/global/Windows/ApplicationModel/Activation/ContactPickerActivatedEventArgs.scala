package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it uses the Contact Picker. */
@JSGlobal("Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs")
@js.native
abstract class ContactPickerActivatedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs {
  /** Gets the letterbox UI of the contact picker that is displayed when the user wants to pick contacts that are provided by the app. */
  /* CompleteClass */
  override var contactPickerUI: ContactPickerUI = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}

