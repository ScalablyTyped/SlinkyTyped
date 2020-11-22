package typingsSlinky.thenRequest

import typingsSlinky.formData.mod.Options
import typingsSlinky.formData.mod.^
import typingsSlinky.node.Buffer
import typingsSlinky.thenRequest.requestFnMod.RequestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("then-request", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: RequestFn = js.native
  
  @js.native
  class FormData () extends ^ {
    def this(options: Options) = this()
  }
  
  @js.native
  class ResponsePromise ()
    extends typingsSlinky.thenRequest.responsePromiseMod.ResponsePromise
  
  type Response = typingsSlinky.httpResponseObject.mod.^[Buffer | String]
}
