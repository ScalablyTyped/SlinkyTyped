package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMACAddressOptions extends js.Object {
  /**
    * If `no_colons` is `true`, the validator will allow MAC addresses without the colons.
    * Also, it allows the use of hyphens or spaces.
    *
    * e.g. `01 02 03 04 05 ab` or `01-02-03-04-05-ab`.
    *
    * @default false
    */
  var no_colons: js.UndefOr[Boolean] = js.native
}

object IsMACAddressOptions {
  @scala.inline
  def apply(): IsMACAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMACAddressOptions]
  }
  @scala.inline
  implicit class IsMACAddressOptionsOps[Self <: IsMACAddressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNo_colons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_colons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_colons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_colons")(js.undefined)
        ret
    }
  }
  
}

