package typingsSlinky.virtualKeyboard.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateOptions extends js.Object {
  var focusClass: js.UndefOr[String] = js.native
  var position: js.UndefOr[js.Array[Double]] = js.native
  var rowLooping: js.UndefOr[Boolean] = js.native
  var toggleMode: js.UndefOr[Boolean] = js.native
}

object NavigateOptions {
  @scala.inline
  def apply(): NavigateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateOptions]
  }
  @scala.inline
  implicit class NavigateOptionsOps[Self <: NavigateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRowLooping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLooping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowLooping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLooping")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMode")(js.undefined)
        ret
    }
  }
  
}

