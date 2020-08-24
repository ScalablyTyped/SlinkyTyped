package typingsSlinky.semanticUiAccordion

import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import typingsSlinky.semanticUiAccordion.SemanticUI.AccordionSettings
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
trait JQuery extends js.Object {
  @JSName("accordion")
  var accordion_Original: Accordion = js.native
  def accordion(): JQuery = js.native
  def accordion(behavior: setting, name: animateChildren, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: animateChildren, value: Boolean): JQuery = js.native
  def accordion(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def accordion(behavior: setting, name: closeNested, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: closeNested, value: Boolean): JQuery = js.native
  def accordion(behavior: setting, name: collapsible, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: collapsible, value: Boolean): JQuery = js.native
  def accordion(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def accordion(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def accordion(behavior: setting, name: duration, value: Double): JQuery = js.native
  def accordion(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
  def accordion(behavior: setting, name: easing, value: String): JQuery = js.native
  def accordion(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def accordion(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def accordion(behavior: setting, name: exclusive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def accordion(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def accordion(behavior: setting, name: namespace, value: String): JQuery = js.native
  def accordion(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def accordion(behavior: setting, name: name, value: String): JQuery = js.native
  def accordion(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def accordion(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def accordion(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def accordion(behavior: setting, name: onClose, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def accordion(behavior: setting, name: onClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def accordion(behavior: setting, name: onClosing, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def accordion(behavior: setting, name: onClosing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def accordion(behavior: setting, name: onOpening, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def accordion(behavior: setting, name: onOpening, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def accordion(behavior: setting, name: onOpen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def accordion(behavior: setting, name: onOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def accordion(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): String = js.native
  def accordion(behavior: setting, name: on, value: String): JQuery = js.native
  def accordion(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def accordion(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def accordion(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def accordion(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def accordion(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def accordion(settings: AccordionSettings): JQuery = js.native
  @JSName("accordion")
  def accordion_ClassNameSettings(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  @JSName("accordion")
  def accordion_SelectorSettings(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  /**
    * Closes accordion content at index
    */
  @JSName("accordion")
  def accordion_close(behavior: close, index: Double): JQuery = js.native
  /**
    * Closes accordion content that are not active
    */
  @JSName("accordion")
  def accordion_closeothers(behavior: `close others`): JQuery = js.native
  @JSName("accordion")
  def accordion_destroy(behavior: destroy): JQuery = js.native
  /**
    * Opens accordion content at index
    */
  @JSName("accordion")
  def accordion_open(behavior: open, index: Double): JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  @JSName("accordion")
  def accordion_refresh(behavior: refresh): JQuery = js.native
  @JSName("accordion")
  def accordion_setting(behavior: setting, value: AccordionSettings): JQuery = js.native
  /**
    * Toggles accordion content at index
    */
  @JSName("accordion")
  def accordion_toggle(behavior: toggle, index: Double): JQuery = js.native
}

