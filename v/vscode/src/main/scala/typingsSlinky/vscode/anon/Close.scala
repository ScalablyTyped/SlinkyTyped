package typingsSlinky.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Close extends js.Object {
  var close: js.UndefOr[String] = js.native
  var lineStart: String = js.native
  var open: String = js.native
  var scope: String = js.native
}

object Close {
  @scala.inline
  def apply(lineStart: String, open: String, scope: String): Close = {
    val __obj = js.Dynamic.literal(lineStart = lineStart.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  @scala.inline
  implicit class CloseOps[Self <: Close] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
  }
  
}

