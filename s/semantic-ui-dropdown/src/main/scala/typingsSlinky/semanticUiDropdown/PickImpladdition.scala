package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'addition'> */
@js.native
trait PickImpladdition extends js.Object {
  var addition: String = js.native
}

object PickImpladdition {
  @scala.inline
  def apply(addition: String): PickImpladdition = {
    val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpladdition]
  }
  @scala.inline
  implicit class PickImpladditionOps[Self <: PickImpladdition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

