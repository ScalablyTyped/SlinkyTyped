package typingsSlinky.stripe.mod.issuing.cards

import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the specified Issuing Card object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
  */
@js.native
trait IIssuingCardUpdateOptions extends js.Object {
  /**
    * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
    */
  var auhtorization_controls: js.UndefOr[ICardAuthorizationControls] = js.native
  /**
    * The Cardholder to associate the card with.
    */
  var cardholder: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * Specifies whether to permit authorizations on this card. Possible values are active, inactive, or the terminal states: canceled, lost, stolen.
    */
  var status: js.UndefOr[IssuingCardStatus] = js.native
}

object IIssuingCardUpdateOptions {
  @scala.inline
  def apply(): IIssuingCardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIssuingCardUpdateOptions]
  }
  @scala.inline
  implicit class IIssuingCardUpdateOptionsOps[Self <: IIssuingCardUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuhtorization_controls(value: ICardAuthorizationControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auhtorization_controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuhtorization_controls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auhtorization_controls")(js.undefined)
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
    def withMetadata(value: IOptionsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
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
  }
  
}

