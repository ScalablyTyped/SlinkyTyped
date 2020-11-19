package typingsSlinky.streamMock

import typingsSlinky.node.Buffer
import typingsSlinky.streamMock.chunkMod.IChunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-mock/lib/helpers/converters", JSImport.Namespace)
@js.native
object convertersMod extends js.Object {
  
  def chunk2Buffer(chunk: IChunk): Buffer = js.native
}
