package typingsSlinky.semanticUiTab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'ignoreFirstLoad'> */
@js.native
trait PickImplignoreFirstLoad extends js.Object {
  var ignoreFirstLoad: Boolean = js.native
}

object PickImplignoreFirstLoad {
  @scala.inline
  def apply(ignoreFirstLoad: Boolean): PickImplignoreFirstLoad = {
    val __obj = js.Dynamic.literal(ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplignoreFirstLoad]
  }
  @scala.inline
  implicit class PickImplignoreFirstLoadOps[Self <: PickImplignoreFirstLoad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreFirstLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFirstLoad")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

