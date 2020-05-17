package typingsSlinky.semanticUiTab.anon

import typingsSlinky.semanticUiTab.semanticUiTabStrings.all
import typingsSlinky.semanticUiTab.semanticUiTabStrings.siblings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'deactivate'> */
@js.native
trait PickImpldeactivate extends js.Object {
  var deactivate: siblings | all = js.native
}

object PickImpldeactivate {
  @scala.inline
  def apply(deactivate: siblings | all): PickImpldeactivate = {
    val __obj = js.Dynamic.literal(deactivate = deactivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldeactivate]
  }
  @scala.inline
  implicit class PickImpldeactivateOps[Self <: PickImpldeactivate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeactivate(value: siblings | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

