package typingsSlinky.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'containExactly'> */
@js.native
trait PickImplcontainExactly extends js.Object {
  var containExactly: String = js.native
}

object PickImplcontainExactly {
  @scala.inline
  def apply(containExactly: String): PickImplcontainExactly = {
    val __obj = js.Dynamic.literal(containExactly = containExactly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontainExactly]
  }
  @scala.inline
  implicit class PickImplcontainExactlyOps[Self <: PickImplcontainExactly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainExactly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containExactly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

