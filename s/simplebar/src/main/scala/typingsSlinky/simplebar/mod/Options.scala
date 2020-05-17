package typingsSlinky.simplebar.mod

import typingsSlinky.simplebar.simplebarStrings.ltr
import typingsSlinky.simplebar.simplebarStrings.rtl
import typingsSlinky.simplebar.simplebarStrings.x
import typingsSlinky.simplebar.simplebarStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.native
  var classNames: js.UndefOr[ClassNamesOptions] = js.native
  var clickOnTrack: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[rtl | ltr] = js.native
  var forceVisible: js.UndefOr[Boolean | x | y] = js.native
  var scrollbarMaxSize: js.UndefOr[Double] = js.native
  var scrollbarMinSize: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: ClassNamesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withClickOnTrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOnTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOnTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOnTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: rtl | ltr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withForceVisible(value: Boolean | typingsSlinky.simplebar.simplebarStrings.x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarMaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarMaxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarMinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarMinSize")(js.undefined)
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

