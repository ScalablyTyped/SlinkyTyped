package typingsSlinky.uikit.mod.UIkit

import typingsSlinky.uikit.uikitStrings.`bottom-center`
import typingsSlinky.uikit.uikitStrings.`bottom-left`
import typingsSlinky.uikit.uikitStrings.`bottom-right`
import typingsSlinky.uikit.uikitStrings.`top-center`
import typingsSlinky.uikit.uikitStrings.`top-left`
import typingsSlinky.uikit.uikitStrings.`top-right`
import typingsSlinky.uikit.uikitStrings.danger
import typingsSlinky.uikit.uikitStrings.primary
import typingsSlinky.uikit.uikitStrings.success
import typingsSlinky.uikit.uikitStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitNotificationOptions extends js.Object {
  var group: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var pos: js.UndefOr[
    `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.native
  var status: js.UndefOr[primary | success | warning | danger] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object UIkitNotificationOptions {
  @scala.inline
  def apply(): UIkitNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitNotificationOptions]
  }
  @scala.inline
  implicit class UIkitNotificationOptionsOps[Self <: UIkitNotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withPos(value: `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: primary | success | warning | danger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

