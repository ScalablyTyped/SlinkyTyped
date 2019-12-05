package typingsSlinky.tooltipster

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.tooltipster.JQueryTooltipster.ITooltipStatus
import typingsSlinky.tooltipster.JQueryTooltipster.ITooltipsterInstance
import typingsSlinky.tooltipster.JQueryTooltipster.ITooltipsterJQuery
import typingsSlinky.tooltipster.JQueryTooltipster.ITooltipsterOptions
import typingsSlinky.tooltipster.JQueryTooltipster.TooltipsterStandardCallbackFunction
import typingsSlinky.tooltipster.tooltipsterStrings.close
import typingsSlinky.tooltipster.tooltipsterStrings.content
import typingsSlinky.tooltipster.tooltipsterStrings.destroy
import typingsSlinky.tooltipster.tooltipsterStrings.disable
import typingsSlinky.tooltipster.tooltipsterStrings.elementOrigin
import typingsSlinky.tooltipster.tooltipsterStrings.elementTooltip
import typingsSlinky.tooltipster.tooltipsterStrings.enable
import typingsSlinky.tooltipster.tooltipsterStrings.instance
import typingsSlinky.tooltipster.tooltipsterStrings.off
import typingsSlinky.tooltipster.tooltipsterStrings.on
import typingsSlinky.tooltipster.tooltipsterStrings.one
import typingsSlinky.tooltipster.tooltipsterStrings.open
import typingsSlinky.tooltipster.tooltipsterStrings.option
import typingsSlinky.tooltipster.tooltipsterStrings.reposition
import typingsSlinky.tooltipster.tooltipsterStrings.status
import typingsSlinky.tooltipster.tooltipsterStrings.triggerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("tooltipster")
  var tooltipster_Original: ITooltipsterJQuery = js.native
  /** Activates Tooltipster */
  def tooltipster(): JQuery = js.native
  def tooltipster(options: ITooltipsterOptions): JQuery = js.native
  /**
  		 * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
  		 * DOM). The `callback` function argument is optional.
  		 */
  @JSName("tooltipster")
  def tooltipster_close(method: close): JQuery = js.native
  @JSName("tooltipster")
  def tooltipster_close(method: close, callback: TooltipsterStandardCallbackFunction): JQuery = js.native
  /**
  		 * Returns a tooltip's current content. If the selector matches multiple origins, only the value of the first 
  		 * will be returned.
  		 */
  @JSName("tooltipster")
  def tooltipster_content(method: content): js.Any = js.native
  /**
  		 * Updates the tooltip's content.
  		 * @param value the new content of the tooltip
  		 */
  @JSName("tooltipster")
  def tooltipster_content(method: content, value: String): JQuery = js.native
  /**
  		 * Closes and destroys the tooltip functionality.
  		 */
  @JSName("tooltipster")
  def tooltipster_destroy(method: destroy): JQuery = js.native
  /**
  		 * Temporarily disables a tooltip from being able to open.
  		 */
  @JSName("tooltipster")
  def tooltipster_disable(method: disable): JQuery = js.native
  /**
  		 * Returns the HTML element which has been tooltipped.
  		 */
  @JSName("tooltipster")
  def tooltipster_elementOrigin(method: elementOrigin): HTMLElement = js.native
  /**
  		 * Returns the HTML root element of the tooltip if it is open, `null` if it is closed.
  		 */
  @JSName("tooltipster")
  def tooltipster_elementTooltip(method: elementTooltip): HTMLElement | Null = js.native
  /**
  		 * If a tooltip was disabled, restores its previous functionality.
  		 */
  @JSName("tooltipster")
  def tooltipster_enable(method: enable): JQuery = js.native
  /**
  		 * Returns the instance of Tooltipster associated to the tooltip. If the selector matches multiple origins, 
  		 * only the instance of the first will be returned.
  		 */
  @JSName("tooltipster")
  def tooltipster_instance(method: instance): ITooltipsterInstance = js.native
  /**
  		 * Handle Tooltipster's `off` event coming from any instance.
  		 */
  @JSName("tooltipster")
  def tooltipster_off(method: off, eventName: String): JQuery = js.native
  /**
  		 * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
  		 * for a complete description of available events.
  		 */
  @JSName("tooltipster")
  def tooltipster_on(method: on, eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): JQuery = js.native
  /**
  		 * Handle Tooltipster's `one` event coming from any instance.
  		 */
  @JSName("tooltipster")
  def tooltipster_one(method: one, eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): JQuery = js.native
  /**
  		 * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
  		 * is called when the opening animation has ended
  		 */
  @JSName("tooltipster")
  def tooltipster_open(method: open): JQuery = js.native
  @JSName("tooltipster")
  def tooltipster_open(method: open, callback: TooltipsterStandardCallbackFunction): JQuery = js.native
  /**
  		 * Returns the value of an option.
  		 */
  @JSName("tooltipster")
  def tooltipster_option(method: option, optionName: String): js.Any = js.native
  /**
  		 * Sets the value of an option (for advanced users only; we do not provide support on unexpected results).
  		 */
  @JSName("tooltipster")
  def tooltipster_option(method: option, optionName: String, optionValue: js.Any): JQuery = js.native
  /**
  		 * Resizes and repositions the tooltip.
  		 */
  @JSName("tooltipster")
  def tooltipster_reposition(method: reposition): JQuery = js.native
  /**
  		 * Returns various information about the tooltip, like whether it is open or not. See 
  		 * http://iamceege.github.io/tooltipster/#status
  		 */
  @JSName("tooltipster")
  def tooltipster_status(method: status): ITooltipStatus = js.native
  /**
  		 * Trigger a Tooltipster's event coming from any instance.
  		 */
  @JSName("tooltipster")
  def tooltipster_triggerHandler(method: triggerHandler, eventName: String): JQuery = js.native
}

