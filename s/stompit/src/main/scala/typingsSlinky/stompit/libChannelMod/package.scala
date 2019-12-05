package typingsSlinky.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libChannelMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.Readable

  type Body = String | Buffer | js.Function0[Readable]
}
