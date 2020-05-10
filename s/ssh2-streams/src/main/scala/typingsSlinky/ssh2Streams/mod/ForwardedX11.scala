package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardedX11 extends js.Object {
  var originAddr: String = js.native
  var originPort: Double = js.native
}

object ForwardedX11 {
  @scala.inline
  def apply(originAddr: String, originPort: Double): ForwardedX11 = {
    val __obj = js.Dynamic.literal(originAddr = originAddr.asInstanceOf[js.Any], originPort = originPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedX11]
  }
  @scala.inline
  implicit class ForwardedX11Ops[Self <: ForwardedX11] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginAddr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originPort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

