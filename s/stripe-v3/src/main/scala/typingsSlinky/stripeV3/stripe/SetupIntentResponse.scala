package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.stripe.setupIntents.SetupIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupIntentResponse extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var setupIntent: js.UndefOr[SetupIntent] = js.native
}

object SetupIntentResponse {
  @scala.inline
  def apply(): SetupIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupIntentResponse]
  }
  @scala.inline
  implicit class SetupIntentResponseOps[Self <: SetupIntentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupIntent(value: SetupIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupIntent")(js.undefined)
        ret
    }
  }
  
}

