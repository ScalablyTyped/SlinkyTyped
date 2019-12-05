package typingsSlinky.streamtest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamtestMod {
  import typingsSlinky.node.Buffer

  type Chunk = String | Buffer | scala.scalajs.js.typedarray.Uint8Array
  type NonNull = js.UndefOr[js.Object]
}
