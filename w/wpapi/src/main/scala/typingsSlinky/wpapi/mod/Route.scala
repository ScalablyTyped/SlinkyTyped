package typingsSlinky.wpapi.mod

import typingsSlinky.wpapi.AnonSelf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  var _links: js.UndefOr[AnonSelf] = js.native
  var endpoints: js.Array[HTTPEndpoint] = js.native
  var methods: js.Array[HTTPMethod] = js.native
  var namespace: String = js.native
}

object Route {
  @scala.inline
  def apply(endpoints: js.Array[HTTPEndpoint], methods: js.Array[HTTPMethod], namespace: String): Route = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: js.Array[HTTPEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[HTTPMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_links(value: AnonSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_links: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(js.undefined)
        ret
    }
  }
  
}

