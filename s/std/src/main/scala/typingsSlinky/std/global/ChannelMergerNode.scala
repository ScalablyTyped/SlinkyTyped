package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.ChannelMergerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChannelMergerNode")
@js.native
class ChannelMergerNode protected ()
  extends typingsSlinky.std.AudioNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: ChannelMergerOptions) = this()
}

@JSGlobal("ChannelMergerNode")
@js.native
object ChannelMergerNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.ChannelMergerNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ ChannelMergerOptions, 
      org.scalajs.dom.raw.ChannelMergerNode
    ]

