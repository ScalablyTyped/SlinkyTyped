package typingsSlinky.spectrum.Spectrum

import typingsSlinky.tinycolor2.mod.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Allows the colorpicker to have no color as a value.
    * Will display a button to set selection to 'no color'.
    */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Sets which element the colorpicker container is appended to (default is "body").
    * This can be any valid object taken into the jQuery appendTo function.
    * Changing this can help resolve issues with opening the colorpicker in a modal dialog
    * or fixed position container, for instance.
    */
  var appendTo: js.UndefOr[js.Any] = js.native
  /**
    * You can prevent the colorpicker from showing up if you return false in the beforeShow event.
    * This event is ignored on a flat colorpicker.
    */
  var beforeShow: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  /**
    * Sets the text on the cancel button.
    */
  var cancelText: js.UndefOr[String] = js.native
  /**
    * Called as the original input changes. Only happens when the input is closed or the 'Choose' button is clicked.
    */
  var change: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  /**
    * Sets the text on the choose button.
    */
  var chooseText: js.UndefOr[String] = js.native
  /**
    * When clicking outside of the colorpicker,
    *  force it to fire a change event rather than having it revert the change.
    */
  var clickoutFiresChange: js.UndefOr[Boolean] = js.native
  /**
    * The initial color can be set with the color option.
    * if you don't pass in a color, Spectrum will use the value attribute on the input.
    * The input is a string that is parsed using https://github.com/bgrins/TinyColor
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Adds an additional class name to the just the container element.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Automatically disables the colorpicker.
    * Additionally, if the input that you initialize spectrum on is disabled, this will be the default value.
    * Note: you cannot enable spectrum if the input is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The colorpicker will always show up at full size, and be positioned as an inline-block element.
    */
  var flat: js.UndefOr[Boolean] = js.native
  /**
    * Called after the colorpicker is hidden.
    * This happens when clicking outside of the picker while it is open.
    * Note, when any colorpicker on the page is shown it will hide any that are already open.
    * This event is ignored on a flat colorpicker.
    */
  var hide: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  /**
    * Automatically hides the colorpicker after a palette color is selected.
    */
  var hideAfterPaletteSelect: js.UndefOr[Boolean] = js.native
  /**
    * The users selection will be saved in the browser's localStorage object.
    * Any Spectrum with the same string will share the selection.
    */
  var localStorageKey: js.UndefOr[String] = js.native
  //same as JQuery appendTo : JQuery| any[] | Element| string
  /**
    * Sets the max size for the palette.
    */
  var maxSelectionSize: js.UndefOr[Double] = js.native
  /**
    * Called as the user moves around within the colorpicker.
    */
  var move: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  /**
    * Sets a palette below the colorpicker to make it convenient for users to choose from
    *  frequently or recently used colors.
    * Default value:  [["#ffffff", "#000000", "#ff0000", "#ff8000", "#ffff00", "#008000", "#0000ff", "#4b0082", "#9400d3"]]
    */
  var palette: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    * Sets the format that is displayed in the text box.
    * This will also change the format that is displayed in the titles from the palette swatches.
    * Possible values: "hex", "hex3", "hsl", "rgb", "name"
    */
  var preferredFormat: js.UndefOr[String] = js.native
  /**
    * Adds an additional class name to just the replacer element.
    */
  var replacerClassName: js.UndefOr[String] = js.native
  /**
    */
  var selectionPalette: js.UndefOr[js.Array[String]] = js.native
  /**
    * Called after the colorpicker is opened. This is ignored on a flat colorpicker.
    * Note, when any colorpicker on the page is shown it will hide any that are already open.
    */
  var show: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  /**
    * Allows alpha transparency selection
    */
  var showAlpha: js.UndefOr[Boolean] = js.native
  /**
    * Toggles the choose/cancel buttons.
    * If there are no buttons, the behavior will be to fire the `change` event (and update the original input) when the picker is closed.
    */
  var showButtons: js.UndefOr[Boolean] = js.native
  /**
    * Shows the color that was initially set when opening.
    * This provides an easy way to click back to what was set when opened.
    */
  var showInitial: js.UndefOr[Boolean] = js.native
  /**
    * Adds an input to allow for free form typing.
    */
  var showInput: js.UndefOr[Boolean] = js.native
  /**
    * When the colorpicker is closed, the current color will be added to the palette if it isn't there already.
    */
  var showPalette: js.UndefOr[Boolean] = js.native
  /**
    * Shows only the colors specified in the palette
    */
  var showPaletteOnly: js.UndefOr[Boolean] = js.native
  /**
    * Keeps track of what has been selected by the user.
    */
  var showSelectionPalette: js.UndefOr[Boolean] = js.native
  /**
    * Changes the text on the close-toggle colorpicker button.
    */
  var togglePaletteLessText: js.UndefOr[String] = js.native
  /**
    * Changes the text on the open-toggle colorpicker button.
    */
  var togglePaletteMoreText: js.UndefOr[String] = js.native
  /**
    * Shows a button to toggle the colorpicker next to the palette.
    * This way, the user can choose from a limited number of colors in the palette,
    * but still be able to pick a color that's not in the palette.
    */
  var togglePaletteOnly: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: /* color */ Instance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* color */ Instance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withChooseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChooseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseText")(js.undefined)
        ret
    }
    @scala.inline
    def withClickoutFiresChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickoutFiresChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickoutFiresChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickoutFiresChange")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFlat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: /* color */ Instance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAfterPaletteSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAfterPaletteSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAfterPaletteSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAfterPaletteSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalStorageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSelectionSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelectionSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSelectionSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelectionSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: /* color */ Instance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionPalette(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPalette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPalette")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* color */ Instance => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInitial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInitial")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInput")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPalette(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPalette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPalette")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPaletteOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPaletteOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPaletteOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPaletteOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSelectionPalette(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionPalette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSelectionPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionPalette")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglePaletteLessText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePaletteLessText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglePaletteLessText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePaletteLessText")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglePaletteMoreText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePaletteMoreText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglePaletteMoreText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePaletteMoreText")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglePaletteOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePaletteOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglePaletteOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePaletteOnly")(js.undefined)
        ret
    }
  }
  
}

