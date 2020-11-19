package typingsSlinky.urlrouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HttpHandler = js.Function3[
    /* req */ typingsSlinky.urlrouter.mod.ServerRequest, 
    /* res */ typingsSlinky.urlrouter.mod.ServerResponse, 
    /* next */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  
  type ServerResponse = typingsSlinky.node.httpMod.ServerResponse
}
