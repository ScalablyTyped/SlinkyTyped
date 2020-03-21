package typingsSlinky.semanticUiPopup.SemanticUI

import typingsSlinky.semanticUiPopup.JQuery
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typingsSlinky.semanticUiPopup.semanticUiPopupBooleans.`false`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`bind clickaway`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`bind close on scroll`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`bind touch close`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`change content`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`get popup`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`hide all`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`inline`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`is hidden`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`is visible`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`remove popup`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`set position`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.addTouchEvents
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.adjacent
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.auto
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.boundary
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.className
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.click
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.closable
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.content
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.context
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.debug
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.delay
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.destroy
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.distanceAway
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.duration
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.error
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.exclusive
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.exists
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.focus
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hide
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hideOnScroll
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hover
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hoverable
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.html
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.jitter
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.lastResort
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.manual
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.maxSearchDepth
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.metadata
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.movePopup
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.name
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.namespace
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.observeChanges
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.offset
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.on
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onCreate
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onHidden
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onHide
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onRemove
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onShow
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onUnplaceable
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onVisible
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.opposite
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.performance
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.popup
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.position
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.prefer
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.preserve
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.reposition
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.scrollContext
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.selector
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.setFluidWidth
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.setting
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.show
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.silent
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.target
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.title
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.toggle
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.transition
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.variation
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup_ extends js.Object {
  var settings: PopupSettings = js.native
  def apply(): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind clickaway`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind close on scroll`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind touch close`): JQuery = js.native
  /**
    * Changes current popup content
    */
  def apply(behavior: `change content`, html: String): JQuery = js.native
  /**
    * Returns current popup dom element
    */
  def apply(behavior: `get popup`): JQuery = js.native
  /**
    * Hides all visible pop ups on the page
    */
  def apply(behavior: `hide all`): JQuery = js.native
  /**
    * Returns whether popup is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether popup is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes popup from the page
    */
  def apply(behavior: `remove popup`): JQuery = js.native
  /**
    * Repositions a popup
    */
  def apply(behavior: `set position`, position: String): JQuery = js.native
  /**
    * Removes popup from the page and removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Returns whether popup is created and inserted into the page
    */
  def apply(behavior: exists): Boolean = js.native
  /**
    * Hides popup
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  def apply(behavior: reposition): JQuery = js.native
  def apply(behavior: setting, name: `inline`): Boolean = js.native
  def apply(behavior: setting, name: `inline`, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: addTouchEvents): Boolean = js.native
  def apply(behavior: setting, name: addTouchEvents, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: boundary): String | JQuery = js.native
  def apply(behavior: setting, name: boundary, value: String): JQuery = js.native
  def apply(behavior: setting, name: boundary, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closable): Boolean = js.native
  def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: content): String = js.native
  def apply(behavior: setting, name: content, value: String): JQuery = js.native
  def apply(behavior: setting, name: context): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: delay): DelaySettings = js.native
  def apply(behavior: setting, name: delay, value: DelaySettings): JQuery = js.native
  def apply(behavior: setting, name: distanceAway): Double = js.native
  def apply(behavior: setting, name: distanceAway, value: Double): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: exclusive): Boolean = js.native
  def apply(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: hideOnScroll): auto | `false` = js.native
  def apply(behavior: setting, name: hideOnScroll, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: hideOnScroll, value: auto): JQuery = js.native
  def apply(behavior: setting, name: hoverable): Boolean = js.native
  def apply(behavior: setting, name: hoverable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: html): String | JQuery = js.native
  def apply(behavior: setting, name: html, value: String): JQuery = js.native
  def apply(behavior: setting, name: html, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: jitter): Double = js.native
  def apply(behavior: setting, name: jitter, value: Double): JQuery = js.native
  def apply(behavior: setting, name: lastResort): Boolean | String = js.native
  def apply(behavior: setting, name: lastResort, value: String): JQuery = js.native
  def apply(behavior: setting, name: lastResort, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: maxSearchDepth): Double = js.native
  def apply(behavior: setting, name: maxSearchDepth, value: Double): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: movePopup): Boolean = js.native
  def apply(behavior: setting, name: movePopup, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: on): focus | click | hover | manual = js.native
  def apply(behavior: setting, name: onCreate): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHidden): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onHidden,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHide): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onRemove): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onShow): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onShow,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onUnplaceable): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onUnplaceable,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onVisible): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: on, value: click): JQuery = js.native
  def apply(behavior: setting, name: on, value: focus): JQuery = js.native
  def apply(behavior: setting, name: on, value: hover): JQuery = js.native
  def apply(behavior: setting, name: on, value: manual): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: popup): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: popup, value: String): JQuery = js.native
  def apply(behavior: setting, name: popup, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: popup, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: position): String = js.native
  def apply(behavior: setting, name: position, value: String): JQuery = js.native
  def apply(behavior: setting, name: prefer): adjacent | opposite = js.native
  def apply(behavior: setting, name: prefer, value: adjacent): JQuery = js.native
  def apply(behavior: setting, name: prefer, value: opposite): JQuery = js.native
  def apply(behavior: setting, name: preserve): Boolean = js.native
  def apply(behavior: setting, name: preserve, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: scrollContext): String | JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: String): JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: setFluidWidth): Boolean = js.native
  def apply(behavior: setting, name: setFluidWidth, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: target): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: target, value: String): JQuery = js.native
  def apply(behavior: setting, name: target, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: target, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: title): String = js.native
  def apply(behavior: setting, name: title, value: String): JQuery = js.native
  def apply(behavior: setting, name: transition): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: variation): String = js.native
  def apply(behavior: setting, name: variation, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: PopupSettings): JQuery = js.native
  /**
    * Shows popup
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of popup
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: PopupSettings): JQuery = js.native
}

