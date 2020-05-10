package typingsSlinky.semanticUiTab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'alwaysRefresh'> */
@js.native
trait PickImplalwaysRefresh extends js.Object {
  var alwaysRefresh: Boolean = js.native
}

object PickImplalwaysRefresh {
  @scala.inline
  def apply(alwaysRefresh: Boolean): PickImplalwaysRefresh = {
    val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplalwaysRefresh]
  }
  @scala.inline
  implicit class PickImplalwaysRefreshOps[Self <: PickImplalwaysRefresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRefresh")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

