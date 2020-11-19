package typingsSlinky.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type EventHandler = js.Function6[
    /* e */ org.scalajs.dom.raw.Event, 
    /* deltaX */ scala.Double, 
    /* deltaY */ scala.Double, 
    /* absX */ scala.Double, 
    /* absY */ scala.Double, 
    /* duration */ scala.Double, 
    scala.Unit
  ]
}
