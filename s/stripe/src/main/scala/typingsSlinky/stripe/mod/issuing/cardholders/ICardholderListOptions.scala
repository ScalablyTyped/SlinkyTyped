package typingsSlinky.stripe.mod.issuing.cardholders

import typingsSlinky.stripe.mod.issuing.ICreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardholderListOptions extends js.Object {
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a
    * dictionary with the following options:
    */
  var created: js.UndefOr[String | ICreated] = js.native
  /**
    * Only return cardholders that have the given email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
    */
  var ending_before: js.UndefOr[String] = js.native
  /**
    * Only return the default cardholder.
    */
  var is_default: js.UndefOr[Boolean] = js.native
  /**
    * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Only return cardholders that have the given phone number.
    */
  var phone_number: js.UndefOr[String] = js.native
  /**
    * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
    */
  var starting_after: js.UndefOr[String] = js.native
  /**
    * Only return cardholders that have the given status. One of active, inactive, or blocked.
    */
  var status: js.UndefOr[CardholderStatus] = js.native
  /**
    * Only return cardholders that have the given type. One of individual or business_entity.
    */
  var `type`: js.UndefOr[CardholderType] = js.native
}

object ICardholderListOptions {
  @scala.inline
  def apply(): ICardholderListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardholderListOptions]
  }
  @scala.inline
  implicit class ICardholderListOptionsOps[Self <: ICardholderListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
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
    def withIs_default(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_default")(js.undefined)
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
    def withPhone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(js.undefined)
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
    def withStatus(value: CardholderStatus): Self = {
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
    def withType(value: CardholderType): Self = {
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

