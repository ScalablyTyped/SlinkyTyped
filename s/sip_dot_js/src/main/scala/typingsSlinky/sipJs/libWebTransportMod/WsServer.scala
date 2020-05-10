package typingsSlinky.sipJs.libWebTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WsServer extends js.Object {
  var isError: Boolean = js.native
  var scheme: String = js.native
  var sipUri: String = js.native
  var weight: Double = js.native
  var wsUri: String = js.native
}

object WsServer {
  @scala.inline
  def apply(isError: Boolean, scheme: String, sipUri: String, weight: Double, wsUri: String): WsServer = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], sipUri = sipUri.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], wsUri = wsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WsServer]
  }
  @scala.inline
  implicit class WsServerOps[Self <: WsServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSipUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sipUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

