package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 数据缓存
@js.native
trait StorageInfo extends js.Object {
  //  当前占用的空间大小, 单位 KB
  var currentSize: Double = js.native
  //  当前 storage 中所有的 key
  var keys: js.Array[String] = js.native
  //  限制的空间大小，单位 KB
  var limitSize: Double = js.native
}

object StorageInfo {
  @scala.inline
  def apply(currentSize: Double, keys: js.Array[String], limitSize: Double): StorageInfo = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageInfo]
  }
  @scala.inline
  implicit class StorageInfoOps[Self <: StorageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimitSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

