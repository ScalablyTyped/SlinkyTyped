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

@js.native
trait FontConfigElement extends js.Object {
  /**
    * The name of the font family
    * @example 'Times New Roman'
    */
  var family: js.UndefOr[String] = js.native
  /**
    * A src value pointing to your custom font file.
    * @example
    * 'url(https://somewebsite.com/path/to/font.woff)'
    * 'url(path/to/font.woff)'
    */
  var src: js.UndefOr[String] = js.native
  /**
    * The style of the text
    * @default 'normal'
    */
  var style: js.UndefOr[normal | italic | oblique] = js.native
  /**
    * A unicode range for the font that should be used
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face/unicode-range
    */
  var unicodeRange: js.UndefOr[String] = js.native
  /**
    * The weight of the font
    * NOTE: This cannot be a number!
    */
  var weight: js.UndefOr[initial | inherit | bold | bolder | lighter | normal | revert | unset] = js.native
}

object FontConfigElement {
  @scala.inline
  def apply(): FontConfigElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontConfigElement]
  }
  @scala.inline
  implicit class FontConfigElementOps[Self <: FontConfigElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: normal | italic | oblique): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: initial | inherit | bold | bolder | lighter | normal | revert | unset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

