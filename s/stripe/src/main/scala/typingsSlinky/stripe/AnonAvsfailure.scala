package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAvsfailure extends js.Object {
  /**
    * Whether Stripe automatically declines charges with an incorrect ZIP or
    * postal code. This setting only applies when a ZIP or postal code is
    * provided and they fail bank verification.
    */
  var avs_failure: js.UndefOr[Boolean] = js.native
  /**
    * Whether Stripe automatically declines charges with an incorrect CVC.
    * This setting only applies when a CVC is provided and it fails bank
    * verification.
    */
  var cvc_failure: js.UndefOr[Boolean] = js.native
}

object AnonAvsfailure {
  @scala.inline
  def apply(): AnonAvsfailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAvsfailure]
  }
  @scala.inline
  implicit class AnonAvsfailureOps[Self <: AnonAvsfailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvs_failure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avs_failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvs_failure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avs_failure")(js.undefined)
        ret
    }
    @scala.inline
    def withCvc_failure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc_failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCvc_failure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc_failure")(js.undefined)
        ret
    }
  }
  
}

