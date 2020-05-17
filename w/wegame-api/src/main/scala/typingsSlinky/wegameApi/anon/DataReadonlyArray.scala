package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wx.types.UserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataReadonlyArray extends js.Object {
  var data: js.Array[UserInfo] = js.native
}

object DataReadonlyArray {
  @scala.inline
  def apply(data: js.Array[UserInfo]): DataReadonlyArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReadonlyArray]
  }
  @scala.inline
  implicit class DataReadonlyArrayOps[Self <: DataReadonlyArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[UserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

