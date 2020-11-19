package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.GainOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GainNode")
@js.native
class GainNode protected ()
  extends typingsSlinky.std.GainNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: GainOptions) = this()
}
@JSGlobal("GainNode")
@js.native
object GainNode
  extends Instantiable1[/* context */ typingsSlinky.std.BaseAudioContext, org.scalajs.dom.raw.GainNode]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ GainOptions, 
      org.scalajs.dom.raw.GainNode
    ]
