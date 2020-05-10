package typingsSlinky.svgJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttrs extends js.Object {
  var attrs: AnonCx = js.native
}

object AnonAttrs {
  @scala.inline
  def apply(attrs: AnonCx): AnonAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrs]
  }
  @scala.inline
  implicit class AnonAttrsOps[Self <: AnonAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: AnonCx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

