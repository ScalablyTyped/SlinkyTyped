package typingsSlinky.xmlcreate.xmlAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlAttributeOptions extends js.Object {
  /**
    * The name of the attribute.
    */
  var name: String = js.native
  /**
    * Whether to replace any invalid characters in the name of the attribute
    * with the Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInName: js.UndefOr[Boolean] = js.native
}

object IXmlAttributeOptions {
  @scala.inline
  def apply(name: String): IXmlAttributeOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlAttributeOptions]
  }
  @scala.inline
  implicit class IXmlAttributeOptionsOps[Self <: IXmlAttributeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceInvalidCharsInName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceInvalidCharsInName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceInvalidCharsInName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceInvalidCharsInName")(js.undefined)
        ret
    }
  }
  
}

