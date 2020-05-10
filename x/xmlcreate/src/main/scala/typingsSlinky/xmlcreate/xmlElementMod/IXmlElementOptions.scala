package typingsSlinky.xmlcreate.xmlElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlElementOptions extends js.Object {
  /**
    * The name of the element.
    */
  var name: String = js.native
  /**
    * Whether to replace any invalid characters in the name of the element
    * with the Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInName: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use a self-closing tag if this element is empty.
    *
    * For example, use:
    * ```xml
    * <element/>
    * ```
    * instead of:
    * ```xml
    * <element></element>
    * ```
    *
    * By default, this is enabled.
    */
  var useSelfClosingTagIfEmpty: js.UndefOr[Boolean] = js.native
}

object IXmlElementOptions {
  @scala.inline
  def apply(name: String): IXmlElementOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlElementOptions]
  }
  @scala.inline
  implicit class IXmlElementOptionsOps[Self <: IXmlElementOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withUseSelfClosingTagIfEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSelfClosingTagIfEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSelfClosingTagIfEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSelfClosingTagIfEmpty")(js.undefined)
        ret
    }
  }
  
}

