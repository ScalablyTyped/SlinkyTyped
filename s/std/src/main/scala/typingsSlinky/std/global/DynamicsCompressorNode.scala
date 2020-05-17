package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.DynamicsCompressorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DynamicsCompressorNode")
@js.native
class DynamicsCompressorNode protected ()
  extends typingsSlinky.std.DynamicsCompressorNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: DynamicsCompressorOptions) = this()
}

@JSGlobal("DynamicsCompressorNode")
@js.native
object DynamicsCompressorNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.DynamicsCompressorNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ DynamicsCompressorOptions, 
      org.scalajs.dom.raw.DynamicsCompressorNode
    ]

