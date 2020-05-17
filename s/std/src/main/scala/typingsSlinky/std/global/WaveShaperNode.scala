package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.WaveShaperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WaveShaperNode")
@js.native
class WaveShaperNode protected ()
  extends typingsSlinky.std.WaveShaperNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: WaveShaperOptions) = this()
}

@JSGlobal("WaveShaperNode")
@js.native
object WaveShaperNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.WaveShaperNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ WaveShaperOptions, 
      org.scalajs.dom.raw.WaveShaperNode
    ]

