package typingsSlinky.trezorConnect.anon

import typingsSlinky.trezorConnect.mod.LoginChallenge
import typingsSlinky.trezorConnect.mod.RequestLoginParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined trezor-connect.trezor-connect.CommonParams & {callback (): trezor-connect.trezor-connect.LoginChallenge} */
@js.native
trait CommonParamscallbackLogin extends RequestLoginParams {
  var allowSeedlessDevice: js.UndefOr[Boolean] = js.native
  var device: js.UndefOr[Instance] = js.native
  var keepSession: js.UndefOr[Boolean] = js.native
  var useEmptyPassphrase: js.UndefOr[Boolean] = js.native
  def callback(): LoginChallenge = js.native
}

object CommonParamscallbackLogin {
  @scala.inline
  def apply(callback: () => LoginChallenge): CommonParamscallbackLogin = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
    __obj.asInstanceOf[CommonParamscallbackLogin]
  }
  @scala.inline
  implicit class CommonParamscallbackLoginOps[Self <: CommonParamscallbackLogin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => LoginChallenge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAllowSeedlessDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSeedlessDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSeedlessDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSeedlessDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: Instance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSession")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEmptyPassphrase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEmptyPassphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEmptyPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEmptyPassphrase")(js.undefined)
        ret
    }
  }
  
}

