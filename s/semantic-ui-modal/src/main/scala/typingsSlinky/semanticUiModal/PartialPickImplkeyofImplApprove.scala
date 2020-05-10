package typingsSlinky.semanticUiModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplApprove extends js.Object {
  var approve: js.UndefOr[String] = js.native
  var close: js.UndefOr[String] = js.native
  var deny: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplApprove {
  @scala.inline
  def apply(): PartialPickImplkeyofImplApprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplApprove]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplApproveOps[Self <: PartialPickImplkeyofImplApprove] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutApprove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approve")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withDeny(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deny")(js.undefined)
        ret
    }
  }
  
}

