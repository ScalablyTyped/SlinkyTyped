package typingsSlinky.shot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  
  type Listener = js.Function2[
    /* req */ typingsSlinky.shot.mod.SimulatedRequestObject, 
    /* res */ typingsSlinky.shot.mod.SimulatedResponseObject, 
    scala.Unit
  ]
  
  type SimulatedRequestObject = typingsSlinky.node.streamMod.Readable
  
  type SimulatedResponseObject = typingsSlinky.node.httpMod.ServerResponse
}
