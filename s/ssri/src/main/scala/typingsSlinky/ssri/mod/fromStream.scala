package typingsSlinky.ssri.mod

import typingsSlinky.node.streamMod.Readable
import typingsSlinky.ssri.anon.Algorithms
import typingsSlinky.ssri.anon.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromStream")
@js.native
object fromStream extends js.Object {
  def apply(stream: Readable): js.Thenable[IntegrityMap] = js.native
  def apply(stream: Readable, opts: Algorithms): js.Promise[IntegrityMap] = js.native
  def apply(stream: Readable, opts: Promise): js.Thenable[IntegrityMap] = js.native
}

