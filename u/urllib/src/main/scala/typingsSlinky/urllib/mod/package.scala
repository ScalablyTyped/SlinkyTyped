package typingsSlinky.urllib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function3[
    /* err */ js.Error, 
    /* data */ T, 
    /* res */ typingsSlinky.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
}
