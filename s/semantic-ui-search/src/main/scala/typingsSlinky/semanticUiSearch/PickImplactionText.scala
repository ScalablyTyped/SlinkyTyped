package typingsSlinky.semanticUiSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'actionText'> */
@js.native
trait PickImplactionText extends js.Object {
  var actionText: String = js.native
}

object PickImplactionText {
  @scala.inline
  def apply(actionText: String): PickImplactionText = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactionText]
  }
  @scala.inline
  implicit class PickImplactionTextOps[Self <: PickImplactionText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

