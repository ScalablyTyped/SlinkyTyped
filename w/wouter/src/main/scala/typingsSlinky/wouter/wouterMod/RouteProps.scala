package typingsSlinky.wouter.wouterMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps[T /* <: DefaultParams */] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* params */ Params[T], TagMod[Any]]) | TagMod[Any]] = js.undefined
  var component: js.UndefOr[ReactComponentClass[RouteComponentProps[T]]] = js.undefined
  var path: Path
}

object RouteProps {
  @scala.inline
  def apply[T /* <: DefaultParams */](
    path: Path,
    children: (js.Function1[/* params */ Params[T], TagMod[Any]]) | TagMod[Any] = null,
    component: ReactComponentClass[RouteComponentProps[T]] = null
  ): RouteProps[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps[T]]
  }
}

