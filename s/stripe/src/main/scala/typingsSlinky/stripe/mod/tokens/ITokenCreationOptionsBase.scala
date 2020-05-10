package typingsSlinky.stripe.mod.tokens

import typingsSlinky.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenCreationOptionsBase extends IDataOptions {
  /**
    * The customer (owned by the application's account) to create a
    * token for. For use with Stripe Connect only; this can only be used
    * with an OAuth access token or Stripe-Account header. For more
    * details, see the shared customers documentation.
    *
    * Stripe connect only
    */
  var customer: js.UndefOr[String] = js.native
}

object ITokenCreationOptionsBase {
  @scala.inline
  def apply(): ITokenCreationOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenCreationOptionsBase]
  }
  @scala.inline
  implicit class ITokenCreationOptionsBaseOps[Self <: ITokenCreationOptionsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
  }
  
}

