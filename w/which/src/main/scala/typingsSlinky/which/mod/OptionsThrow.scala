package typingsSlinky.which.mod

import typingsSlinky.which.whichBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that ask for a thrown error if executable is not found (the default behavior) */
@js.native
trait OptionsThrow extends Options {
  @JSName("nothrow")
  var nothrow_OptionsThrow: js.UndefOr[`false`] = js.native
}

object OptionsThrow {
  @scala.inline
  def apply(): OptionsThrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsThrow]
  }
  @scala.inline
  implicit class OptionsThrowOps[Self <: OptionsThrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNothrow(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nothrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNothrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nothrow")(js.undefined)
        ret
    }
  }
  
}

