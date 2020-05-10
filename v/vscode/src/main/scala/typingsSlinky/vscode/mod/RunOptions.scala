package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunOptions extends js.Object {
  /**
  		 * Controls whether task variables are re-evaluated on rerun.
  		 */
  var reevaluateOnRerun: js.UndefOr[Boolean] = js.native
}

object RunOptions {
  @scala.inline
  def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  @scala.inline
  implicit class RunOptionsOps[Self <: RunOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReevaluateOnRerun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reevaluateOnRerun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReevaluateOnRerun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reevaluateOnRerun")(js.undefined)
        ret
    }
  }
  
}

