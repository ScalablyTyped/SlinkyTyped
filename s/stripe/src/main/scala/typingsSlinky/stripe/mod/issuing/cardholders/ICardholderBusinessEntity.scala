package typingsSlinky.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardholderBusinessEntity extends js.Object {
  /**
    * Whether the company’s business ID number was provided.
    */
  var tax_id_provided: js.UndefOr[Boolean] = js.native
}

object ICardholderBusinessEntity {
  @scala.inline
  def apply(): ICardholderBusinessEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardholderBusinessEntity]
  }
  @scala.inline
  implicit class ICardholderBusinessEntityOps[Self <: ICardholderBusinessEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTax_id_provided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_provided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_id_provided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_provided")(js.undefined)
        ret
    }
  }
  
}

