package typingsSlinky.vsoNodeApi

import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/handlers/basiccreds", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class BasicCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    
    var password: String = js.native
    
    var username: String = js.native
  }
}
