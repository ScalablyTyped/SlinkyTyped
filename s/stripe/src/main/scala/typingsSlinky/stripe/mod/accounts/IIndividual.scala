package typingsSlinky.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndividual extends IIndividualShared {
  /**
    * Whether the individual’s personal ID number was provided.
    */
  var id_number_provided: Boolean = js.native
  /**
    * Whether the individual’s last 4 SSN digits was provided.
    */
  var ssn_last_4_provided: Boolean = js.native
}

object IIndividual {
  @scala.inline
  def apply(id_number_provided: Boolean, ssn_last_4_provided: Boolean): IIndividual = {
    val __obj = js.Dynamic.literal(id_number_provided = id_number_provided.asInstanceOf[js.Any], ssn_last_4_provided = ssn_last_4_provided.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndividual]
  }
  @scala.inline
  implicit class IIndividualOps[Self <: IIndividual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId_number_provided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_number_provided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsn_last_4_provided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssn_last_4_provided")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

