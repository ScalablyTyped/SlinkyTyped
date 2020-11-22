package typingsSlinky.thenRequest

import typingsSlinky.httpResponseObject.mod.^
import typingsSlinky.node.Buffer
import typingsSlinky.thenRequest.requestFnMod.RequestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("then-request/lib/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  val FormData: js.Any = js.native
  
  val default: RequestFn = js.native
  
  @js.native
  class ResponsePromise ()
    extends typingsSlinky.thenRequest.responsePromiseMod.ResponsePromise
  
  type Response = ^[Buffer | String]
}
