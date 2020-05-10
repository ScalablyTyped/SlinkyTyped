package typingsSlinky.semanticUiModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'detachable'> */
@js.native
trait PickImpldetachable extends js.Object {
  var detachable: Boolean = js.native
}

object PickImpldetachable {
  @scala.inline
  def apply(detachable: Boolean): PickImpldetachable = {
    val __obj = js.Dynamic.literal(detachable = detachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldetachable]
  }
  @scala.inline
  implicit class PickImpldetachableOps[Self <: PickImpldetachable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

