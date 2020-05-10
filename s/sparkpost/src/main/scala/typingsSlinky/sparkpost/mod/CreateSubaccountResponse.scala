package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubaccountResponse extends js.Object {
  var key: String = js.native
  var label: String = js.native
  var short_key: String = js.native
  var subaccount_id: Double = js.native
}

object CreateSubaccountResponse {
  @scala.inline
  def apply(key: String, label: String, short_key: String, subaccount_id: Double): CreateSubaccountResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], short_key = short_key.asInstanceOf[js.Any], subaccount_id = subaccount_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubaccountResponse]
  }
  @scala.inline
  implicit class CreateSubaccountResponseOps[Self <: CreateSubaccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubaccount_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccount_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

