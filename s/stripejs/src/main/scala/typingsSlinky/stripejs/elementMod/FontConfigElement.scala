package typingsSlinky.stripejs.elementMod

import typingsSlinky.stripejs.stripejsStrings.bold
import typingsSlinky.stripejs.stripejsStrings.bolder
import typingsSlinky.stripejs.stripejsStrings.inherit
import typingsSlinky.stripejs.stripejsStrings.initial
import typingsSlinky.stripejs.stripejsStrings.italic
import typingsSlinky.stripejs.stripejsStrings.lighter
import typingsSlinky.stripejs.stripejsStrings.normal
import typingsSlinky.stripejs.stripejsStrings.oblique
import typingsSlinky.stripejs.stripejsStrings.revert
import typingsSlinky.stripejs.stripejsStrings.unset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontConfigElement extends js.Object {
  /**
    * The name of the font family
    * @example 'Times New Roman'
    */
  var family: js.UndefOr[String] = js.undefined
  /**
    * A src value pointing to your custom font file.
    * @example
    * 'url(https://somewebsite.com/path/to/font.woff)'
    * 'url(path/to/font.woff)'
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * The style of the text
    * @default 'normal'
    */
  var style: js.UndefOr[normal | italic | oblique] = js.undefined
  /**
    * A unicode range for the font that should be used
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face/unicode-range
    */
  var unicodeRange: js.UndefOr[String] = js.undefined
  /**
    * The weight of the font
    * NOTE: This cannot be a number!
    */
  var weight: js.UndefOr[initial | inherit | bold | bolder | lighter | normal | revert | unset] = js.undefined
}

object FontConfigElement {
  @scala.inline
  def apply(
    family: String = null,
    src: String = null,
    style: normal | italic | oblique = null,
    unicodeRange: String = null,
    weight: initial | inherit | bold | bolder | lighter | normal | revert | unset = null
  ): FontConfigElement = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontConfigElement]
  }
}

