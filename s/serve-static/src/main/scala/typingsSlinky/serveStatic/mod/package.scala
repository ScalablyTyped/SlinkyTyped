package typingsSlinky.serveStatic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RequestHandler[R /* <: typingsSlinky.node.httpMod.ServerResponse */] = js.Function3[
    /* request */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* response */ R, 
    /* next */ js.Function0[scala.Unit], 
    js.Any
  ]
}
