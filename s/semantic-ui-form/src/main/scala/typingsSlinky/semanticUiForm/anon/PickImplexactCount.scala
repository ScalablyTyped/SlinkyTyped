package typingsSlinky.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'exactCount'> */
@js.native
trait PickImplexactCount extends js.Object {
  var exactCount: String = js.native
}

object PickImplexactCount {
  @scala.inline
  def apply(exactCount: String): PickImplexactCount = {
    val __obj = js.Dynamic.literal(exactCount = exactCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexactCount]
  }
  @scala.inline
  implicit class PickImplexactCountOps[Self <: PickImplexactCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExactCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

