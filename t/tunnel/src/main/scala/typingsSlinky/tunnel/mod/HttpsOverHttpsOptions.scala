package typingsSlinky.tunnel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpsOverHttpsOptions extends HttpsOverHttpOptions {
  @JSName("proxy")
  var proxy_HttpsOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.native
}

object HttpsOverHttpsOptions {
  @scala.inline
  def apply(): HttpsOverHttpsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsOverHttpsOptions]
  }
  @scala.inline
  implicit class HttpsOverHttpsOptionsOps[Self <: HttpsOverHttpsOptions] (val x: Self) extends AnyVal {
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

