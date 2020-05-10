package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementContentEditable extends js.Object {
  var contentEditable: java.lang.String = js.native
  var inputMode: java.lang.String = js.native
  val isContentEditable: scala.Boolean = js.native
}

object ElementContentEditable {
  @scala.inline
  def apply(contentEditable: java.lang.String, inputMode: java.lang.String, isContentEditable: scala.Boolean): ElementContentEditable = {
    val __obj = js.Dynamic.literal(contentEditable = contentEditable.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementContentEditable]
  }
  @scala.inline
  implicit class ElementContentEditableOps[Self <: ElementContentEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentEditable(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputMode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsContentEditable(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContentEditable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

