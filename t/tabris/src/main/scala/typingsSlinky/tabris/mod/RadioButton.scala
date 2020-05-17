package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.ChildrenString
import typingsSlinky.tabris.anon.OmitRadioButtonset
import typingsSlinky.tabris.tabrisStrings.checked
import typingsSlinky.tabris.tabrisStrings.checkedTintColor
import typingsSlinky.tabris.tabrisStrings.font
import typingsSlinky.tabris.tabrisStrings.set
import typingsSlinky.tabris.tabrisStrings.text
import typingsSlinky.tabris.tabrisStrings.textColor
import typingsSlinky.tabris.tabrisStrings.tintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "RadioButton")
@js.native
class RadioButton () extends Widget {
  def this(properties: Properties[RadioButton, OmitRadioButtonset]) = this()
  /**
    * The checked state of the radio button.
    */
  var checked: Boolean = js.native
  /**
    * The color of the selectable area in checked state. Will fall back to `tintColor` if not set.
    */
  var checkedTintColor: ColorValue = js.native
  /**
    * The font used for the text.
    */
  var font: FontValue = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_RadioButton: (JSXAttributes[this.type, Omit[this.type, set | typingsSlinky.tabris.tabrisStrings.jsxAttributes]]) with ChildrenString = js.native
  /**
    * Fired when the [*checked*](#checked) property has changed.
    */
  var onCheckedChanged: ChangeListeners[this.type, checked] = js.native
  /**
    * Fired when the [*checkedTintColor*](#checkedTintColor) property has changed.
    */
  var onCheckedTintColorChanged: ChangeListeners[this.type, checkedTintColor] = js.native
  /**
    * Fired when the [*font*](#font) property has changed.
    */
  var onFontChanged: ChangeListeners[this.type, font] = js.native
  /**
    * Fired when the radio button is selected or deselected by the user.
    */
  var onSelect: Listeners[RadioButtonSelectEvent[this.type]] = js.native
  /**
    * Fired when the [*text*](#text) property has changed.
    */
  var onTextChanged: ChangeListeners[this.type, text] = js.native
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    */
  var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
  /**
    * Fired when the [*tintColor*](#tintColor) property has changed.
    */
  var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
  /**
    * The label text of the radio button.
    */
  var text: String = js.native
  /**
    * The color of the text.
    */
  var textColor: ColorValue = js.native
  /**
    * The color of the selectable area.
    */
  var tintColor: ColorValue = js.native
}

