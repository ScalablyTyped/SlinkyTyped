package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.std.AudioWorkletNodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioWorkletNode")
@js.native
class AudioWorkletNode protected ()
  extends typingsSlinky.std.AudioWorkletNode {
  def this(context: typingsSlinky.std.BaseAudioContext, name: java.lang.String) = this()
  def this(
    context: typingsSlinky.std.BaseAudioContext,
    name: java.lang.String,
    options: AudioWorkletNodeOptions
  ) = this()
}

@JSGlobal("AudioWorkletNode")
@js.native
object AudioWorkletNode
  extends Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* name */ java.lang.String, 
      typingsSlinky.std.AudioWorkletNode
    ]
     with Instantiable3[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* name */ java.lang.String, 
      /* options */ AudioWorkletNodeOptions, 
      typingsSlinky.std.AudioWorkletNode
    ]

