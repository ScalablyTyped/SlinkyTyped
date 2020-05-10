package typingsSlinky.semanticUiModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'allowMultiple'> */
@js.native
trait PickImplallowMultiple extends js.Object {
  var allowMultiple: Boolean = js.native
}

object PickImplallowMultiple {
  @scala.inline
  def apply(allowMultiple: Boolean): PickImplallowMultiple = {
    val __obj = js.Dynamic.literal(allowMultiple = allowMultiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowMultiple]
  }
  @scala.inline
  implicit class PickImplallowMultipleOps[Self <: PickImplallowMultiple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

