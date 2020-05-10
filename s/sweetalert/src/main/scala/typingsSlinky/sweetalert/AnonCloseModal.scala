package typingsSlinky.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseModal extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String | js.Any] = js.native
}

object AnonCloseModal {
  @scala.inline
  def apply(): AnonCloseModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCloseModal]
  }
  @scala.inline
  implicit class AnonCloseModalOps[Self <: AnonCloseModal] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withValue(value: String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

