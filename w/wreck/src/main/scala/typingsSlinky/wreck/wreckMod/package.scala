package typingsSlinky.wreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wreckMod {
  import typingsSlinky.wreck.Anon_Payload
  import typingsSlinky.wreck.Anon_Req

  type RequestCallback = js.Function2[/* uri */ String, /* options */ RequestOptions with Anon_Payload, Unit]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[typingsSlinky.boom.boomMod.^[js.Any]], 
    /* details */ Anon_Req, 
    Unit
  ]
}
