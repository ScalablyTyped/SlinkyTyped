package typingsSlinky.wxJsSdkDt

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckResult extends js.Object {
  var checkResult: StringDictionary[Boolean] = js.native
  var errMsg: AnonMsg = js.native
}

object AnonCheckResult {
  @scala.inline
  def apply(checkResult: StringDictionary[Boolean], errMsg: AnonMsg): AnonCheckResult = {
    val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckResult]
  }
  @scala.inline
  implicit class AnonCheckResultOps[Self <: AnonCheckResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckResult(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: AnonMsg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

