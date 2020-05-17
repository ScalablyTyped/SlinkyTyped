package typingsSlinky.tabrisPluginFirebase.mod.global.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris-plugin-firebase.tabris-plugin-firebase.<global>.firebase.PropertyMixins.Analytics> */
@js.native
trait AnalyticsProperties extends js.Object {
  var analyticsCollectionEnabled: js.UndefOr[Boolean] = js.native
  var screenName: js.UndefOr[String] = js.native
  var userId: js.UndefOr[String] = js.native
}

object AnalyticsProperties {
  @scala.inline
  def apply(): AnalyticsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsProperties]
  }
  @scala.inline
  implicit class AnalyticsPropertiesOps[Self <: AnalyticsProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyticsCollectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsCollectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsCollectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsCollectionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

