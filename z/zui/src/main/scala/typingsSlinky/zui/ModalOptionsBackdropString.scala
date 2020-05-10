package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalOptionsBackdropString extends js.Object {
  var backdrop: js.UndefOr[String] = js.native
   // for "static"
  var keyboard: js.UndefOr[Boolean] = js.native
  var remote: js.UndefOr[String] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object ModalOptionsBackdropString {
  @scala.inline
  def apply(): ModalOptionsBackdropString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptionsBackdropString]
  }
  @scala.inline
  implicit class ModalOptionsBackdropStringOps[Self <: ModalOptionsBackdropString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackdrop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

