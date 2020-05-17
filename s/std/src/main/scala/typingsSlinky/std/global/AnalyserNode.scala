package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.AnalyserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AnalyserNode")
@js.native
class AnalyserNode protected ()
  extends typingsSlinky.std.AnalyserNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: AnalyserOptions) = this()
}

@JSGlobal("AnalyserNode")
@js.native
object AnalyserNode
  extends Instantiable1[/* context */ typingsSlinky.std.BaseAudioContext, org.scalajs.dom.raw.AnalyserNode]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ AnalyserOptions, 
      org.scalajs.dom.raw.AnalyserNode
    ]

