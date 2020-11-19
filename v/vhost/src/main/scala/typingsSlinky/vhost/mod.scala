package typingsSlinky.vhost

import typingsSlinky.express.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vhost", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(hostname: String, handler: Handler): String = js.native
  def apply(hostname: js.RegExp, handler: Handler): String = js.native
}
