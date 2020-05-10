package typingsSlinky.workboxRouting.routerMod.Router

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindMatchingRouteOptions extends HandleRequestOptions {
  var url: URL = js.native
}

object FindMatchingRouteOptions {
  @scala.inline
  def apply(request: Request, url: URL): FindMatchingRouteOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMatchingRouteOptions]
  }
  @scala.inline
  implicit class FindMatchingRouteOptionsOps[Self <: FindMatchingRouteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: URL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

