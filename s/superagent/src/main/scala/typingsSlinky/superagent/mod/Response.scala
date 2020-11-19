package typingsSlinky.superagent.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.superagent.superagentBooleans.`false`
import typingsSlinky.superagent.superagentStrings.`Set-Cookie`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends ReadableStream {
  
  var accepted: Boolean = js.native
  
  var badRequest: Boolean = js.native
  
  var body: js.Any = js.native
  
  var charset: String = js.native
  
  var clientError: Boolean = js.native
  
  var error: `false` | HTTPError = js.native
  
  var files: js.Any = js.native
  
  var forbidden: Boolean = js.native
  
  def get(header: String): String = js.native
  @JSName("get")
  def get_SetCookie(header: `Set-Cookie`): js.Array[String] = js.native
  
  var header: js.Any = js.native
  
  var info: Boolean = js.native
  
  var links: js.Object = js.native
  
  var noContent: Boolean = js.native
  
  var notAcceptable: Boolean = js.native
  
  var notFound: Boolean = js.native
  
  var ok: Boolean = js.native
  
  var redirect: Boolean = js.native
  
  var redirects: js.Array[String] = js.native
  
  var serverError: Boolean = js.native
  
  var status: Double = js.native
  
  var statusType: Double = js.native
  
  var text: String = js.native
  
  var `type`: String = js.native
  
  var unauthorized: Boolean = js.native
  
  var xhr: XMLHttpRequest = js.native
}
