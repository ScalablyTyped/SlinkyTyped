package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.DelayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DelayNode")
@js.native
class DelayNode protected ()
  extends typingsSlinky.std.DelayNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: DelayOptions) = this()
}

@JSGlobal("DelayNode")
@js.native
object DelayNode
  extends Instantiable1[/* context */ typingsSlinky.std.BaseAudioContext, org.scalajs.dom.raw.DelayNode]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ DelayOptions, 
      org.scalajs.dom.raw.DelayNode
    ]

