package typingsSlinky.zeroclipboard.ZC

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardAfterCopyEvent extends ZeroClipboardEvent {
  var data: Dictionary[String] = js.native
  var errors: js.Array[_] = js.native
  var success: Dictionary[Boolean] = js.native
}

object ZeroClipboardAfterCopyEvent {
  @scala.inline
  def apply(
    currentTarget: HTMLObjectElement,
    data: Dictionary[String],
    errors: js.Array[_],
    relatedTarget: HTMLElement,
    success: Dictionary[Boolean],
    target: HTMLElement,
    timeStamp: Double,
    `type`: String
  ): ZeroClipboardAfterCopyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardAfterCopyEvent]
  }
  @scala.inline
  implicit class ZeroClipboardAfterCopyEventOps[Self <: ZeroClipboardAfterCopyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Dictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

