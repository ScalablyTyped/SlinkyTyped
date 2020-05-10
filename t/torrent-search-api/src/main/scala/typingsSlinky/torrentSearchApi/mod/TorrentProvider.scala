package typingsSlinky.torrentSearchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentProvider extends js.Object {
  var autoFixUnstableUrl: Boolean = js.native
  var baseUrl: String = js.native
  var categories: js.Any = js.native
   // FIXME {key: [string]}
  var defaultCategory: String = js.native
  var enableCloudFareBypass: Boolean = js.native
  var headers: js.Any = js.native
  var itemSelectors: js.Any = js.native
  var itemsSelector: String = js.native
  var loginQueryString: String = js.native
  var loginUrl: String = js.native
   // FIXME {key:[string]}
  var magnetSelector: String = js.native
  var name: String = js.native
   // FIXME {key: [string]}
  var paginateSelector: String = js.native
  var requireAuthentification: Boolean = js.native
  var resultsPerPageCount: Double = js.native
  var searchUrl: String = js.native
  var supportCookiesAuthentification: Boolean = js.native
  var supportCredentialsAuthentification: Boolean = js.native
  var supportTokenAuthentification: Boolean = js.native
  var torrentDetailsSelector: String = js.native
}

object TorrentProvider {
  @scala.inline
  def apply(
    autoFixUnstableUrl: Boolean,
    baseUrl: String,
    categories: js.Any,
    defaultCategory: String,
    enableCloudFareBypass: Boolean,
    headers: js.Any,
    itemSelectors: js.Any,
    itemsSelector: String,
    loginQueryString: String,
    loginUrl: String,
    magnetSelector: String,
    name: String,
    paginateSelector: String,
    requireAuthentification: Boolean,
    resultsPerPageCount: Double,
    searchUrl: String,
    supportCookiesAuthentification: Boolean,
    supportCredentialsAuthentification: Boolean,
    supportTokenAuthentification: Boolean,
    torrentDetailsSelector: String
  ): TorrentProvider = {
    val __obj = js.Dynamic.literal(autoFixUnstableUrl = autoFixUnstableUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], defaultCategory = defaultCategory.asInstanceOf[js.Any], enableCloudFareBypass = enableCloudFareBypass.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], itemSelectors = itemSelectors.asInstanceOf[js.Any], itemsSelector = itemsSelector.asInstanceOf[js.Any], loginQueryString = loginQueryString.asInstanceOf[js.Any], loginUrl = loginUrl.asInstanceOf[js.Any], magnetSelector = magnetSelector.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paginateSelector = paginateSelector.asInstanceOf[js.Any], requireAuthentification = requireAuthentification.asInstanceOf[js.Any], resultsPerPageCount = resultsPerPageCount.asInstanceOf[js.Any], searchUrl = searchUrl.asInstanceOf[js.Any], supportCookiesAuthentification = supportCookiesAuthentification.asInstanceOf[js.Any], supportCredentialsAuthentification = supportCredentialsAuthentification.asInstanceOf[js.Any], supportTokenAuthentification = supportTokenAuthentification.asInstanceOf[js.Any], torrentDetailsSelector = torrentDetailsSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentProvider]
  }
  @scala.inline
  implicit class TorrentProviderOps[Self <: TorrentProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFixUnstableUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFixUnstableUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableCloudFareBypass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCloudFareBypass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSelectors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemsSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginQueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagnetSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnetSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginateSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginateSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireAuthentification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAuthentification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultsPerPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsPerPageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportCookiesAuthentification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCookiesAuthentification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportCredentialsAuthentification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCredentialsAuthentification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportTokenAuthentification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportTokenAuthentification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTorrentDetailsSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torrentDetailsSelector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

