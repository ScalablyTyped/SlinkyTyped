package typingsSlinky.timeago.Timeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var allowFuture: Boolean = js.native
  var allowPast: Boolean = js.native
  var autoDispose: Boolean = js.native
  var cutoff: Double = js.native
  var localeTitle: Boolean = js.native
  var refreshMillis: Double = js.native
  var strings: LocalizedStrings = js.native
}

object Settings {
  @scala.inline
  def apply(
    allowFuture: Boolean,
    allowPast: Boolean,
    autoDispose: Boolean,
    cutoff: Double,
    localeTitle: Boolean,
    refreshMillis: Double,
    strings: LocalizedStrings
  ): Settings = {
    val __obj = js.Dynamic.literal(allowFuture = allowFuture.asInstanceOf[js.Any], allowPast = allowPast.asInstanceOf[js.Any], autoDispose = autoDispose.asInstanceOf[js.Any], cutoff = cutoff.asInstanceOf[js.Any], localeTitle = localeTitle.asInstanceOf[js.Any], refreshMillis = refreshMillis.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFuture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFuture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowPast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoDispose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDispose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCutoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocaleTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrings(value: LocalizedStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

