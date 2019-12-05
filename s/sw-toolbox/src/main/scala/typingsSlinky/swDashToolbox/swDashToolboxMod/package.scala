package typingsSlinky.swDashToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swDashToolboxMod {
  type Handler = js.Function1[/* request */ Request, js.Promise[Response]]
  type PrecacheURL = Request | String
  type PrecacheURLs = js.Promise[js.Array[PrecacheURL]] | js.Array[PrecacheURL]
  type URLPattern = String | js.RegExp
}
