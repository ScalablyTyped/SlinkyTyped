package typingsSlinky.stellarSdk.anon

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Records[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T] = js.native
}

object Records {
  @scala.inline
  def apply[T](records: js.Array[T]): Records[T] = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[Records[T]]
  }
  @scala.inline
  implicit class RecordsOps[Self[t] <: Records[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRecords(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

