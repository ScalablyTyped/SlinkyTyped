package typingsSlinky.stripe.mod.creditNotes

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreditNoteUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Credit note memo. This can be unset by updating the value to nil and then saving.
    */
  var memo: js.UndefOr[String] = js.native
}

object ICreditNoteUpdateOptions {
  @scala.inline
  def apply(): ICreditNoteUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreditNoteUpdateOptions]
  }
  @scala.inline
  implicit class ICreditNoteUpdateOptionsOps[Self <: ICreditNoteUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(js.undefined)
        ret
    }
  }
  
}

