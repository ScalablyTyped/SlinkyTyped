package typingsSlinky.storybookAddonActions.actionOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionOptions extends js.Object {
  var allowFunction: js.UndefOr[Boolean] = js.native
  var clearOnStoryChange: js.UndefOr[Boolean] = js.native
  var depth: js.UndefOr[Double] = js.native
  var limit: js.UndefOr[Double] = js.native
}

object ActionOptions {
  @scala.inline
  def apply(): ActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionOptions]
  }
  @scala.inline
  implicit class ActionOptionsOps[Self <: ActionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnStoryChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnStoryChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnStoryChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnStoryChange")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
  }
  
}

