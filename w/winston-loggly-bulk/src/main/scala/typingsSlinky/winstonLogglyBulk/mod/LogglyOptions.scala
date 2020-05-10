package typingsSlinky.winstonLogglyBulk.mod

import typingsSlinky.node.urlMod.Url
import typingsSlinky.winstonLogglyBulk.AnonPassword
import typingsSlinky.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogglyOptions extends TransportStreamOptions {
  var auth: js.UndefOr[AnonPassword | Null] = js.native
  var bufferOptions: js.UndefOr[BufferOptions] = js.native
  var isBulk: js.UndefOr[Boolean] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var networkErrorOnConsole: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[Null | String | Url] = js.native
  var stripColors: js.UndefOr[Boolean] = js.native
  var subdomain: String = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var timestamp: js.UndefOr[Boolean] = js.native
  var token: String = js.native
}

object LogglyOptions {
  @scala.inline
  def apply(subdomain: String, token: String): LogglyOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogglyOptions]
  }
  @scala.inline
  implicit class LogglyOptionsOps[Self <: LogglyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubdomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth(value: AnonPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(null)
        ret
    }
    @scala.inline
    def withBufferOptions(value: BufferOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBulk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBulk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBulk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBulk")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkErrorOnConsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkErrorOnConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkErrorOnConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkErrorOnConsole")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String | Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(null)
        ret
    }
    @scala.inline
    def withStripColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripColors")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

