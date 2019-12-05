package typingsSlinky.semanticDashUiDashSidebar.SemanticUI

import typingsSlinky.semanticDashUiDashSidebar.JQuery
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`add body CSS`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`attach events`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`get direction`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`get transition event`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`is hidden`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`is visible`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`pull page`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`push page`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.`remove body CSS`
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.destroy
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.hide
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.setting
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.show
import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Sidebar")
@js.native
trait Sidebar_ extends js.Object {
  var settings: SidebarSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  def apply(behavior: `add body CSS`): JQuery = js.native
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  def apply(behavior: `attach events`, selector: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Returns direction of current sidebar
    */
  def apply(behavior: `get direction`): String = js.native
  /**
    * Returns vendor prefixed transition end event
    */
  def apply(behavior: `get transition event`): String = js.native
  /**
    * Returns whether sidebar is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether sidebar is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Returns page content to original position
    */
  def apply(behavior: `pull page`): JQuery = js.native
  /**
    * Pushes page content to be visible alongside sidebar
    */
  def apply(behavior: `push page`): JQuery = js.native
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  def apply(behavior: `remove body CSS`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides sidebar
    */
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, value: SidebarSettings): JQuery = js.native
  /**
    * Shows sidebar
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of sidebar
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: SidebarSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

