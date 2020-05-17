package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.IDateFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fulfilled extends js.Object {
  /**
    * A filter on the list based on the object canceled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var canceled: js.UndefOr[IDateFilter] = js.native
  /**
    * A filter on the list based on the object fulfilled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var fulfilled: js.UndefOr[IDateFilter] = js.native
  /**
    * A filter on the list based on the object paid field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var paid: js.UndefOr[IDateFilter] = js.native
  /**
    * A filter on the list based on the object returned field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var returned: js.UndefOr[IDateFilter] = js.native
}

object Fulfilled {
  @scala.inline
  def apply(): Fulfilled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fulfilled]
  }
  @scala.inline
  implicit class FulfilledOps[Self <: Fulfilled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanceled(value: IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanceled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfilled(value: IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfilled")(js.undefined)
        ret
    }
    @scala.inline
    def withPaid(value: IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid")(js.undefined)
        ret
    }
    @scala.inline
    def withReturned(value: IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returned")(js.undefined)
        ret
    }
  }
  
}

