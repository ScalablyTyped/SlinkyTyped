package typingsSlinky.stripe.mod.issuing.authorizations

import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthorizationApproveOptions extends js.Object {
  /**
    * If the authorization’s is_held_amount_controllable property is true, you may provide this value to control how much to hold for the authorization.
    * Must be positive (use decline to decline an authorization request).
    */
  var held_amount: js.UndefOr[Double] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
}

object IAuthorizationApproveOptions {
  @scala.inline
  def apply(): IAuthorizationApproveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuthorizationApproveOptions]
  }
  @scala.inline
  implicit class IAuthorizationApproveOptionsOps[Self <: IAuthorizationApproveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeld_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("held_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeld_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("held_amount")(js.undefined)
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
  }
  
}

