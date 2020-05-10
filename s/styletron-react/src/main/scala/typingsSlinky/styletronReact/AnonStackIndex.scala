package typingsSlinky.styletronReact

import typingsSlinky.styletronReact.mod.StackIndex
import typingsSlinky.styletronReact.mod.StackInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStackIndex extends js.Object {
  var stackIndex: StackIndex = js.native
  var stackInfo: StackInfo = js.native
}

object AnonStackIndex {
  @scala.inline
  def apply(stackIndex: StackIndex, stackInfo: StackInfo): AnonStackIndex = {
    val __obj = js.Dynamic.literal(stackIndex = stackIndex.asInstanceOf[js.Any], stackInfo = stackInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStackIndex]
  }
  @scala.inline
  implicit class AnonStackIndexOps[Self <: AnonStackIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackIndex(value: StackIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackInfo(value: StackInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

