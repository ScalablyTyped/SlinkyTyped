package typingsSlinky.tabrisPluginFirebase.mod._Global_.firebase.PropertyMixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  var analyticsCollectionEnabled: Boolean = js.native
  var screenName: String = js.native
  var userId: String = js.native
}

object Analytics {
  @scala.inline
  def apply(analyticsCollectionEnabled: Boolean, screenName: String, userId: String): Analytics = {
    val __obj = js.Dynamic.literal(analyticsCollectionEnabled = analyticsCollectionEnabled.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analytics]
  }
  @scala.inline
  implicit class AnalyticsOps[Self <: Analytics] (val x: Self) extends AnyVal {
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
    def withScreenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

