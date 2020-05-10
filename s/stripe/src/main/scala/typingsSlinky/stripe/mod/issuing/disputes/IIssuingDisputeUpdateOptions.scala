package typingsSlinky.stripe.mod.issuing.disputes

import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIssuingDisputeUpdateOptions extends js.Object {
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
}

object IIssuingDisputeUpdateOptions {
  @scala.inline
  def apply(): IIssuingDisputeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIssuingDisputeUpdateOptions]
  }
  @scala.inline
  implicit class IIssuingDisputeUpdateOptionsOps[Self <: IIssuingDisputeUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

