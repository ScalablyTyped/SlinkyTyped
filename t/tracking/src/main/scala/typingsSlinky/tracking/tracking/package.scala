package typingsSlinky.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tracking {
  
  /**
    * Color match predicate function.
    */
  type ColorFunction = js.Function3[/* r */ scala.Double, /* g */ scala.Double, /* b */ scala.Double, scala.Boolean]
  
  /**
    * Listener callback type for track events.
    */
  type TrackEventListener = js.Function1[/* event */ typingsSlinky.tracking.tracking.TrackEvent, scala.Unit]
}
