package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.OscillatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("OscillatorNode")
@js.native
class OscillatorNode protected ()
  extends typingsSlinky.std.OscillatorNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: OscillatorOptions) = this()
}
@JSGlobal("OscillatorNode")
@js.native
object OscillatorNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.OscillatorNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ OscillatorOptions, 
      org.scalajs.dom.raw.OscillatorNode
    ]
