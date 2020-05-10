package typingsSlinky.wepy.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageConfig extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var backgroundTextStyle: js.UndefOr[String] = js.native
  var disableScroll: js.UndefOr[Boolean] = js.native
  var enablePullDownRefresh: js.UndefOr[Boolean] = js.native
  var navigationBarBackgroundColor: js.UndefOr[String] = js.native
  var navigationBarTextStyle: js.UndefOr[String] = js.native
  var navigationBarTitleText: js.UndefOr[String] = js.native
  var onReachBottomDistance: js.UndefOr[Double] = js.native
}

object PageConfig {
  @scala.inline
  def apply(): PageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageConfig]
  }
  @scala.inline
  implicit class PageConfigOps[Self <: PageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePullDownRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePullDownRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePullDownRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePullDownRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationBarBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBarBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationBarTextStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBarTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationBarTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarTitleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBarTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarTitleText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReachBottomDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottomDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReachBottomDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReachBottomDistance")(js.undefined)
        ret
    }
  }
  
}

