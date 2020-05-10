package typingsSlinky.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WampyOptions extends js.Object {
  var authid: js.UndefOr[String] = js.native
  var authmethods: js.UndefOr[js.Array[String]] = js.native
  var autoReconnect: js.UndefOr[Boolean] = js.native
  var helloCustomDetails: js.UndefOr[js.Any] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var onChallenge: js.UndefOr[ChallengeCallback] = js.native
  var onClose: js.UndefOr[Callback] = js.native
  var onConnect: js.UndefOr[Callback] = js.native
  var onError: js.UndefOr[Callback] = js.native
  var onReconnect: js.UndefOr[Callback] = js.native
  var onReconnectSuccess: js.UndefOr[Callback] = js.native
  var realm: js.UndefOr[String] = js.native
  var reconnectInterval: js.UndefOr[Double] = js.native
  var serializer: js.UndefOr[js.Any] = js.native
  var ws: js.UndefOr[js.Any] = js.native
}

object WampyOptions {
  @scala.inline
  def apply(): WampyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WampyOptions]
  }
  @scala.inline
  implicit class WampyOptionsOps[Self <: WampyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authid")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthmethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authmethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthmethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authmethods")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withHelloCustomDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helloCustomDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelloCustomDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helloCustomDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChallenge(value: (/* auth_method */ String, /* extra */ Dict) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChallenge")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReconnectSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReconnectSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReconnectSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReconnectSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.undefined)
        ret
    }
    @scala.inline
    def withWs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(js.undefined)
        ret
    }
  }
  
}

