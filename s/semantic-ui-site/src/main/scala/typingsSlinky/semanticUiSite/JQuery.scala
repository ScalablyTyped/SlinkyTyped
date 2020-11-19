package typingsSlinky.semanticUiSite

import typingsSlinky.semanticUiSite.SemanticUI.Site
import typingsSlinky.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import typingsSlinky.semanticUiSite.SemanticUI.SiteSettings
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.debug
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.destroy
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.modules
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.name
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.namespace
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.namespaceStub
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.performance
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.setting
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.silent
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.siteNamespace
import typingsSlinky.semanticUiSite.semanticUiSiteStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def site(): JQuery = js.native
  def site(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def site(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: modules, value: js.UndefOr[scala.Nothing]): js.Array[String] = js.native
  def site(behavior: setting, name: modules, value: js.Array[String]): JQuery = js.native
  def site(behavior: setting, name: namespaceStub, value: js.UndefOr[scala.Nothing]): NamespaceStubSettings = js.native
  def site(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def site(behavior: setting, name: namespace, value: String): JQuery = js.native
  def site(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def site(behavior: setting, name: name, value: String): JQuery = js.native
  def site(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def site(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def site(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: siteNamespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def site(behavior: setting, name: siteNamespace, value: String): JQuery = js.native
  def site(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def site(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def site(settings: SiteSettings): JQuery = js.native
  @JSName("site")
  def site_JQuery(behavior: setting, name: namespaceStub, value: NamespaceStubSettings): JQuery = js.native
  @JSName("site")
  var site_Original: Site = js.native
  @JSName("site")
  def site_destroy(behavior: destroy): JQuery = js.native
  @JSName("site")
  def site_setting(behavior: setting, value: SiteSettings): JQuery = js.native
}
