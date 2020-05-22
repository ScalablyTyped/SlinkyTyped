package typingsSlinky.winrtUwp.global.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when a restricted app is launched. */
@JSGlobal("Windows.UI.WebUI.WebUIRestrictedLaunchActivatedEventArgs")
@js.native
abstract class WebUIRestrictedLaunchActivatedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.UI.WebUI.WebUIRestrictedLaunchActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typingsSlinky.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets information about a shared context for the restricted launch. */
  /* CompleteClass */
  override var sharedContext: js.Any = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

