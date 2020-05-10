package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitMarginOptions extends js.Object {
  var `first-column`: js.UndefOr[String] = js.native
  var margin: js.UndefOr[String] = js.native
}

object UIkitMarginOptions {
  @scala.inline
  def apply(): UIkitMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitMarginOptions]
  }
  @scala.inline
  implicit class UIkitMarginOptionsOps[Self <: UIkitMarginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFirst-column`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFirst-column`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-column")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
  }
  
}

