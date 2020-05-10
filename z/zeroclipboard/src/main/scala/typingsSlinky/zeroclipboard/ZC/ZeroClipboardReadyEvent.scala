package typingsSlinky.zeroclipboard.ZC

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardReadyEvent extends ZeroClipboardEvent {
  var message: String = js.native
  var version: String = js.native
}

object ZeroClipboardReadyEvent {
  @scala.inline
  def apply(
    currentTarget: HTMLObjectElement,
    message: String,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    version: String
  ): ZeroClipboardReadyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardReadyEvent]
  }
  @scala.inline
  implicit class ZeroClipboardReadyEventOps[Self <: ZeroClipboardReadyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

