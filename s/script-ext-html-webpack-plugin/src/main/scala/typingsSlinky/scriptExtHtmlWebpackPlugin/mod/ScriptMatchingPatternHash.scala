package typingsSlinky.scriptExtHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptMatchingPatternHash extends ScriptMatchingPattern {
  var test: ScriptMatchingPatternBase = js.native
}

object ScriptMatchingPatternHash {
  @scala.inline
  def apply(test: ScriptMatchingPatternBase): ScriptMatchingPatternHash = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptMatchingPatternHash]
  }
  @scala.inline
  implicit class ScriptMatchingPatternHashOps[Self <: ScriptMatchingPatternHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: ScriptMatchingPatternBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

