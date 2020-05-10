package typingsSlinky.swaggerizeExpress.mod

import typingsSlinky.swaggerizeExpress.mod.Swagger.ApiDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var api: ApiDefinition = js.native
  var docspath: String = js.native
  var handlers: String | RouteSegment = js.native
}

object Options {
  @scala.inline
  def apply(api: ApiDefinition, docspath: String, handlers: String | RouteSegment): Options = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], docspath = docspath.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: ApiDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocspath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docspath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandlers(value: String | RouteSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

