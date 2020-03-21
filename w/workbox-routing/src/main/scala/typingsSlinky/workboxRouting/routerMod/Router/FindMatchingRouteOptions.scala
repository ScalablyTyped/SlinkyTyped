package typingsSlinky.workboxRouting.routerMod.Router

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindMatchingRouteOptions extends HandleRequestOptions {
  var url: URL
}

object FindMatchingRouteOptions {
  @scala.inline
  def apply(
    request: Request,
    url: URL,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FetchEvent */ js.Any = null
  ): FindMatchingRouteOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMatchingRouteOptions]
  }
}

