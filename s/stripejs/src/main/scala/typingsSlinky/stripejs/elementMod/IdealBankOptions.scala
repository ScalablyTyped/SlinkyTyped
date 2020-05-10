package typingsSlinky.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdealBankOptions extends BaseOptions {
  /**
    * A pre-filled value for the Element. Can be one of the banks listed in the
    * @see https://stripe.com/docs/sources/ideal#optional-specifying-the-customers-bank
    *
    * @example 'abn_amro'
    */
  var value: js.UndefOr[String] = js.native
}

object IdealBankOptions {
  @scala.inline
  def apply(): IdealBankOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdealBankOptions]
  }
  @scala.inline
  implicit class IdealBankOptionsOps[Self <: IdealBankOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

