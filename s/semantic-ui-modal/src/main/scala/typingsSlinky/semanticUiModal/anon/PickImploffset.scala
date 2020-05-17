package typingsSlinky.semanticUiModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'offset'> */
@js.native
trait PickImploffset extends js.Object {
  var offset: Double = js.native
}

object PickImploffset {
  @scala.inline
  def apply(offset: Double): PickImploffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploffset]
  }
  @scala.inline
  implicit class PickImploffsetOps[Self <: PickImploffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

