package typingsSlinky.socketIoEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketIOEmitterOptions extends js.Object {
  var key: js.UndefOr[String] = js.native
}

object SocketIOEmitterOptions {
  @scala.inline
  def apply(): SocketIOEmitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketIOEmitterOptions]
  }
  @scala.inline
  implicit class SocketIOEmitterOptionsOps[Self <: SocketIOEmitterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

