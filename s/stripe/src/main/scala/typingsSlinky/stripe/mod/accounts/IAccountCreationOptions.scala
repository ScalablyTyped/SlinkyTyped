package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.stripeStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccountCreationOptions extends IAccountUpdateOptions {
  /**
    * The country the account holder resides in or that the business is legally
    * established in. For example, if you are in the United States and the
    * business you’re creating an account for is legally represented in Canada,
    * you would use “CA” as the country for the account being created.
    *
    * optional, default is your own country
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The type of Stripe account to create. Currently must be custom, as only Custom
    * accounts may be created via the API.
    */
  var `type`: custom = js.native
}

object IAccountCreationOptions {
  @scala.inline
  def apply(`type`: custom): IAccountCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccountCreationOptions]
  }
  @scala.inline
  implicit class IAccountCreationOptionsOps[Self <: IAccountCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
  }
  
}

