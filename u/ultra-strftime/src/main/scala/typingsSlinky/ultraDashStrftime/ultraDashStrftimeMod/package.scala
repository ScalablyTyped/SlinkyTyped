package typingsSlinky.ultraDashStrftime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ultraDashStrftimeMod {
  type StrftimeFunction = js.Function3[
    /* fmt */ String, 
    /* d */ js.UndefOr[js.Date], 
    /* options */ js.UndefOr[Options], 
    String
  ]
}
