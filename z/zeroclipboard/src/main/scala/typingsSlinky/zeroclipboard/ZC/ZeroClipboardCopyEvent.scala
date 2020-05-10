package typingsSlinky.zeroclipboard.ZC

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLObjectElement
import typingsSlinky.zeroclipboard.AnonClearData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardCopyEvent extends ZeroClipboardEvent {
  var clipboardData: AnonClearData = js.native
}

object ZeroClipboardCopyEvent {
  @scala.inline
  def apply(
    clipboardData: AnonClearData,
    currentTarget: HTMLObjectElement,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String
  ): ZeroClipboardCopyEvent = {
    val __obj = js.Dynamic.literal(clipboardData = clipboardData.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardCopyEvent]
  }
  @scala.inline
  implicit class ZeroClipboardCopyEventOps[Self <: ZeroClipboardCopyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipboardData(value: AnonClearData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

