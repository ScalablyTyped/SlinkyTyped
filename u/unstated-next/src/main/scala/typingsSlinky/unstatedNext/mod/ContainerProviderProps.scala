package typingsSlinky.unstatedNext.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProviderProps[State] extends js.Object {
  var children: TagMod[Any] = js.native
  var initialState: js.UndefOr[State] = js.native
}

object ContainerProviderProps {
  @scala.inline
  def apply[State](): ContainerProviderProps[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProviderProps[State]]
  }
  @scala.inline
  implicit class ContainerProviderPropsOps[Self[state] <: ContainerProviderProps[state], State] (val x: Self[State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[State] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[State] with Other]
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: State): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
  }
  
}

