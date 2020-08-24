package typingsSlinky.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectMod {
  type ConnectionListener = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* client */ typingsSlinky.stompit.clientMod.^, 
    scala.Unit
  ]
}
