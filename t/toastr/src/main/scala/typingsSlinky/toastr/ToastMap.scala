package typingsSlinky.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastMap extends js.Object {
  /**
  	 * The toast icon class.
  	 */
  var iconClass: String = js.native
  /**
  	 * The toast message.
  	 */
  var message: String = js.native
  /**
  	 * Any override options specified when the toast was created.
  	 */
  var optionsOverride: js.UndefOr[ToastrOptions] = js.native
  /**
  	 * The toast title.
  	 */
  var title: js.UndefOr[String] = js.native
  /**
  	 * The toast type.
  	 */
  var `type`: ToastrType = js.native
}

object ToastMap {
  @scala.inline
  def apply(iconClass: String, message: String, `type`: ToastrType): ToastMap = {
    val __obj = js.Dynamic.literal(iconClass = iconClass.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastMap]
  }
  @scala.inline
  implicit class ToastMapOps[Self <: ToastMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ToastrType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsOverride(value: ToastrOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

