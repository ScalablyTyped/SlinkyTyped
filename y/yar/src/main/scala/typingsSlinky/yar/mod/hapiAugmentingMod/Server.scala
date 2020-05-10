package typingsSlinky.yar.mod.hapiAugmentingMod

import typingsSlinky.yar.mod.ServerYar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var yar: ServerYar = js.native
}

object Server {
  @scala.inline
  def apply(yar: ServerYar): Server = {
    val __obj = js.Dynamic.literal(yar = yar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withYar(value: ServerYar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

