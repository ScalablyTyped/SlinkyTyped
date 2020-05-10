package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * properties of the current business app in Customer Engagement.
  */
@js.native
trait AppProperties extends js.Object {
  var appId: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var uniqueName: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var webResourceId: js.UndefOr[String] = js.native
  var webResourceName: js.UndefOr[String] = js.native
  var welcomePageId: js.UndefOr[String] = js.native
  var welcomePageName: js.UndefOr[String] = js.native
}

object AppProperties {
  @scala.inline
  def apply(): AppProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProperties]
  }
  @scala.inline
  implicit class AppPropertiesOps[Self <: AppProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWebResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withWebResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withWelcomePageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomePageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWelcomePageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomePageId")(js.undefined)
        ret
    }
    @scala.inline
    def withWelcomePageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomePageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWelcomePageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("welcomePageName")(js.undefined)
        ret
    }
  }
  
}

