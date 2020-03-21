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
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("site")
  var site_Original: Site = js.native
  def site(): JQuery = js.native
  def site(behavior: setting, name: debug): Boolean = js.native
  def site(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: modules): js.Array[String] = js.native
  def site(behavior: setting, name: modules, value: js.Array[String]): JQuery = js.native
  def site(behavior: setting, name: name): String = js.native
  def site(behavior: setting, name: namespace): String = js.native
  def site(behavior: setting, name: namespaceStub): NamespaceStubSettings = js.native
  def site(behavior: setting, name: namespaceStub, value: NamespaceStubSettings): JQuery = js.native
  def site(behavior: setting, name: namespace, value: String): JQuery = js.native
  def site(behavior: setting, name: name, value: String): JQuery = js.native
  def site(behavior: setting, name: performance): Boolean = js.native
  def site(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: silent): Boolean = js.native
  def site(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: siteNamespace): String = js.native
  def site(behavior: setting, name: siteNamespace, value: String): JQuery = js.native
  def site(behavior: setting, name: verbose): Boolean = js.native
  def site(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def site(settings: SiteSettings): JQuery = js.native
  @JSName("site")
  def site_destroy(behavior: destroy): JQuery = js.native
  @JSName("site")
  def site_setting(behavior: setting, value: SiteSettings): JQuery = js.native
}

