package typingsSlinky.sharepoint.SP.UI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait INavigationOptions extends js.Object {
  var appHelpPageOnClick: js.UndefOr[String] = js.native
  var appHelpPageUrl: js.UndefOr[String] = js.native
  var appIconUrl: js.UndefOr[String] = js.native
  var appStartPage: js.UndefOr[String] = js.native
  var appTitle: js.UndefOr[String] = js.native
  var appTitleIconUrl: js.UndefOr[String] = js.native
  var appWebUrl: js.UndefOr[String] = js.native
  var assetId: js.UndefOr[String] = js.native
  var bottomHeaderVisible: js.UndefOr[Boolean] = js.native
  var clientTag: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var onCssLoaded: js.UndefOr[String] = js.native
  var rightToLeft: js.UndefOr[Boolean] = js.native
  var settingsLinks: js.UndefOr[js.Array[ISettingsLink]] = js.native
  var siteTitle: js.UndefOr[String] = js.native
  var siteUrl: js.UndefOr[String] = js.native
  var topHeaderVisible: js.UndefOr[Boolean] = js.native
}

object INavigationOptions {
  @scala.inline
  def apply(): INavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavigationOptions]
  }
  @scala.inline
  implicit class INavigationOptionsOps[Self <: INavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppHelpPageOnClick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appHelpPageOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppHelpPageOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appHelpPageOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withAppHelpPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appHelpPageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppHelpPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appHelpPageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAppIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAppStartPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStartPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStartPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStartPage")(js.undefined)
        ret
    }
    @scala.inline
    def withAppTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withAppTitleIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appTitleIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppTitleIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appTitleIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAppWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appWebUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appWebUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomHeaderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomHeaderVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomHeaderVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomHeaderVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withClientTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTag")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCssLoaded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCssLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCssLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCssLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withRightToLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightToLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsLinks(value: js.Array[ISettingsLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTopHeaderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topHeaderVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopHeaderVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topHeaderVisible")(js.undefined)
        ret
    }
  }
  
}

