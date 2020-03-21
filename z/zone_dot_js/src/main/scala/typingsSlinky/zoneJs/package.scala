package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zoneJs {
  /**
    * Patch Function to allow user define their own monkey patch module.
    */
  type PatchFn = js.Function3[
    /* global */ typingsSlinky.std.Window_, 
    /* Zone */ typingsSlinky.zoneJs.ZoneType, 
    /* api */ typingsSlinky.zoneJs.ZonePrivate, 
    scala.Unit
  ]
}
