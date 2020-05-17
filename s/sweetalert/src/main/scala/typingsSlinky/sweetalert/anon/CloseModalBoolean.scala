package typingsSlinky.sweetalert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseModalBoolean extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.native
}

object CloseModalBoolean {
  @scala.inline
  def apply(): CloseModalBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseModalBoolean]
  }
  @scala.inline
  implicit class CloseModalBooleanOps[Self <: CloseModalBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeModal")(js.undefined)
        ret
    }
  }
  
}

