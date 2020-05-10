package typingsSlinky.semanticUiSidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'scrollLock'> */
@js.native
trait PickImplscrollLock extends js.Object {
  var scrollLock: Boolean = js.native
}

object PickImplscrollLock {
  @scala.inline
  def apply(scrollLock: Boolean): PickImplscrollLock = {
    val __obj = js.Dynamic.literal(scrollLock = scrollLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplscrollLock]
  }
  @scala.inline
  implicit class PickImplscrollLockOps[Self <: PickImplscrollLock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLock")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

