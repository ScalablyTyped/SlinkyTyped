package typingsSlinky.spectrum

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.spectrum.Spectrum.Options
import typingsSlinky.spectrum.spectrumStrings.container
import typingsSlinky.spectrum.spectrumStrings.destroy
import typingsSlinky.spectrum.spectrumStrings.disable
import typingsSlinky.spectrum.spectrumStrings.dragstartDotspectrum
import typingsSlinky.spectrum.spectrumStrings.dragstopDotspectrum
import typingsSlinky.spectrum.spectrumStrings.enable
import typingsSlinky.spectrum.spectrumStrings.get
import typingsSlinky.spectrum.spectrumStrings.hide
import typingsSlinky.spectrum.spectrumStrings.option
import typingsSlinky.spectrum.spectrumStrings.reflow
import typingsSlinky.spectrum.spectrumStrings.set
import typingsSlinky.spectrum.spectrumStrings.show
import typingsSlinky.spectrum.spectrumStrings.toggle
import typingsSlinky.tinycolor2.mod.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Called at the beginning of a drag event on either hue slider, alpha slider, or main color picker areas.
    */
  @JSName("on")
  def on_dragstartspectrum(
    events: dragstartDotspectrum,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* color */ Instance, _]
  ): JQuery = js.native
  /**
    * Called at the end of a drag event on either hue slider, alpha slider, or main color picker areas.
    */
  @JSName("on")
  def on_dragstopspectrum(
    events: dragstopDotspectrum,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* color */ Instance, _]
  ): JQuery = js.native
  
  // in most cases this is JQuery except for the get method which returns a tinycolorInstance
  /**
    * Initializes the input element that it is called on
    * as a spectrum colorpicker instance.
    */
  def spectrum(): JQuery = js.native
  /**
    * Calls the method.
    */
  def spectrum(methodName: String): js.Any = js.native
  def spectrum(options: Options): JQuery = js.native
  /**
    * Retrieves the container element of the colorpicker,
    * in case you want to manaully position it or do other things.
    */
  @JSName("spectrum")
  def spectrum_container(methodName: container): JQuery = js.native
  /**
    * Removes the colorpicker functionality and restores the element to its original state.
    */
  @JSName("spectrum")
  def spectrum_destroy(methodName: destroy): JQuery = js.native
  /**
    * Disables selection of the colorpicker component. adds the sp-disabled class onto the replacer element.
    * If it is already disabled, this method does nothing.
    * Additionally, this will remove the disabled property on the original (now hidden).
    */
  @JSName("spectrum")
  def spectrum_disable(methodName: disable): JQuery = js.native
  /**
    * Allows selection of the colorpicker component. if it is already enabled, this method does nothing.
    * Additionally, this will cause the original (now hidden) input to be set as disabled.
    */
  @JSName("spectrum")
  def spectrum_enable(methodName: enable): JQuery = js.native
  /**
    * Gets the current value from the colorpicker.
    */
  @JSName("spectrum")
  def spectrum_get(methodName: get): Instance = js.native
  /**
    * Hides the colorpicker.
    */
  @JSName("spectrum")
  def spectrum_hide(methodName: hide): JQuery = js.native
  /**
    * Retrieves the current value for the option name.
    *
    * @param optionName- the option to retrieve the value for.
    */
  @JSName("spectrum")
  def spectrum_option(methodName: option): JQuery = js.native
  @JSName("spectrum")
  def spectrum_option(methodName: option, optionName: js.UndefOr[scala.Nothing], newOptionValue: js.Any): JQuery = js.native
  @JSName("spectrum")
  def spectrum_option(methodName: option, optionName: String): JQuery = js.native
  @JSName("spectrum")
  def spectrum_option(methodName: option, optionName: String, newOptionValue: js.Any): JQuery = js.native
  /**
    * Resets the positioning of the container element.
    * This could be used if the colorpicker was hidden when initialized,
    * or if the colorpicker is inside of a moving area.
    */
  @JSName("spectrum")
  def spectrum_reflow(methodName: reflow): JQuery = js.native
  /**
    * Sets the colorpickers value to update the original input.
    * Note: this will not fire the `change` event, to prevent infinite loops
    *  from calling `set` from within `change`.
    *
    * @param colorString- the new color for the colorpicker.
    */
  @JSName("spectrum")
  def spectrum_set(methodName: set): JQuery = js.native
  @JSName("spectrum")
  def spectrum_set(methodName: set, colorString: String): JQuery = js.native
  /**
    * Shows the colorpicker.
    */
  @JSName("spectrum")
  def spectrum_show(methodName: show): JQuery = js.native
  /**
    * Toggles the colorpicker.
    *
    * Warning: If you are calling toggle from a click handler,
    *   make sure you return false to prevent the colorpicker from immediately hiding after it is toggled.
    */
  @JSName("spectrum")
  def spectrum_toggle(methodName: toggle): JQuery = js.native
}
