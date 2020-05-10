package typingsSlinky.semanticUiForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'maxCount'> */
@js.native
trait PickImplmaxCount extends js.Object {
  var maxCount: String = js.native
}

object PickImplmaxCount {
  @scala.inline
  def apply(maxCount: String): PickImplmaxCount = {
    val __obj = js.Dynamic.literal(maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxCount]
  }
  @scala.inline
  implicit class PickImplmaxCountOps[Self <: PickImplmaxCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

