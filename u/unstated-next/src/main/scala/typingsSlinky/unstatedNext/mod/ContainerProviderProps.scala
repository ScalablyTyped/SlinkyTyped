package typingsSlinky.unstatedNext.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProviderProps[State] extends js.Object {
  var children: TagMod[Any]
  var initialState: js.UndefOr[State] = js.undefined
}

object ContainerProviderProps {
  @scala.inline
  def apply[State](children: TagMod[Any] = null, initialState: State = null): ContainerProviderProps[State] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProviderProps[State]]
  }
}

