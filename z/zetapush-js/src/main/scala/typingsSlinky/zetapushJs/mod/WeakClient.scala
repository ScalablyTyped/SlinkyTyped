package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zetapush-js", "WeakClient")
@js.native
class WeakClient protected () extends Client {
  def this(options: WeakClientOptions) = this()
  
  def getToken(): Token = js.native
}
