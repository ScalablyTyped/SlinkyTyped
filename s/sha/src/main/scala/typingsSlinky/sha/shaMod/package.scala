package typingsSlinky.sha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shaMod {
  type CheckCallback[R] = js.Function1[/* err */ js.Error | Null, R]
  type GetCallback = js.Function2[/* err */ js.Error | Null, /* actual */ String, Unit]
}
