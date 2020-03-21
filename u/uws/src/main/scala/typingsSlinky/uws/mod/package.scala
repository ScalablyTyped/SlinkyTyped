package typingsSlinky.uws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ typingsSlinky.uws.AnonOrigin, 
    /* callback */ js.Function1[/* res */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type VerifyClientCallbackSync = js.Function1[/* info */ typingsSlinky.uws.AnonOrigin, scala.Boolean]
}
