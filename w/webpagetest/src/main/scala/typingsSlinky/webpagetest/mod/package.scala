package typingsSlinky.webpagetest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[R] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* data */ js.UndefOr[R], 
    /* info */ js.Any, 
    scala.Unit
  ]
  type TestScript = js.Array[typingsSlinky.webpagetest.mod.TestScriptCommand]
}
