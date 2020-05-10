package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusEventInit extends UIEventInit {
  var relatedTarget: js.UndefOr[org.scalajs.dom.raw.EventTarget | Null] = js.native
}

object FocusEventInit {
  @scala.inline
  def apply(): FocusEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusEventInit]
  }
  @scala.inline
  implicit class FocusEventInitOps[Self <: FocusEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelatedTarget(value: org.scalajs.dom.raw.EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedTarget")(null)
        ret
    }
  }
  
}

