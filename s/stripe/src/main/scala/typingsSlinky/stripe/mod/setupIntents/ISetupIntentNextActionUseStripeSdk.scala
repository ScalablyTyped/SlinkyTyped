package typingsSlinky.stripe.mod.setupIntents

import typingsSlinky.stripe.stripeStrings.use_stripe_sdk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntentNextActionUseStripeSdk extends js.Object {
  var `type`: use_stripe_sdk = js.native
  /**
    * When confirming a SetupIntent with js, js depends on the contents of this object to invoke authentication flows. The shape of the contents is subject to change and is only intended to be used by js.
    */
  var use_stripe_sdk: js.Any = js.native
}

object ISetupIntentNextActionUseStripeSdk {
  @scala.inline
  def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): ISetupIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentNextActionUseStripeSdk]
  }
  @scala.inline
  implicit class ISetupIntentNextActionUseStripeSdkOps[Self <: ISetupIntentNextActionUseStripeSdk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: use_stripe_sdk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse_stripe_sdk(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_stripe_sdk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

