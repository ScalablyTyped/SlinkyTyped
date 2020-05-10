package typingsSlinky.stripe.mod.fileLinks

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.stripeStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileLinksUpdateOptions extends IDataOptionsWithMetadata {
  var expires_at: js.UndefOr[Double | now] = js.native
}

object IFileLinksUpdateOptions {
  @scala.inline
  def apply(): IFileLinksUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileLinksUpdateOptions]
  }
  @scala.inline
  implicit class IFileLinksUpdateOptionsOps[Self <: IFileLinksUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires_at(value: Double | now): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(js.undefined)
        ret
    }
  }
  
}

