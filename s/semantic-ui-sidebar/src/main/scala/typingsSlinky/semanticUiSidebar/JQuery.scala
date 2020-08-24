package typingsSlinky.semanticUiSidebar

import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.SidebarSettings
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`add body CSS`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`attach events`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`get direction`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`get transition event`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`is hidden`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`is visible`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`pull page`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`push page`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.`remove body CSS`
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.auto
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.className
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.closable
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.context
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.debug
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.defaultTransition
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.delaySetup
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.destroy
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.dimPage
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.duration
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.easing
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.error
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.exclusive
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.hide
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.mobileTransition
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.name
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.namespace
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onChange
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onHidden
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onHide
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onShow
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.onVisible
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.performance
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.regExp
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.returnScroll
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.scrollLock
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.selector
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.setting
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.show
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.silent
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.toggle
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.transition
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.useLegacy
import typingsSlinky.semanticUiSidebar.semanticUiSidebarStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("sidebar")
  var sidebar_Original: Sidebar = js.native
  def sidebar(): JQuery = js.native
  def sidebar(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def sidebar(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def sidebar(behavior: setting, name: context, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def sidebar(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: defaultTransition, value: js.UndefOr[scala.Nothing]): DefaultTransitionSettings = js.native
  def sidebar(behavior: setting, name: delaySetup, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: delaySetup, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: dimPage, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: dimPage, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def sidebar(behavior: setting, name: duration, value: Double): JQuery = js.native
  def sidebar(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: easing, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def sidebar(behavior: setting, name: exclusive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: mobileTransition, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: mobileTransition, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: namespace, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: name, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: onHidden, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sidebar(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sidebar(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def sidebar(behavior: setting, name: returnScroll, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: returnScroll, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: scrollLock, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: scrollLock, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def sidebar(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def sidebar(behavior: setting, name: transition, value: String): JQuery = js.native
  def sidebar(behavior: setting, name: useLegacy, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def sidebar(behavior: setting, name: useLegacy, value: Boolean): JQuery = js.native
  def sidebar(behavior: setting, name: useLegacy, value: auto): JQuery = js.native
  def sidebar(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sidebar(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def sidebar(settings: SidebarSettings): JQuery = js.native
  @JSName("sidebar")
  def sidebar_JQuery(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  @JSName("sidebar")
  def sidebar_JQuery(behavior: setting, name: defaultTransition, value: DefaultTransitionSettings): JQuery = js.native
  @JSName("sidebar")
  def sidebar_JQuery(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  @JSName("sidebar")
  def sidebar_JQuery(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  @JSName("sidebar")
  def sidebar_RegExpSettings(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  @JSName("sidebar")
  def sidebar_addbodyCSS(behavior: `add body CSS`): JQuery = js.native
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns direction of current sidebar
    */
  @JSName("sidebar")
  def sidebar_getdirection(behavior: `get direction`): String = js.native
  /**
    * Returns vendor prefixed transition end event
    */
  @JSName("sidebar")
  def sidebar_gettransitionevent(behavior: `get transition event`): String = js.native
  /**
    * Hides sidebar
    */
  @JSName("sidebar")
  def sidebar_hide(behavior: hide): JQuery = js.native
  /**
    * Returns whether sidebar is hidden
    */
  @JSName("sidebar")
  def sidebar_ishidden(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether sidebar is visible
    */
  @JSName("sidebar")
  def sidebar_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Returns page content to original position
    */
  @JSName("sidebar")
  def sidebar_pullpage(behavior: `pull page`): JQuery = js.native
  /**
    * Pushes page content to be visible alongside sidebar
    */
  @JSName("sidebar")
  def sidebar_pushpage(behavior: `push page`): JQuery = js.native
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  @JSName("sidebar")
  def sidebar_removebodyCSS(behavior: `remove body CSS`): JQuery = js.native
  @JSName("sidebar")
  def sidebar_setting(behavior: setting, value: SidebarSettings): JQuery = js.native
  /**
    * Shows sidebar
    */
  @JSName("sidebar")
  def sidebar_show(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of sidebar
    */
  @JSName("sidebar")
  def sidebar_toggle(behavior: toggle): JQuery = js.native
}

