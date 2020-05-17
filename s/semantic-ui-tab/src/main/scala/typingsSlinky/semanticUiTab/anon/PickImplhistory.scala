package typingsSlinky.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'history'> */
@js.native
trait PickImplhistory extends js.Object {
  var history: Boolean = js.native
}

object PickImplhistory {
  @scala.inline
  def apply(history: Boolean): PickImplhistory = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhistory]
  }
  @scala.inline
  implicit class PickImplhistoryOps[Self <: PickImplhistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

