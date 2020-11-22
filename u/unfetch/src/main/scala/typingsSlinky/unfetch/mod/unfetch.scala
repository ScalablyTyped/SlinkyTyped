package typingsSlinky.unfetch.mod

import org.scalajs.dom.experimental.Body
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("unfetch", "unfetch")
@js.native
object unfetch extends js.Object {
  
  type IsomorphicBody = Body | typingsSlinky.nodeFetch.mod.Body
  
  type IsomorphicHeaders = Headers | typingsSlinky.nodeFetch.mod.Headers
  
  type IsomorphicRequest = Request | typingsSlinky.nodeFetch.mod.Request
  
  type IsomorphicRequestInit = RequestInit | typingsSlinky.nodeFetch.mod.RequestInit
  
  type IsomorphicResponse = Response | typingsSlinky.nodeFetch.mod.Response
}
