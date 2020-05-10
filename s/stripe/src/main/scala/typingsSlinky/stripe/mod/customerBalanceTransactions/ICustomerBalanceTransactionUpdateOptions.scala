package typingsSlinky.stripe.mod.customerBalanceTransactions

import typingsSlinky.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerBalanceTransactionUpdateOptions extends js.Object {
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
}

object ICustomerBalanceTransactionUpdateOptions {
  @scala.inline
  def apply(): ICustomerBalanceTransactionUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomerBalanceTransactionUpdateOptions]
  }
  @scala.inline
  implicit class ICustomerBalanceTransactionUpdateOptionsOps[Self <: ICustomerBalanceTransactionUpdateOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

