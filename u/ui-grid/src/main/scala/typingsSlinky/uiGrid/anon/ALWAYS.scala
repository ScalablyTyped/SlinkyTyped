package typingsSlinky.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALWAYS extends js.Object {
  var ALWAYS: Double = js.native
  var NEVER: Double = js.native
  var WHEN_NEEDED: Double = js.native
}

object ALWAYS {
  @scala.inline
  def apply(ALWAYS: Double, NEVER: Double, WHEN_NEEDED: Double): ALWAYS = {
    val __obj = js.Dynamic.literal(ALWAYS = ALWAYS.asInstanceOf[js.Any], NEVER = NEVER.asInstanceOf[js.Any], WHEN_NEEDED = WHEN_NEEDED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALWAYS]
  }
  @scala.inline
  implicit class ALWAYSOps[Self <: ALWAYS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALWAYS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALWAYS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNEVER(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEVER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWHEN_NEEDED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WHEN_NEEDED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

