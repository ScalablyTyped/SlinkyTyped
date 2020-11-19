package typingsSlinky.wav.mod

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import typingsSlinky.wav.wavStrings.chunk
import typingsSlinky.wav.wavStrings.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wav", "Reader")
@js.native
class Reader () extends Transform {
  def this(opts: TransformOptions) = this()
  
  @JSName("addListener")
  def addListener_chunk(event: chunk, listener: js.Function1[/* unknownChunk */ UnknownChunk, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_format(event: format, listener: js.Function1[/* format */ Format, Unit]): this.type = js.native
  
  @JSName("on")
  def on_chunk(event: chunk, listener: js.Function1[/* unknownChunk */ UnknownChunk, Unit]): this.type = js.native
  @JSName("on")
  def on_format(event: format, listener: js.Function1[/* format */ Format, Unit]): this.type = js.native
}
