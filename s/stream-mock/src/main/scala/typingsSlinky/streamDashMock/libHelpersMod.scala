package typingsSlinky.streamDashMock

import typingsSlinky.node.Buffer
import typingsSlinky.streamDashMock.libTypesChunkMod.IChunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/helpers", JSImport.Namespace)
@js.native
object libHelpersMod extends js.Object {
  def chunk2Buffer(chunk: IChunk): Buffer = js.native
}

