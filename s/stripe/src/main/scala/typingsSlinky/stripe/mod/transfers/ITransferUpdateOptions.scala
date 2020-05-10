package typingsSlinky.stripe.mod.transfers

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransferUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * An arbitrary string which you can attach to a transfer object. It is
    * displayed when in the web interface alongside the transfer. This
    * can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
}

object ITransferUpdateOptions {
  @scala.inline
  def apply(): ITransferUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransferUpdateOptions]
  }
  @scala.inline
  implicit class ITransferUpdateOptionsOps[Self <: ITransferUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

