package typingsSlinky.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoClosingPairs extends js.Object {
  var autoClosingPairs: js.Array[NotIn] = js.native
}

object AutoClosingPairs {
  @scala.inline
  def apply(autoClosingPairs: js.Array[NotIn]): AutoClosingPairs = {
    val __obj = js.Dynamic.literal(autoClosingPairs = autoClosingPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClosingPairs]
  }
  @scala.inline
  implicit class AutoClosingPairsOps[Self <: AutoClosingPairs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClosingPairs(value: js.Array[NotIn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClosingPairs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

