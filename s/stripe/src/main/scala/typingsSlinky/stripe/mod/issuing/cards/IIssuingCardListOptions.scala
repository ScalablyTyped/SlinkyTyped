package typingsSlinky.stripe.mod.issuing.cards

import typingsSlinky.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a list of Issuing Card objects. The objects are sorted in descending order by creation date,
  * with the most recently created object appearing first.
  */
@js.native
trait IIssuingCardListOptions extends js.Object {
  /**
    * Only return cards belonging to the Cardholder with the provided ID.
    */
  var cardholder: js.UndefOr[String] = js.native
  /**
    * A filter on the list based on the object created field.
    * The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[String | ICreated] = js.native
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list.
    * For instance, if you make a list request and receive 100 objects, starting with obj_bar,
    * your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.native
  /**
    * Only return cards that have the given expiration month.
    */
  var exp_month: js.UndefOr[Double] = js.native
  /**
    * Only return cards that have the given expiration year.
    */
  var exp_year: js.UndefOr[Double] = js.native
  /**
    * Only return cards that have the given last four digits.
    */
  var last4: js.UndefOr[String] = js.native
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Only return cards that have the given name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Only return cards whose full card number matches that of this card source ID.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.native
  /**
    * Only return cards that have the given status. One of active, inactive, canceled, lost, or stolen.
    */
  var status: js.UndefOr[IssuingCardStatus] = js.native
  /**
    * Only return cards that have the given type. One of virtual or physical.
    */
  var `type`: js.UndefOr[IssuingCardType] = js.native
}

object IIssuingCardListOptions {
  @scala.inline
  def apply(): IIssuingCardListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIssuingCardListOptions]
  }
  @scala.inline
  implicit class IIssuingCardListOptionsOps[Self <: IIssuingCardListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCreated(value: String | ICreated): Self = {
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
    def withExp_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp_month: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(js.undefined)
        ret
    }
    @scala.inline
    def withExp_year(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp_year: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(js.undefined)
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
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
    @scala.inline
    def withStatus(value: IssuingCardStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: IssuingCardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

