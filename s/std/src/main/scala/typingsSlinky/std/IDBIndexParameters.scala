package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBIndexParameters extends js.Object {
  var multiEntry: js.UndefOr[scala.Boolean] = js.native
  var unique: js.UndefOr[scala.Boolean] = js.native
}

object IDBIndexParameters {
  @scala.inline
  def apply(): IDBIndexParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBIndexParameters]
  }
  @scala.inline
  implicit class IDBIndexParametersOps[Self <: IDBIndexParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiEntry(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
  }
  
}

