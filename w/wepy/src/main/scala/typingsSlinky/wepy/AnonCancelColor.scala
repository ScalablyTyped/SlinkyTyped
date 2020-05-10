package typingsSlinky.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelColor extends js.Object {
  var cancelColor: js.UndefOr[String] = js.native
  var cancelText: js.UndefOr[String] = js.native
  var confirmColor: js.UndefOr[String] = js.native
  var confirmText: js.UndefOr[String] = js.native
  var content: String = js.native
  var showCancel: js.UndefOr[Boolean] = js.native
  var title: String = js.native
}

object AnonCancelColor {
  @scala.inline
  def apply(content: String, title: String): AnonCancelColor = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelColor]
  }
  @scala.inline
  implicit class AnonCancelColorOps[Self <: AnonCancelColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmColor")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(js.undefined)
        ret
    }
  }
  
}

