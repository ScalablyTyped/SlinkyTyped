package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOpenIdList extends js.Object {
  /**
    * 错误码
    */
  var errCode: Double = js.native
  /**
    * 调用结果
    */
  var errMsg: String = js.native
  /**
    * 在此通话中的成员 openId 名单
    */
  var openIdList: js.Array[String] = js.native
}

object AnonOpenIdList {
  @scala.inline
  def apply(errCode: Double, errMsg: String, openIdList: js.Array[String]): AnonOpenIdList = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], openIdList = openIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpenIdList]
  }
  @scala.inline
  implicit class AnonOpenIdListOps[Self <: AnonOpenIdList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenIdList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openIdList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

