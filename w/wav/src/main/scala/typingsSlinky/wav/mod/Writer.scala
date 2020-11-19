package typingsSlinky.wav.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.wav.wavStrings.LE
import typingsSlinky.wav.wavStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wav", "Writer")
@js.native
class Writer () extends Transform {
  def this(opts: WriterOptions) = this()
  
  @JSName("addListener")
  def addListener_header(event: header, listener: js.Function1[/* header */ Buffer, Unit]): this.type = js.native
  
  var bitDepth: Double = js.native
  
  var bytesProcessed: Double = js.native
  
  var channels: Double = js.native
  
  var endianness: LE = js.native
  
  var format: Double = js.native
  
  @JSName("on")
  def on_header(event: header, listener: js.Function1[/* header */ Buffer, Unit]): this.type = js.native
  
  var sampleRate: Double = js.native
}
