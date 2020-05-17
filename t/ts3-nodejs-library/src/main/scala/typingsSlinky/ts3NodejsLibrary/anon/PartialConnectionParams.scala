package typingsSlinky.ts3NodejsLibrary.anon

import typingsSlinky.ts3NodejsLibrary.enumMod.QueryProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/TeamSpeak.ConnectionParams> */
@js.native
trait PartialConnectionParams extends js.Object {
  var autoConnect: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var ignoreQueries: js.UndefOr[Boolean] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var keepAliveTimeout: js.UndefOr[Double] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var nickname: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[QueryProtocol] = js.native
  var queryport: js.UndefOr[Double] = js.native
  var readyTimeout: js.UndefOr[Double] = js.native
  var serverport: js.UndefOr[Double] = js.native
  var username: js.UndefOr[String] = js.native
}

object PartialConnectionParams {
  @scala.inline
  def apply(): PartialConnectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConnectionParams]
  }
  @scala.inline
  implicit class PartialConnectionParamsOps[Self <: PartialConnectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreQueries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: QueryProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryport")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withServerport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverport")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

