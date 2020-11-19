package typingsSlinky.semanticUiDimmer.SemanticUI

import typingsSlinky.semanticUiDimmer.JQuery
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typingsSlinky.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`add content`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`get dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`get duration`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`has dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is active`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is animating`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is dimmable`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is disabled`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is enabled`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is page dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is page`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set active`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set dimmable`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set dimmed`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set disabled`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set opacity`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set page dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.auto
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.className
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.click
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.closable
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.create
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.debug
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.destroy
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.dimmerName
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.duration
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.error
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.hide
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.hover
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.name
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.namespace
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.on
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.onChange
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.onHide
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.onShow
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.opacity
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.performance
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.selector
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.setting
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.show
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.silent
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.template
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.toggle
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.transition
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.useCSS
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.variation
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimmer_ extends js.Object {
  
  def apply(): JQuery = js.native
  /**
    * Detaches a given element from DOM and reattaches element inside dimmer
    */
  def apply(behavior: `add content`, element: String): JQuery = js.native
  def apply(behavior: `add content`, element: JQuery): JQuery = js.native
  /**
    * Returns DOM element for dimmer
    */
  def apply(behavior: `get dimmer`): JQuery = js.native
  /**
    * Returns current duration for show or hide event depending on current visibility
    */
  def apply(behavior: `get duration`): Double = js.native
  /**
    * Returns whether current dimmable has a dimmer
    */
  def apply(behavior: `has dimmer`): Boolean = js.native
  /**
    * Whether section's dimmer is active
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Whether dimmer is animating
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Whether current element is a dimmable section
    */
  def apply(behavior: `is dimmable`): Boolean = js.native
  /**
    * Whether current element is a dimmer
    */
  def apply(behavior: `is dimmer`): Boolean = js.native
  /**
    * Whether dimmer is disabled
    */
  def apply(behavior: `is disabled`): Boolean = js.native
  /**
    * Whether dimmer is not disabled
    */
  def apply(behavior: `is enabled`): Boolean = js.native
  /**
    * Whether dimmer is a page dimmer
    */
  def apply(behavior: `is page dimmer`): Boolean = js.native
  /**
    * Whether dimmable section is body
    */
  def apply(behavior: `is page`): Boolean = js.native
  /**
    * Sets page dimmer to active
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets an element as a dimmable section
    */
  def apply(behavior: `set dimmable`): JQuery = js.native
  /**
    * Sets a dimmable section as dimmed
    */
  def apply(behavior: `set dimmed`): JQuery = js.native
  /**
    * Sets a dimmer as disabled
    */
  def apply(behavior: `set disabled`): JQuery = js.native
  /**
    * Changes dimmer opacity
    */
  def apply(behavior: `set opacity`, opacity: Double): JQuery = js.native
  /**
    * Sets current dimmer as a page dimmer
    */
  def apply(behavior: `set page dimmer`): JQuery = js.native
  /**
    * Creates a new dimmer in dimmable context
    */
  def apply(behavior: create): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides dimmer
    */
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: closable, value: auto): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: dimmerName, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: dimmerName, value: String): JQuery = js.native
  def apply(behavior: setting, name: dimmerName, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: duration, value: DurationSettings): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): `false` | hover | click = js.native
  def apply(behavior: setting, name: on, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: on, value: click): JQuery = js.native
  def apply(behavior: setting, name: on, value: hover): JQuery = js.native
  def apply(behavior: setting, name: opacity, value: js.UndefOr[scala.Nothing]): auto | Double = js.native
  def apply(behavior: setting, name: opacity, value: Double): JQuery = js.native
  def apply(behavior: setting, name: opacity, value: auto): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: template, value: js.UndefOr[scala.Nothing]): TemplateSettings = js.native
  def apply(behavior: setting, name: template, value: TemplateSettings): JQuery = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: useCSS, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: useCSS, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: variation, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: variation, value: String): JQuery = js.native
  def apply(behavior: setting, name: variation, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: DimmerSettings): JQuery = js.native
  /**
    * Shows dimmer
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles current dimmer visibility
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: DimmerSettings): JQuery = js.native
  
  var settings: DimmerSettings = js.native
}
