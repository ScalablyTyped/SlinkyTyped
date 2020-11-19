package typingsSlinky.whatwgMimetype.mod

import typingsSlinky.std.Map
import typingsSlinky.whatwgMimetype.anon.AllowParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIMEType extends js.Object {
  
  val essence: String = js.native
  
  def isHTML(): Boolean = js.native
  
  def isJavaScript(): Boolean = js.native
  def isJavaScript(opts: AllowParameters): Boolean = js.native
  
  def isXML(): Boolean = js.native
  
  val parameters: Map[String, String] = js.native
  
  var subtype: String = js.native
  
  var `type`: String = js.native
}
