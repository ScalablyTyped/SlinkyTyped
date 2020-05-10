package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentMethodListOptions[T /* <: IPaymentMethodType */] extends IListOptions {
  /** The ID of the customer whose PaymentMethods will be retrieved. */
  var customer: String = js.native
  /** A required filter on the list, based on the object type field. */
  var `type`: T = js.native
}

object IPaymentMethodListOptions {
  @scala.inline
  def apply[T](customer: String, `type`: T): IPaymentMethodListOptions[T] = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodListOptions[T]]
  }
  @scala.inline
  implicit class IPaymentMethodListOptionsOps[Self[t] <: IPaymentMethodListOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCustomer(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

