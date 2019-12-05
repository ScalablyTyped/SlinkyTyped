package typingsSlinky.workboxDashCore.typesWorkboxPluginMod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchDidSucceedCallbackParam extends js.Object {
  var request: Request
  var response: Response
}

object FetchDidSucceedCallbackParam {
  @scala.inline
  def apply(request: Request, response: Response): FetchDidSucceedCallbackParam = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchDidSucceedCallbackParam]
  }
}

