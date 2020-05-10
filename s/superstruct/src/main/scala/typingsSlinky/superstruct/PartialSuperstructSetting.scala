package typingsSlinky.superstruct

import typingsSlinky.std.Record
import typingsSlinky.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<superstruct.superstruct/lib/superstruct.SuperstructSettings> */
@js.native
trait PartialSuperstructSetting extends js.Object {
  var error: js.UndefOr[AnonInstantiable] = js.native
  var types: js.UndefOr[Record[String, Validator]] = js.native
}

object PartialSuperstructSetting {
  @scala.inline
  def apply(): PartialSuperstructSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSuperstructSetting]
  }
  @scala.inline
  implicit class PartialSuperstructSettingOps[Self <: PartialSuperstructSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: AnonInstantiable): Self = {
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
    def withTypes(value: Record[String, Validator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

