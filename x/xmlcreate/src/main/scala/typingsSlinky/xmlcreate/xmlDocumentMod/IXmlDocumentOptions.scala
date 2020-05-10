package typingsSlinky.xmlcreate.xmlDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDocumentOptions extends js.Object {
  /**
    * Whether to throw an exception if basic XML validation fails while
    * building the document.
    */
  var validation: js.UndefOr[Boolean] = js.native
}

object IXmlDocumentOptions {
  @scala.inline
  def apply(): IXmlDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlDocumentOptions]
  }
  @scala.inline
  implicit class IXmlDocumentOptionsOps[Self <: IXmlDocumentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
  }
  
}

