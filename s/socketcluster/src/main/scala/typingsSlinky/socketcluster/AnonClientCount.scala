package typingsSlinky.socketcluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClientCount extends js.Object {
  var clientCount: js.Any = js.native
  var httpRPM: Double = js.native
  var wsRPM: Double = js.native
}

object AnonClientCount {
  @scala.inline
  def apply(clientCount: js.Any, httpRPM: Double, wsRPM: Double): AnonClientCount = {
    val __obj = js.Dynamic.literal(clientCount = clientCount.asInstanceOf[js.Any], httpRPM = httpRPM.asInstanceOf[js.Any], wsRPM = wsRPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientCount]
  }
  @scala.inline
  implicit class AnonClientCountOps[Self <: AnonClientCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpRPM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRPM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWsRPM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsRPM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

