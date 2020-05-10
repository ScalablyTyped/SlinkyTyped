package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitVideoOptions extends js.Object {
  var automute: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean | String] = js.native
}

object UIkitVideoOptions {
  @scala.inline
  def apply(): UIkitVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitVideoOptions]
  }
  @scala.inline
  implicit class UIkitVideoOptionsOps[Self <: UIkitVideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automute")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
  }
  
}

