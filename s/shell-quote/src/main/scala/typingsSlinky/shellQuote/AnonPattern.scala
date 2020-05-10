package typingsSlinky.shellQuote

import typingsSlinky.shellQuote.mod._ParseEntry
import typingsSlinky.shellQuote.shellQuoteStrings.glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPattern extends _ParseEntry {
  var op: glob = js.native
  var pattern: String = js.native
}

object AnonPattern {
  @scala.inline
  def apply(op: glob, pattern: String): AnonPattern = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPattern]
  }
  @scala.inline
  implicit class AnonPatternOps[Self <: AnonPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOp(value: glob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

