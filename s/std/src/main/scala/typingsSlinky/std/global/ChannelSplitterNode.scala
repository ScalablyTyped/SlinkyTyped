package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.ChannelSplitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChannelSplitterNode")
@js.native
class ChannelSplitterNode protected ()
  extends typingsSlinky.std.AudioNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: ChannelSplitterOptions) = this()
}

@JSGlobal("ChannelSplitterNode")
@js.native
object ChannelSplitterNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.ChannelSplitterNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ ChannelSplitterOptions, 
      org.scalajs.dom.raw.ChannelSplitterNode
    ]

