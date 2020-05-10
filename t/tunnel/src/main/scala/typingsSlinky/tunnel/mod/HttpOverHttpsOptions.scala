package typingsSlinky.tunnel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpOverHttpsOptions extends HttpOptions {
  @JSName("proxy")
  var proxy_HttpOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.native
}

object HttpOverHttpsOptions {
  @scala.inline
  def apply(): HttpOverHttpsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOverHttpsOptions]
  }
  @scala.inline
  implicit class HttpOverHttpsOptionsOps[Self <: HttpOverHttpsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProxy(value: HttpsProxyOptions): Self = {
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
  }
  
}

