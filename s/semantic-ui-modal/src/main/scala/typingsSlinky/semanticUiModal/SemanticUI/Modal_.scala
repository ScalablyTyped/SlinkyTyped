package typingsSlinky.semanticUiModal.SemanticUI

import typingsSlinky.semanticUiDimmer.SemanticUI.DimmerSettings
import typingsSlinky.semanticUiModal.JQuery
import typingsSlinky.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import typingsSlinky.semanticUiModal.SemanticUI.Modal.ErrorSettings
import typingsSlinky.semanticUiModal.SemanticUI.Modal.SelectorSettings
import typingsSlinky.semanticUiModal.semanticUiModalBooleans.`false`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`attach events`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`cache sizes`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`can fit`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`hide all`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`hide dimmer`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`hide others`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`is active`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`set active`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.`show dimmer`
import typingsSlinky.semanticUiModal.semanticUiModalStrings.allowMultiple
import typingsSlinky.semanticUiModal.semanticUiModalStrings.autofocus
import typingsSlinky.semanticUiModal.semanticUiModalStrings.className
import typingsSlinky.semanticUiModal.semanticUiModalStrings.closable
import typingsSlinky.semanticUiModal.semanticUiModalStrings.context
import typingsSlinky.semanticUiModal.semanticUiModalStrings.debug
import typingsSlinky.semanticUiModal.semanticUiModalStrings.destroy
import typingsSlinky.semanticUiModal.semanticUiModalStrings.detachable
import typingsSlinky.semanticUiModal.semanticUiModalStrings.dimmerSettings
import typingsSlinky.semanticUiModal.semanticUiModalStrings.duration
import typingsSlinky.semanticUiModal.semanticUiModalStrings.error
import typingsSlinky.semanticUiModal.semanticUiModalStrings.hide
import typingsSlinky.semanticUiModal.semanticUiModalStrings.keyboardShortcuts
import typingsSlinky.semanticUiModal.semanticUiModalStrings.name
import typingsSlinky.semanticUiModal.semanticUiModalStrings.namespace
import typingsSlinky.semanticUiModal.semanticUiModalStrings.observeChanges
import typingsSlinky.semanticUiModal.semanticUiModalStrings.offset
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onApprove
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onDeny
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onHidden
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onHide
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onShow
import typingsSlinky.semanticUiModal.semanticUiModalStrings.onVisible
import typingsSlinky.semanticUiModal.semanticUiModalStrings.performance
import typingsSlinky.semanticUiModal.semanticUiModalStrings.queue
import typingsSlinky.semanticUiModal.semanticUiModalStrings.refresh
import typingsSlinky.semanticUiModal.semanticUiModalStrings.selector
import typingsSlinky.semanticUiModal.semanticUiModalStrings.setting
import typingsSlinky.semanticUiModal.semanticUiModalStrings.show
import typingsSlinky.semanticUiModal.semanticUiModalStrings.silent
import typingsSlinky.semanticUiModal.semanticUiModalStrings.toggle
import typingsSlinky.semanticUiModal.semanticUiModalStrings.transition
import typingsSlinky.semanticUiModal.semanticUiModalStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal_ extends js.Object {
  var settings: ModalSettings = js.native
  def apply(): JQuery = js.native
  def apply(behavior: `attach events`, selector: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Caches current modal size
    */
  def apply(behavior: `cache sizes`): JQuery = js.native
  /**
    * Returns whether the modal can fit on the page
    */
  def apply(behavior: `can fit`): Boolean = js.native
  /**
    * Hides all visible modals in the same dimmer
    */
  def apply(behavior: `hide all`): JQuery = js.native
  /**
    * Hides associated page dimmer
    */
  def apply(behavior: `hide dimmer`): JQuery = js.native
  /**
    * Hides all modals not selected modal in a dimmer
    */
  def apply(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether the modal is active
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Sets modal to active
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Shows associated page dimmer
    */
  def apply(behavior: `show dimmer`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides the modal
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Refreshes centering of modal on page
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, name: allowMultiple, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowMultiple, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: autofocus, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: autofocus, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def apply(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: detachable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: detachable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: dimmerSettings, value: DimmerSettings): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: keyboardShortcuts, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: onApprove, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onApprove,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onDeny, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onDeny,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHidden, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHidden, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: queue, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: queue, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: ModalSettings): JQuery = js.native
  /**
    * Shows the modal
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles the modal
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: ModalSettings): JQuery = js.native
}

