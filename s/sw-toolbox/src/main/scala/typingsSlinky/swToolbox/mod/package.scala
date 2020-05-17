package typingsSlinky.swToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler = js.Function1[
    /* request */ typingsSlinky.swToolbox.mod.Request, 
    js.Promise[typingsSlinky.swToolbox.mod.Response]
  ]
}
