package typingsSlinky.twit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* err */ js.Error, 
    /* result */ typingsSlinky.twit.mod.Response, 
    /* response */ typingsSlinky.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
  
  type Response = js.Object
}
