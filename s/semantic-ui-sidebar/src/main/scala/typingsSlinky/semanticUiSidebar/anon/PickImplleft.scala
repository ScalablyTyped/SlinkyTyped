package typingsSlinky.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'left'> */
@js.native
trait PickImplleft extends js.Object {
  var left: String = js.native
}

object PickImplleft {
  @scala.inline
  def apply(left: String): PickImplleft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplleft]
  }
  @scala.inline
  implicit class PickImplleftOps[Self <: PickImplleft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

