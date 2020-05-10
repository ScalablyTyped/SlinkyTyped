package typingsSlinky.workboxRouting.routerMod.Router

import typingsSlinky.workboxRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindMatchingRouteReturn[MatchReturn] extends js.Object {
  var params: js.Any = js.native
   // Exclude<MatchReturn, Falsy> | undefined; <-- TypeScript 2.8
  var route: Route[MatchReturn] = js.native
}

object FindMatchingRouteReturn {
  @scala.inline
  def apply[MatchReturn](params: js.Any, route: Route[MatchReturn]): FindMatchingRouteReturn[MatchReturn] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMatchingRouteReturn[MatchReturn]]
  }
  @scala.inline
  implicit class FindMatchingRouteReturnOps[Self[matchreturn] <: FindMatchingRouteReturn[matchreturn], MatchReturn] (val x: Self[MatchReturn]) extends AnyVal {
    @scala.inline
    def duplicate: Self[MatchReturn] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[MatchReturn]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[MatchReturn] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[MatchReturn] with Other]
    @scala.inline
    def withParams(value: js.Any): Self[MatchReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoute(value: Route[MatchReturn]): Self[MatchReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

