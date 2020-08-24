package typingsSlinky.semanticUiAccordion.SemanticUI

import typingsSlinky.semanticUiAccordion.JQuery
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.`close others`
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.animateChildren
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.className
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.close
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.closeNested
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.collapsible
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.debug
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.destroy
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.duration
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.easing
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.error
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.exclusive
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.name
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.namespace
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.observeChanges
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.on
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.onChange
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.onClose
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.onClosing
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.onOpen
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.onOpening
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.open
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.performance
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.refresh
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.selector
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.setting
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.silent
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.toggle
import typingsSlinky.semanticUiAccordion.semanticUiAccordionStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion_ extends js.Object {
  var settings: AccordionSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Closes accordion content that are not active
    */
  def apply(behavior: `close others`): JQuery = js.native
  /**
    * Closes accordion content at index
    */
  def apply(behavior: close, index: Double): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Opens accordion content at index
    */
  def apply(behavior: open, index: Double): JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, name: animateChildren, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: animateChildren, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closeNested, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: closeNested, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: collapsible, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: collapsible, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: easing, value: String): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: exclusive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onClose, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onClosing, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onClosing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOpening, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOpening, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOpen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: on, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: AccordionSettings): JQuery = js.native
  /**
    * Toggles accordion content at index
    */
  def apply(behavior: toggle, index: Double): JQuery = js.native
  def apply(settings: AccordionSettings): JQuery = js.native
}

