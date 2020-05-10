package typingsSlinky.which.mod

import typingsSlinky.which.whichBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for the first match (the default behavior) */
@js.native
trait OptionsFirst extends AsyncOptions {
  @JSName("all")
  var all_OptionsFirst: js.UndefOr[`false`] = js.native
}

object OptionsFirst {
  @scala.inline
  def apply(): OptionsFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsFirst]
  }
  @scala.inline
  implicit class OptionsFirstOps[Self <: OptionsFirst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
  }
  
}

