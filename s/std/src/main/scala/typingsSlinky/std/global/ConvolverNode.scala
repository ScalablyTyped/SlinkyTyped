package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.ConvolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ConvolverNode")
@js.native
class ConvolverNode protected ()
  extends typingsSlinky.std.ConvolverNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: ConvolverOptions) = this()
}

@JSGlobal("ConvolverNode")
@js.native
object ConvolverNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.ConvolverNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ ConvolverOptions, 
      org.scalajs.dom.raw.ConvolverNode
    ]

