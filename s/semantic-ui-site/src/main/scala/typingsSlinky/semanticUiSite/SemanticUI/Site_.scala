package typingsSlinky.semanticUiSite.SemanticUI

import typingsSlinky.semanticUiSite.JQuery
import typingsSlinky.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
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
trait Site_ extends js.Object {
  var settings: SiteSettings = js.native
  def apply(): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: modules, value: js.UndefOr[scala.Nothing]): js.Array[String] = js.native
  def apply(behavior: setting, name: modules, value: js.Array[String]): JQuery = js.native
  def apply(behavior: setting, name: namespaceStub, value: js.UndefOr[scala.Nothing]): NamespaceStubSettings = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: siteNamespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: siteNamespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: SiteSettings): JQuery = js.native
  def apply(settings: SiteSettings): JQuery = js.native
}

