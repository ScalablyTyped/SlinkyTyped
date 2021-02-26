package typingsSlinky.thenRequest

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.formData.mod.Options
import typingsSlinky.formData.mod.^
import typingsSlinky.node.Buffer
import typingsSlinky.thenRequest.requestFnMod.RequestFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("then-request", JSImport.Default)
  @js.native
  val default: RequestFn = js.native
  
  @JSImport("then-request", "FormData")
  @js.native
  class FormData () extends ^ {
    def this(options: Options) = this()
  }
  
  @JSImport("then-request", "ResponsePromise")
  @js.native
  class ResponsePromise ()
    extends typingsSlinky.thenRequest.responsePromiseMod.ResponsePromise
  
  type Response = typingsSlinky.httpResponseObject.mod.^[Buffer | String]
  
  type _To = RequestFn
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RequestFn = default
}
