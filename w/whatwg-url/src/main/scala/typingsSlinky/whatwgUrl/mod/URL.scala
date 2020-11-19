package typingsSlinky.whatwgUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("whatwg-url", "URL")
@js.native
class URL protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, base: String) = this()
  def this(url: String, base: URL) = this()
  
  var hash: String = js.native
  
  var host: String = js.native
  
  var hostname: String = js.native
  
  var href: String = js.native
  
  val origin: String = js.native
  
  var password: String = js.native
  
  var pathname: String = js.native
  
  var port: String = js.native
  
  var protocol: String = js.native
  
  var search: String = js.native
  
  val searchParams: URLSearchParams = js.native
  
  def toJSON(): String = js.native
  
  var username: String = js.native
}
