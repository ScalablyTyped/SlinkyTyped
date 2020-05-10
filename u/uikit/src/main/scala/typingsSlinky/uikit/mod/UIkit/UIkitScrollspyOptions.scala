package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitScrollspyOptions extends js.Object {
  var cls: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var `offset-left`: js.UndefOr[Double] = js.native
  var `offset-top`: js.UndefOr[Double] = js.native
  var repeat: js.UndefOr[Boolean] = js.native
}

object UIkitScrollspyOptions {
  @scala.inline
  def apply(): UIkitScrollspyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollspyOptions]
  }
  @scala.inline
  implicit class UIkitScrollspyOptionsOps[Self <: UIkitScrollspyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-left`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-top`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-top")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
  }
  
}

