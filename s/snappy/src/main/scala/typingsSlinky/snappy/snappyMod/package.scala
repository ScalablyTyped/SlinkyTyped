package typingsSlinky.snappy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snappyMod {
  import typingsSlinky.node.Buffer

  type booleanCallback = js.Function2[/* err */ js.Error | Null, /* data */ Boolean, Unit]
  type bufferCallback = js.Function2[/* err */ js.Error | Null, /* data */ Buffer, Unit]
  type bufferOrStringCallback = js.Function2[/* err */ js.Error | Null, /* data */ Buffer | String, Unit]
}
