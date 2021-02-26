package typingsSlinky.thenRequest

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.httpResponseObject.mod.^
import typingsSlinky.node.Buffer
import typingsSlinky.thenRequest.requestFnMod.RequestFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod extends Shortcut {
  
  @JSImport("then-request/lib/browser", JSImport.Default)
  @js.native
  val default: RequestFn = js.native
  
  @JSImport("then-request/lib/browser", "FormData")
  @js.native
  val FormData: js.Any = js.native
  
  @JSImport("then-request/lib/browser", "ResponsePromise")
  @js.native
  class ResponsePromise ()
    extends typingsSlinky.thenRequest.responsePromiseMod.ResponsePromise
  
  type Response = ^[Buffer | String]
  
  type _To = RequestFn
  
  /* This means you don't have to write `default`, but can instead just say `browserMod.foo` */
  override def _to: RequestFn = default
}
