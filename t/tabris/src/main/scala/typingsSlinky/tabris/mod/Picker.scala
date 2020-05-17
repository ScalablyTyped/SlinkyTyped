package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.OmitPickerset
import typingsSlinky.tabris.anon.PartialPickPickeritemText
import typingsSlinky.tabris.tabrisStrings.borderColor
import typingsSlinky.tabris.tabrisStrings.default
import typingsSlinky.tabris.tabrisStrings.fill
import typingsSlinky.tabris.tabrisStrings.floatMessage
import typingsSlinky.tabris.tabrisStrings.font
import typingsSlinky.tabris.tabrisStrings.itemCount
import typingsSlinky.tabris.tabrisStrings.itemText
import typingsSlinky.tabris.tabrisStrings.message
import typingsSlinky.tabris.tabrisStrings.none
import typingsSlinky.tabris.tabrisStrings.outline
import typingsSlinky.tabris.tabrisStrings.selectionIndex
import typingsSlinky.tabris.tabrisStrings.set
import typingsSlinky.tabris.tabrisStrings.textColor
import typingsSlinky.tabris.tabrisStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Picker")
@js.native
class Picker () extends Widget {
  def this(properties: (Properties[Picker, OmitPickerset]) with PartialPickPickeritemText) = this()
  /**
    * The color of the Picker border. This can be the surrounding line or the underline of the Picker
    * depending on the `style` property.
    */
  var borderColor: ColorValue = js.native
  /**
    * Whether the hint message should float above the Picker when focus is gained.
    */
  var floatMessage: Boolean = js.native
  /**
    * The font used for the text inside the Picker.
    */
  var font: FontValue = js.native
  /**
    * The number of items to display.
    */
  var itemCount: Double = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_Picker: (JSXAttributes[this.type, Omit[this.type, set | typingsSlinky.tabris.tabrisStrings.jsxAttributes]]) with js.Object with PartialPickPickeritemText = js.native
  /**
    * A hint text that is displayed when the picker has no selection.
    */
  var message: String = js.native
  /**
    * Fired when the [*borderColor*](#borderColor) property has changed.
    */
  var onBorderColorChanged: ChangeListeners[this.type, borderColor] = js.native
  /**
    * Fired when the [*floatMessage*](#floatMessage) property has changed.
    */
  var onFloatMessageChanged: ChangeListeners[this.type, floatMessage] = js.native
  /**
    * Fired when the [*font*](#font) property has changed.
    */
  var onFontChanged: ChangeListeners[this.type, font] = js.native
  /**
    * Fired when the [*itemCount*](#itemCount) property has changed.
    */
  var onItemCountChanged: ChangeListeners[this.type, itemCount] = js.native
  /**
    * Fired when the [*itemText*](#itemText) property has changed.
    */
  var onItemTextChanged: ChangeListeners[this.type, itemText] = js.native
  /**
    * Fired when the [*message*](#message) property has changed.
    */
  var onMessageChanged: ChangeListeners[this.type, message] = js.native
  /**
    * Fired when an item was selected by the user.
    */
  var onSelect: Listeners[PickerSelectEvent[this.type]] = js.native
  /**
    * Fired when the [*selectionIndex*](#selectionIndex) property has changed.
    */
  var onSelectionIndexChanged: ChangeListeners[this.type, selectionIndex] = js.native
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    */
  var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
  /**
    * The index of the currently selected item.
    */
  var selectionIndex: Double = js.native
  /**
    * The visual appearance of the `Picker` widget.
    * With the `style` _outline_, _fill_ or _underline_ the message hint will float above the `Picker` on
    * Android. This behavior can be controlled with the property `floatMessage`. The `style` _none_ will
    * remove any background visualization, allowing to create a custom background. 
    * @constant
    */
  var style: default | fill | none | outline | underline = js.native
  /**
    * The color of the text.
    */
  var textColor: ColorValue = js.native
  /**
    * A function that returns the string to display for a given index.
    */
  def itemText(index: Double): String = js.native
}

