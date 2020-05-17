package typingsSlinky.stripe.mod.setupIntents

import typingsSlinky.stripe.anon.Requestthreedsecure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntentPaymentMethodOptions extends js.Object {
  /**
    * Configuration for any card payments attempted on this SetupIntent.
    */
  var card: js.UndefOr[Requestthreedsecure] = js.native
}

object ISetupIntentPaymentMethodOptions {
  @scala.inline
  def apply(): ISetupIntentPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetupIntentPaymentMethodOptions]
  }
  @scala.inline
  implicit class ISetupIntentPaymentMethodOptionsOps[Self <: ISetupIntentPaymentMethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: Requestthreedsecure): Self = {
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
  }
  
}

