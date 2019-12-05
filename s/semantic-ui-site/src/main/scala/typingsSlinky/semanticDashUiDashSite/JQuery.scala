package typingsSlinky.semanticDashUiDashSite

import typingsSlinky.semanticDashUiDashSite.SemanticUI.Site
import typingsSlinky.semanticDashUiDashSite.SemanticUI.SiteSettings
import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.destroy
import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("site")
  var site_Original: Site = js.native
  def site(): JQuery = js.native
  def site(settings: SiteSettings): JQuery = js.native
  @JSName("site")
  def site_destroy(behavior: destroy): JQuery = js.native
  @JSName("site")
  def site_setting(behavior: setting, value: SiteSettings): JQuery = js.native
  @JSName("site")
  def site_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any = js.native
  @JSName("site")
  def site_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

