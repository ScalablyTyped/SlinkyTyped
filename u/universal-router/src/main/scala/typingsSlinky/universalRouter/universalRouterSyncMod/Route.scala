package typingsSlinky.universalRouter.universalRouterSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route[C /* <: Context */, R] extends js.Object {
  var action: js.UndefOr[
    js.Function2[/* context */ (RouteContext[C, R]) with C, /* params */ QueryParams, Result[R]]
  ] = js.native
  var children: js.UndefOr[(Routes[C, R]) | Null] = js.native
  var name: js.UndefOr[String] = js.native
  var parent: js.UndefOr[(Route[C, R]) | Null] = js.native
  var path: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
}

object Route {
  @scala.inline
  def apply[C, R](): Route[C, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route[C, R]]
  }
  @scala.inline
  implicit class RouteOps[Self[c, r] <: Route[c, r], C, R] (val x: Self[C, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, R]) with Other]
    @scala.inline
    def withAction(value: (/* context */ (RouteContext[C, R]) with C, /* params */ QueryParams) => Result[R]): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAction: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: Routes[C, R]): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenNull: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Route[C, R]): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNull: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
    @scala.inline
    def withPathRegExp(value: js.RegExp): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

