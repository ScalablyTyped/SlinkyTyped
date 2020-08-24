package typingsSlinky.wreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestCallback = js.Function2[
    /* uri */ java.lang.String, 
    /* options */ typingsSlinky.wreck.anon.RequestOptionspayloadanyu, 
    scala.Unit
  ]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[typingsSlinky.boom.mod.^[js.Any]], 
    /* details */ typingsSlinky.wreck.anon.Req, 
    scala.Unit
  ]
}
