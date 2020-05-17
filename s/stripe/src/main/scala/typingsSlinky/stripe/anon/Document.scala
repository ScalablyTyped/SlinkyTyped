package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.accounts.IPersonDocumentCreateUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  /**
    * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
    */
  var additional_document: js.UndefOr[IPersonDocumentCreateUpdateOptions] = js.native
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[IPersonDocumentCreateUpdateOptions] = js.native
}

object Document {
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_document(value: IPersonDocumentCreateUpdateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_document: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_document")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: IPersonDocumentCreateUpdateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
  }
  
}

