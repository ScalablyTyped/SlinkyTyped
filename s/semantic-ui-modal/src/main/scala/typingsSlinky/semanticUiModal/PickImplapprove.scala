package typingsSlinky.semanticUiModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'approve'> */
@js.native
trait PickImplapprove extends js.Object {
  var approve: String = js.native
}

object PickImplapprove {
  @scala.inline
  def apply(approve: String): PickImplapprove = {
    val __obj = js.Dynamic.literal(approve = approve.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapprove]
  }
  @scala.inline
  implicit class PickImplapproveOps[Self <: PickImplapprove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

