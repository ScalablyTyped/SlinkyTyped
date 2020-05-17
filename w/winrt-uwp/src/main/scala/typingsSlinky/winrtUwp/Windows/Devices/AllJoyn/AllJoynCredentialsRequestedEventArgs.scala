package typingsSlinky.winrtUwp.Windows.Devices.AllJoyn

import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a request for credentials in order to authenticate to a peer. */
@js.native
trait AllJoynCredentialsRequestedEventArgs extends js.Object {
  /** The number of times the credential request has been tried. */
  var attemptCount: Double = js.native
  /** The authentication credentials to be filled in by the app. */
  var credentials: AllJoynCredentials = js.native
  /** The unique bus name of the remote app that provided the requested credentials. */
  var peerUniqueName: String = js.native
  /** A user name value used by mechanisms that accept a user name/password pair. */
  var requestedUserName: String = js.native
  /**
    * Allows JavaScript Windows Store apps to handle the verification of provided of credentials asynchronously.
    * @return The credential request deferral.
    */
  def getDeferral(): Deferral = js.native
}

object AllJoynCredentialsRequestedEventArgs {
  @scala.inline
  def apply(
    attemptCount: Double,
    credentials: AllJoynCredentials,
    getDeferral: () => Deferral,
    peerUniqueName: String,
    requestedUserName: String
  ): AllJoynCredentialsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(attemptCount = attemptCount.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), peerUniqueName = peerUniqueName.asInstanceOf[js.Any], requestedUserName = requestedUserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentialsRequestedEventArgs]
  }
  @scala.inline
  implicit class AllJoynCredentialsRequestedEventArgsOps[Self <: AllJoynCredentialsRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentials(value: AllJoynCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => Deferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeerUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerUniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedUserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

