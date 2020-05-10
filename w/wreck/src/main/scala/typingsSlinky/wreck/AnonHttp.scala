package typingsSlinky.wreck

import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHttp extends js.Object {
  var http: Agent = js.native
  var https: Agent = js.native
  var httpsAllowUnauthorized: Agent = js.native
}

object AnonHttp {
  @scala.inline
  def apply(http: Agent, https: Agent, httpsAllowUnauthorized: Agent): AnonHttp = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], httpsAllowUnauthorized = httpsAllowUnauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHttp]
  }
  @scala.inline
  implicit class AnonHttpOps[Self <: AnonHttp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttp(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttps(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpsAllowUnauthorized(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsAllowUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

