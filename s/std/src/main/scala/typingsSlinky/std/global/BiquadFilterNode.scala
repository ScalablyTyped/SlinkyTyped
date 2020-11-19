package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.BiquadFilterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BiquadFilterNode")
@js.native
class BiquadFilterNode protected ()
  extends typingsSlinky.std.BiquadFilterNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: BiquadFilterOptions) = this()
}
@JSGlobal("BiquadFilterNode")
@js.native
object BiquadFilterNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.BiquadFilterNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ BiquadFilterOptions, 
      org.scalajs.dom.raw.BiquadFilterNode
    ]
