package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information to an app that was launched after being suspended for a web authentication broker operation. */
@JSGlobal("Windows.ApplicationModel.Activation.WebAuthenticationBrokerContinuationEventArgs")
@js.native
abstract class WebAuthenticationBrokerContinuationEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.WebAuthenticationBrokerContinuationEventArgs {
  /** Gets a set of values populated by the app before a web authentication broker operation that deactivates the app in order to provide context when the app is activated. */
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the WebAuthenticationResult object returned from the web authentication broker operation. */
  /* CompleteClass */
  override var webAuthenticationResult: WebAuthenticationResult = js.native
}

