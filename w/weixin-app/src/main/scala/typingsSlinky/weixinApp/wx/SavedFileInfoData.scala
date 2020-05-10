package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFileInfoData extends js.Object {
  /**
  		 * 文件的保存是的时间戳，从1970/01/01 08:00:00 到当前时间的秒数
  		 */
  var createTime: Double = js.native
  /**
  		 * 接口调用结果
  		 */
  var errMsg: String = js.native
  /**
  		 * 文件大小，单位B
  		 */
  var size: Double = js.native
}

object SavedFileInfoData {
  @scala.inline
  def apply(createTime: Double, errMsg: String, size: Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFileInfoData]
  }
  @scala.inline
  implicit class SavedFileInfoDataOps[Self <: SavedFileInfoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

