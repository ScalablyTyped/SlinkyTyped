package typingsSlinky.uirouterCore.stateInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyLoadResult extends js.Object {
  var states: js.UndefOr[js.Array[StateDeclaration]] = js.native
}

object LazyLoadResult {
  @scala.inline
  def apply(): LazyLoadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyLoadResult]
  }
  @scala.inline
  implicit class LazyLoadResultOps[Self <: LazyLoadResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStates(value: js.Array[StateDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
  }
  
}

