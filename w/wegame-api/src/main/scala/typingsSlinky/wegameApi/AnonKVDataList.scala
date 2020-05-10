package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKVDataList extends js.Object {
  var KVDataList: js.Array[KVData] = js.native
}

object AnonKVDataList {
  @scala.inline
  def apply(KVDataList: js.Array[KVData]): AnonKVDataList = {
    val __obj = js.Dynamic.literal(KVDataList = KVDataList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKVDataList]
  }
  @scala.inline
  implicit class AnonKVDataListOps[Self <: AnonKVDataList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKVDataList(value: js.Array[KVData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KVDataList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

