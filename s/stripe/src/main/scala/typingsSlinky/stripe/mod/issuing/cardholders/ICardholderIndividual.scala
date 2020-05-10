package typingsSlinky.stripe.mod.issuing.cardholders

import typingsSlinky.stripe.AnonDay
import typingsSlinky.stripe.AnonDocumentAnonFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardholderIndividual extends js.Object {
  /**
    * The date of birth of this cardholder.
    */
  var dob: AnonDay = js.native
  /**
    * The first name of this cardholder.
    */
  var first_name: String = js.native
  /**
    * The last name of this cardholder.
    */
  var last_name: String = js.native
  /**
    * Government-issued ID document for this cardholder.
    */
  var verification: js.UndefOr[AnonDocumentAnonFront] = js.native
}

object ICardholderIndividual {
  @scala.inline
  def apply(dob: AnonDay, first_name: String, last_name: String): ICardholderIndividual = {
    val __obj = js.Dynamic.literal(dob = dob.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderIndividual]
  }
  @scala.inline
  implicit class ICardholderIndividualOps[Self <: ICardholderIndividual] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDob(value: AnonDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerification(value: AnonDocumentAnonFront): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(js.undefined)
        ret
    }
  }
  
}

