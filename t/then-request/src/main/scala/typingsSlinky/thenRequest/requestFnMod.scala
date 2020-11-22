package typingsSlinky.thenRequest

import typingsSlinky.httpBasic.httpVerbMod.HttpVerb
import typingsSlinky.thenRequest.optionsMod.Options
import typingsSlinky.thenRequest.responsePromiseMod.ResponsePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("then-request/lib/RequestFn", JSImport.Namespace)
@js.native
object requestFnMod extends js.Object {
  
  type RequestFn = js.Function3[
    /* method */ HttpVerb, 
    /* url */ String, 
    /* options */ js.UndefOr[Options], 
    ResponsePromise
  ]
}
