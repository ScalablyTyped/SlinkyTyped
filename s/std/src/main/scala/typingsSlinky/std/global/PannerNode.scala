package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.PannerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PannerNode")
@js.native
class PannerNode protected ()
  extends typingsSlinky.std.PannerNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: PannerOptions) = this()
}

@JSGlobal("PannerNode")
@js.native
object PannerNode
  extends Instantiable1[/* context */ typingsSlinky.std.BaseAudioContext, org.scalajs.dom.raw.PannerNode]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ PannerOptions, 
      org.scalajs.dom.raw.PannerNode
    ]

