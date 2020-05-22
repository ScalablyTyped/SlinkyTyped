package typingsSlinky.winrtUwp.global.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a user authentication status changing event. */
@JSGlobal("Windows.System.UserAuthenticationStatusChangingEventArgs")
@js.native
abstract class UserAuthenticationStatusChangingEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.System.UserAuthenticationStatusChangingEventArgs {
  /** Gets the user's current authentication status. */
  /* CompleteClass */
  override var currentStatus: typingsSlinky.winrtUwp.Windows.System.UserAuthenticationStatus = js.native
  /** Gets the user's new authentication status. */
  /* CompleteClass */
  override var newStatus: typingsSlinky.winrtUwp.Windows.System.UserAuthenticationStatus = js.native
  /** Gets the user. */
  /* CompleteClass */
  override var user: typingsSlinky.winrtUwp.Windows.System.User = js.native
  /**
    * Requests a delay before the user's authentication status changes.
    * @return The user authentication status change deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typingsSlinky.winrtUwp.Windows.System.UserAuthenticationStatusChangeDeferral = js.native
}

