package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIsSupportSoterAuthenticationRes extends js.Object {
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var supportMode: js.UndefOr[js.Array[_]] = js.native
}

object CheckIsSupportSoterAuthenticationRes {
  @scala.inline
  def apply(): CheckIsSupportSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationRes]
  }
  @scala.inline
  implicit class CheckIsSupportSoterAuthenticationResOps[Self <: CheckIsSupportSoterAuthenticationRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportMode(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportMode")(js.undefined)
        ret
    }
  }
  
}

