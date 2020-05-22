package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires after the app was suspended for a file save picker operation. */
@JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerContinuationEventArgs")
@js.native
abstract class FileSavePickerContinuationEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.FileSavePickerContinuationEventArgs {
  /** Gets a set of values populated by the app before a FileSavePicker operation that deactivates the app in order to provide context when the app is activated. */
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /** Gets the file selected by the user during the file save picker operation. */
  /* CompleteClass */
  override var file: StorageFile = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}

