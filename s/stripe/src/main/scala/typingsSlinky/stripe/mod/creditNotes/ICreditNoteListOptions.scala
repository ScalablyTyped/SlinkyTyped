package typingsSlinky.stripe.mod.creditNotes

import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreditNoteListOptions extends IListOptions {
  /**
    * ID of the invoice.
    */
  var invoice: js.UndefOr[String] = js.native
}

object ICreditNoteListOptions {
  @scala.inline
  def apply(): ICreditNoteListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreditNoteListOptions]
  }
  @scala.inline
  implicit class ICreditNoteListOptionsOps[Self <: ICreditNoteListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvoice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(js.undefined)
        ret
    }
  }
  
}

