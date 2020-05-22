package typingsSlinky.universalRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[C /* <: Context */, R] extends js.Object {
  var action: js.UndefOr[
    js.Function2[/* context */ (RouteContext[C, R]) with C, /* params */ QueryParams, Result[R]]
  ] = js.undefined
  var children: js.UndefOr[(Routes[C, R]) | Null] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[(Route[C, R]) | Null] = js.undefined
  var path: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
}

object Route {
  @scala.inline
  def apply[C, R](
    action: (/* context */ (RouteContext[C, R]) with C, /* params */ QueryParams) => Result[R] = null,
    children: js.UndefOr[Null | (Routes[C, R])] = js.undefined,
    name: String = null,
    parent: js.UndefOr[Null | (Route[C, R])] = js.undefined,
    path: String | js.RegExp | (js.Array[String | js.RegExp]) = null
  ): Route[C, R] = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction2(action))
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[C, R]]
  }
}

