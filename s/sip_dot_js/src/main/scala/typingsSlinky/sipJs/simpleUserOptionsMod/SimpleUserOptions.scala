package typingsSlinky.sipJs.simpleUserOptionsMod

import typingsSlinky.sipJs.simpleUserDelegateMod.SimpleUserDelegate
import typingsSlinky.sipJs.userAgentOptionsMod.UserAgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleUserOptions extends js.Object {
  /**
    * User's SIP Address of Record (AOR).
    * @remarks
    * The AOR is registered to receive incoming calls.
    * If not specified, a random anonymous address is created for the user.
    */
  var aor: js.UndefOr[String] = js.native
  /**
    * Delegate for SimpleUser.
    */
  var delegate: js.UndefOr[SimpleUserDelegate] = js.native
  /**
    * Media options.
    */
  var media: js.UndefOr[SimpleUserMedia] = js.native
  /**
    * Maximum number of times to attempt to reconnection.
    * @remarks
    * When the transport connection is lost (WebSocket disconnects),
    * reconnection will be attempted immediately. If that fails,
    * reconnection will be attempted again when the browser indicates
    * the application has come online. See:
    * https://developer.mozilla.org/en-US/docs/Web/API/NavigatorOnLine
    * @defaultValue 3
    */
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  /**
    * Seconds to wait between reconnection attempts.
    * @defaultValue 4
    */
  var reconnectionDelay: js.UndefOr[Double] = js.native
  /**
    * Options for UserAgent.
    */
  var userAgentOptions: js.UndefOr[UserAgentOptions] = js.native
}

object SimpleUserOptions {
  @scala.inline
  def apply(): SimpleUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserOptions]
  }
  @scala.inline
  implicit class SimpleUserOptionsOps[Self <: SimpleUserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aor")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegate(value: SimpleUserDelegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: SimpleUserMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectionAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectionAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectionDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectionDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgentOptions(value: UserAgentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgentOptions")(js.undefined)
        ret
    }
  }
  
}

