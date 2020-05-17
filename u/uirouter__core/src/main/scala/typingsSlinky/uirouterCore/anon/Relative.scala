package typingsSlinky.uirouterCore.anon

import typingsSlinky.uirouterCore.stateInterfaceMod.StateOrName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relative extends js.Object {
  var relative: js.UndefOr[StateOrName] = js.native
}

object Relative {
  @scala.inline
  def apply(): Relative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relative]
  }
  @scala.inline
  implicit class RelativeOps[Self <: Relative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelative(value: StateOrName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
  }
  
}

