package typingsSlinky.semanticUiSidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'pushed'> */
@js.native
trait PickImplpushed extends js.Object {
  var pushed: String = js.native
}

object PickImplpushed {
  @scala.inline
  def apply(pushed: String): PickImplpushed = {
    val __obj = js.Dynamic.literal(pushed = pushed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpushed]
  }
  @scala.inline
  implicit class PickImplpushedOps[Self <: PickImplpushed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPushed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

