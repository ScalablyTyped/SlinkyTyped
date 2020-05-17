package typingsSlinky.stripe.mod.sources

import typingsSlinky.stripe.anon.Currency
import typingsSlinky.stripe.anon.EmailName
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISourceUpdateOptions extends IDataOptionsWithMetadata {
  var mandate: js.UndefOr[Currency] = js.native
  var owner: js.UndefOr[EmailName] = js.native
}

object ISourceUpdateOptions {
  @scala.inline
  def apply(): ISourceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourceUpdateOptions]
  }
  @scala.inline
  implicit class ISourceUpdateOptionsOps[Self <: ISourceUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMandate(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandate")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: EmailName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

