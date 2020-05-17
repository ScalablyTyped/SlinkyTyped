package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.StereoPannerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StereoPannerNode")
@js.native
class StereoPannerNode protected ()
  extends typingsSlinky.std.StereoPannerNode {
  def this(context: typingsSlinky.std.BaseAudioContext) = this()
  def this(context: typingsSlinky.std.BaseAudioContext, options: StereoPannerOptions) = this()
}

@JSGlobal("StereoPannerNode")
@js.native
object StereoPannerNode
  extends Instantiable1[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      org.scalajs.dom.raw.StereoPannerNode
    ]
     with Instantiable2[
      /* context */ typingsSlinky.std.BaseAudioContext, 
      /* options */ StereoPannerOptions, 
      org.scalajs.dom.raw.StereoPannerNode
    ]

