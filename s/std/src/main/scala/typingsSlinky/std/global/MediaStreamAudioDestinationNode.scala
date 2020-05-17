package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.AudioNodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
class MediaStreamAudioDestinationNode protected ()
  extends typingsSlinky.std.MediaStreamAudioDestinationNode {
  def this(context: org.scalajs.dom.raw.AudioContext) = this()
  def this(context: org.scalajs.dom.raw.AudioContext, options: AudioNodeOptions) = this()
}

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
object MediaStreamAudioDestinationNode
  extends Instantiable1[
      /* context */ org.scalajs.dom.raw.AudioContext, 
      org.scalajs.dom.raw.MediaStreamAudioDestinationNode
    ]
     with Instantiable2[
      /* context */ org.scalajs.dom.raw.AudioContext, 
      /* options */ AudioNodeOptions, 
      org.scalajs.dom.raw.MediaStreamAudioDestinationNode
    ]

