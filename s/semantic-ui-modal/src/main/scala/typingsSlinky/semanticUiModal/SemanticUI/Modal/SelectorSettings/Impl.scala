package typingsSlinky.semanticUiModal.SemanticUI.Modal.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default '.actions .positive, .actions .approve, .actions .ok'
    */
  var approve: String = js.native
  /**
    * @default '.close, .actions .button'
    */
  var close: String = js.native
  /**
    * @default '.actions .negative, .actions .deny, .actions .cancel'
    */
  var deny: String = js.native
}

object Impl {
  @scala.inline
  def apply(approve: String, close: String, deny: String): Impl = {
    val __obj = js.Dynamic.literal(approve = approve.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], deny = deny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeny(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deny")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

