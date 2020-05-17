package typingsSlinky.smartFoxServer.SFS2X.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRecipientMode extends js.Object {
  /** @type {number} Returns the selected recipient mode. */
  var mode: Double = js.native
  /** @type {any} Returns the moderator/administrator message target, according to the selected recipient mode. */
  var target: js.Any = js.native
}

object MessageRecipientMode {
  @scala.inline
  def apply(mode: Double, target: js.Any): MessageRecipientMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRecipientMode]
  }
  @scala.inline
  implicit class MessageRecipientModeOps[Self <: MessageRecipientMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

