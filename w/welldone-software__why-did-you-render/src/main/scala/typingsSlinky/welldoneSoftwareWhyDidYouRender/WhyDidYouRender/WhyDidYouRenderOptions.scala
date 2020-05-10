package typingsSlinky.welldoneSoftwareWhyDidYouRender.WhyDidYouRender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhyDidYouRenderOptions extends js.Object {
  var collapseGroups: js.UndefOr[Boolean] = js.native
  var diffNameColor: js.UndefOr[String] = js.native
  var diffPathColor: js.UndefOr[String] = js.native
  var exclude: js.UndefOr[js.Array[js.RegExp]] = js.native
  var hotReloadBufferMs: js.UndefOr[Double] = js.native
  var include: js.UndefOr[js.Array[js.RegExp]] = js.native
  var logOnDifferentValues: js.UndefOr[Boolean] = js.native
  var notifier: js.UndefOr[js.Function1[/* options */ UpdateInfo, Unit]] = js.native
  var onlyLogs: js.UndefOr[Boolean] = js.native
  var titleColor: js.UndefOr[String] = js.native
  var trackExtraHooks: js.UndefOr[js.Array[ExtraHookToTrack]] = js.native
  var trackHooks: js.UndefOr[Boolean] = js.native
}

object WhyDidYouRenderOptions {
  @scala.inline
  def apply(): WhyDidYouRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhyDidYouRenderOptions]
  }
  @scala.inline
  implicit class WhyDidYouRenderOptionsOps[Self <: WhyDidYouRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffNameColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffNameColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffNameColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffNameColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffPathColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffPathColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffPathColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffPathColor")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withHotReloadBufferMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotReloadBufferMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotReloadBufferMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotReloadBufferMs")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withLogOnDifferentValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logOnDifferentValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogOnDifferentValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logOnDifferentValues")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifier(value: /* options */ UpdateInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyLogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackExtraHooks(value: js.Array[ExtraHookToTrack]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackExtraHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackExtraHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackExtraHooks")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackHooks")(js.undefined)
        ret
    }
  }
  
}

