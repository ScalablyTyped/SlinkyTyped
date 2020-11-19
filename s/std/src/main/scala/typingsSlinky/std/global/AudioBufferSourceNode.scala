package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.AudioBufferSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AudioBufferSourceNode")
@js.native
class AudioBufferSourceNode protected ()
  extends typingsSlinky.std.AudioBufferSourceNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: AudioBufferSourceOptions) = this()
}
@JSGlobal("AudioBufferSourceNode")
@js.native
object AudioBufferSourceNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.AudioBufferSourceNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ AudioBufferSourceOptions, 
      org.scalajs.dom.raw.AudioBufferSourceNode
    ]
