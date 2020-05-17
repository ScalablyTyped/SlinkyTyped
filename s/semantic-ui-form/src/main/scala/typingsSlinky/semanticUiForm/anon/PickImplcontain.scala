package typingsSlinky.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'contain'> */
@js.native
trait PickImplcontain extends js.Object {
  var contain: String = js.native
}

object PickImplcontain {
  @scala.inline
  def apply(contain: String): PickImplcontain = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontain]
  }
  @scala.inline
  implicit class PickImplcontainOps[Self <: PickImplcontain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

