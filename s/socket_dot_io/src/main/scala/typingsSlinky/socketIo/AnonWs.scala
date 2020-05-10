package typingsSlinky.socketIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWs extends js.Object {
  var ws: js.Any = js.native
}

object AnonWs {
  @scala.inline
  def apply(ws: js.Any): AnonWs = {
    val __obj = js.Dynamic.literal(ws = ws.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWs]
  }
  @scala.inline
  implicit class AnonWsOps[Self <: AnonWs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ws")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

