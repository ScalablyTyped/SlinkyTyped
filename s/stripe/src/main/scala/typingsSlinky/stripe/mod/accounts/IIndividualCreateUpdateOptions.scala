package typingsSlinky.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndividualCreateUpdateOptions extends IIndividualShared {
  /**
    * The government-issued ID number of the individual, as appropriate for the representative’s country.
    * (Examples are a Social Security Number in the U.S., or a Social Insurance Number in Canada).
    * Instead of the number itself, you can also provide a PII token created with Stripe.js.
    * This can be unset by updating the value to null and then saving.
    */
  var id_number: js.UndefOr[String] = js.native
  /**
    * The last four digits of the individual’s Social Security Number (U.S. only).
    * This can be unset by updating the value to null and then saving.
    */
  var ssn_last_4: js.UndefOr[String] = js.native
}

object IIndividualCreateUpdateOptions {
  @scala.inline
  def apply(): IIndividualCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndividualCreateUpdateOptions]
  }
  @scala.inline
  implicit class IIndividualCreateUpdateOptionsOps[Self <: IIndividualCreateUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_number")(js.undefined)
        ret
    }
    @scala.inline
    def withSsn_last_4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssn_last_4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsn_last_4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssn_last_4")(js.undefined)
        ret
    }
  }
  
}

