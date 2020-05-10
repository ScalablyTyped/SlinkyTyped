package typingsSlinky.stripe.mod.coupons

import typingsSlinky.stripe.mod.IObject
import typingsSlinky.stripe.stripeStrings.discount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A discount represents the actual application of a coupon to a particular customer. It contains information
  * about when the discount began and when it will end.
  */
@js.native
trait IDiscount extends IObject {
  /**
    * Hash describing the coupon applied to create this discount
    */
  var coupon: ICoupon = js.native
  var customer: String = js.native
  /**
    * If the coupon has a duration of once or repeating, the date that this discount will end. If the coupon
    * used has a forever duration, this attribute will be null.
    */
  var end: Double = js.native
  /**
    * Value is 'discount'
    */
  @JSName("object")
  var object_IDiscount: discount = js.native
  /**
    * Date that the coupon was applied
    */
  var start: Double = js.native
  /**
    * The subscription that this coupon is applied to, if it is applied to a particular subscription
    */
  var subscription: String = js.native
}

object IDiscount {
  @scala.inline
  def apply(
    coupon: ICoupon,
    customer: String,
    end: Double,
    `object`: discount,
    start: Double,
    subscription: String
  ): IDiscount = {
    val __obj = js.Dynamic.literal(coupon = coupon.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiscount]
  }
  @scala.inline
  implicit class IDiscountOps[Self <: IDiscount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoupon(value: ICoupon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: discount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

