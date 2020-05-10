package typingsSlinky.xmlcreate.xmlAttributeTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlAttributeTextOptions extends js.Object {
  /**
    * The attribute text.
    */
  var charData: String = js.native
  /**
    * Whether to replace any invalid characters in the attribute text with the
    * Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.native
}

object IXmlAttributeTextOptions {
  @scala.inline
  def apply(charData: String): IXmlAttributeTextOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlAttributeTextOptions]
  }
  @scala.inline
  implicit class IXmlAttributeTextOptionsOps[Self <: IXmlAttributeTextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceInvalidCharsInCharData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceInvalidCharsInCharData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceInvalidCharsInCharData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceInvalidCharsInCharData")(js.undefined)
        ret
    }
  }
  
}

