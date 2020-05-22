package typingsSlinky.winrtUwp.global.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for a device that invokes pairing. */
@JSGlobal("Windows.UI.WebUI.WebUIDevicePairingActivatedEventArgs")
@js.native
abstract class WebUIDevicePairingActivatedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.UI.WebUI.WebUIDevicePairingActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typingsSlinky.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets info about the device that triggered the operation. */
  /* CompleteClass */
  override var deviceInformation: DeviceInformation = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

