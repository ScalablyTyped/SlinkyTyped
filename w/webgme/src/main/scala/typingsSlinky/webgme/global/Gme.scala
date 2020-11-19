package typingsSlinky.webgme.global

import typingsSlinky.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Gme")
@js.native
object Gme extends js.Object {
  
  /**
    * https://github.com/webgme/webgme/wiki/GME-Client-API
    * 
    * https://github.com/webgme/webgme/blob/master/src/client/js/client.js
    */
  @js.native
  class Client ()
    extends typingsSlinky.webgme.Gme.Client
  
  @js.native
  object Concepts extends js.Object {
    
    def isConnection(node: Node): Boolean = js.native
  }
}
