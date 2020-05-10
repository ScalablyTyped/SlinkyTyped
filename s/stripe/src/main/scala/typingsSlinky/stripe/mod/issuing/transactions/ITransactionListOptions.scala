package typingsSlinky.stripe.mod.issuing.transactions

import typingsSlinky.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransactionListOptions extends js.Object {
  /**
    * Only return issuing transactions that belong to the given card.
    */
  var card: js.UndefOr[String] = js.native
  /**
    * Only return authorizations belonging to the given cardholder.
    */
  var cardholder: js.UndefOr[String] = js.native
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[ICreated] = js.native
  /**
    * Only return transactions that originate from a given dispute.
    */
  var dispute: js.UndefOr[String] = js.native
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.native
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Only return transactions that are associated with the given settlement.
    */
  var settlement: js.UndefOr[String] = js.native
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.native
}

object ITransactionListOptions {
  @scala.inline
  def apply(): ITransactionListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionListOptions]
  }
  @scala.inline
  implicit class ITransactionListOptionsOps[Self <: ITransactionListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
    @scala.inline
    def withCardholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholder")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: ICreated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDispute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispute")(js.undefined)
        ret
    }
    @scala.inline
    def withEnding_before(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ending_before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnding_before: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ending_before")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withSettlement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettlement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlement")(js.undefined)
        ret
    }
    @scala.inline
    def withStarting_after(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting_after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarting_after: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting_after")(js.undefined)
        ret
    }
  }
  
}

