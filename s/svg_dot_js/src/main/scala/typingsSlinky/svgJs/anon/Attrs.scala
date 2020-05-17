package typingsSlinky.svgJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attrs extends js.Object {
  var attrs: Cx = js.native
}

object Attrs {
  @scala.inline
  def apply(attrs: Cx): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  @scala.inline
  implicit class AttrsOps[Self <: Attrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: Cx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

