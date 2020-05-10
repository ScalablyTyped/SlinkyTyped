package typingsSlinky.which.mod

import typingsSlinky.which.whichBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for all matches. */
@js.native
trait OptionsAll extends AsyncOptions {
  @JSName("all")
  var all_OptionsAll: `true` = js.native
}

object OptionsAll {
  @scala.inline
  def apply(all: `true`): OptionsAll = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAll]
  }
  @scala.inline
  implicit class OptionsAllOps[Self <: OptionsAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

