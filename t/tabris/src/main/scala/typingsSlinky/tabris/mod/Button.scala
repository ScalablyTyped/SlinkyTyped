package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.ChildrenString
import typingsSlinky.tabris.anon.OmitButtonset
import typingsSlinky.tabris.tabrisStrings.alignment
import typingsSlinky.tabris.tabrisStrings.all
import typingsSlinky.tabris.tabrisStrings.autoCapitalize
import typingsSlinky.tabris.tabrisStrings.centerX
import typingsSlinky.tabris.tabrisStrings.default
import typingsSlinky.tabris.tabrisStrings.elevate
import typingsSlinky.tabris.tabrisStrings.flat
import typingsSlinky.tabris.tabrisStrings.font
import typingsSlinky.tabris.tabrisStrings.image
import typingsSlinky.tabris.tabrisStrings.imageTintColor
import typingsSlinky.tabris.tabrisStrings.left
import typingsSlinky.tabris.tabrisStrings.none
import typingsSlinky.tabris.tabrisStrings.outline
import typingsSlinky.tabris.tabrisStrings.right
import typingsSlinky.tabris.tabrisStrings.set
import typingsSlinky.tabris.tabrisStrings.strokeColor
import typingsSlinky.tabris.tabrisStrings.strokeWidth
import typingsSlinky.tabris.tabrisStrings.text
import typingsSlinky.tabris.tabrisStrings.textColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Button")
@js.native
class Button () extends Widget {
  def this(properties: Properties[Button, OmitButtonset]) = this()
  /**
    * The horizontal alignment of the button text.
    */
  var alignment: centerX | left | right = js.native
  /**
    * Control how the button text is capitalized.
    * * `'default'` - The platform decides on the capitalization
    * * `'none'` - The text is displayed unaltered
    * * `'all'` - Every letter is capitalized
    */
  var autoCapitalize: default | none | all = js.native
  /**
    * The font used for the button text.
    */
  var font: FontValue = js.native
  /**
    * An image to be displayed on the button.
    */
  var image: ImageValue = js.native
  /**
    * A color to change the `image` appearance. All opaque parts of the image will be tinted with the given
    * color. Set to `initial` to remove the effect.
    */
  var imageTintColor: ColorValue = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_Button: (JSXAttributes[this.type, Omit[this.type, set | typingsSlinky.tabris.tabrisStrings.jsxAttributes]]) with ChildrenString = js.native
  /**
    * Fired when the [*alignment*](#alignment) property has changed.
    */
  var onAlignmentChanged: ChangeListeners[this.type, alignment] = js.native
  /**
    * Fired when the [*autoCapitalize*](#autoCapitalize) property has changed.
    */
  var onAutoCapitalizeChanged: ChangeListeners[this.type, autoCapitalize] = js.native
  /**
    * Fired when the [*font*](#font) property has changed.
    */
  var onFontChanged: ChangeListeners[this.type, font] = js.native
  /**
    * Fired when the [*image*](#image) property has changed.
    */
  var onImageChanged: ChangeListeners[this.type, image] = js.native
  /**
    * Fired when the [*imageTintColor*](#imageTintColor) property has changed.
    */
  var onImageTintColorChanged: ChangeListeners[this.type, imageTintColor] = js.native
  /**
    * Fired when the button is pressed.
    */
  var onSelect: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*strokeColor*](#strokeColor) property has changed.
    */
  var onStrokeColorChanged: ChangeListeners[this.type, strokeColor] = js.native
  /**
    * Fired when the [*strokeWidth*](#strokeWidth) property has changed.
    */
  var onStrokeWidthChanged: ChangeListeners[this.type, strokeWidth] = js.native
  /**
    * Fired when the [*text*](#text) property has changed.
    */
  var onTextChanged: ChangeListeners[this.type, text] = js.native
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    */
  var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
  /**
    * Controls the line width of a button with the `style` _outline_.
    */
  var strokeColor: ColorValue = js.native
  /**
    * Controls the line color of a button with the `style` _outline_. Uses a platform-specific default if
    * set to `null`.
    */
  var strokeWidth: Double | Null = js.native
  /**
    * The `style` controls the appearance of a `Button` and has to be provided in its constructor. The
    * `default` style creates a platform specific button, which is flat on iOS and has an elevation and
    * shadow on Android. In addition the following specific style values can be used:
    * - `elevate` A button with a platform specific background color, elevation and a surrounding drop
    * shadow. Only supported on Android
    * - `flat` A button with no elevation and a platform specific background color
    * - `outline` A button with a transparent background and an outline stroke which can be controlled via
    * the properties `strokeWidth` and `strokeColor`
    * - `text` A button with no background and only consisting of its text label.
    * @constant
    */
  var style: default | elevate | flat | outline | text = js.native
  /**
    * The button's label text.
    */
  var text: String = js.native
  /**
    * The color of the text.
    */
  var textColor: ColorValue = js.native
}

