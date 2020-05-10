package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowScriptableWebParts extends js.Object {
  var AllowScriptableWebParts: Boolean = js.native
  var CurrentUserId: Double = js.native
  var EffectivePresenceEnabled: Boolean = js.native
  var LCID: String = js.native
  var PermissionCustomizePages: Boolean = js.native
  var WebUrl: String = js.native
}

object AnonAllowScriptableWebParts {
  @scala.inline
  def apply(
    AllowScriptableWebParts: Boolean,
    CurrentUserId: Double,
    EffectivePresenceEnabled: Boolean,
    LCID: String,
    PermissionCustomizePages: Boolean,
    WebUrl: String
  ): AnonAllowScriptableWebParts = {
    val __obj = js.Dynamic.literal(AllowScriptableWebParts = AllowScriptableWebParts.asInstanceOf[js.Any], CurrentUserId = CurrentUserId.asInstanceOf[js.Any], EffectivePresenceEnabled = EffectivePresenceEnabled.asInstanceOf[js.Any], LCID = LCID.asInstanceOf[js.Any], PermissionCustomizePages = PermissionCustomizePages.asInstanceOf[js.Any], WebUrl = WebUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowScriptableWebParts]
  }
  @scala.inline
  implicit class AnonAllowScriptableWebPartsOps[Self <: AnonAllowScriptableWebParts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowScriptableWebParts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowScriptableWebParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentUserId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectivePresenceEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectivePresenceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLCID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LCID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissionCustomizePages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionCustomizePages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

