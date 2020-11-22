package typingsSlinky.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type EventHandler = js.Function2[
    /* e */ org.scalajs.dom.raw.Event, 
    /* data */ typingsSlinky.vanillaSwipe.typesMod.EventData, 
    scala.Unit
  ]
  
  type Trace = js.Array[scala.Double]
}
