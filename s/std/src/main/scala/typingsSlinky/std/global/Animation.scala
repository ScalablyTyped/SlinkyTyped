package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Animation")
@js.native
class Animation ()
  extends typingsSlinky.std.Animation {
  def this(effect: typingsSlinky.std.AnimationEffect) = this()
  def this(effect: js.UndefOr[scala.Nothing], timeline: typingsSlinky.std.AnimationTimeline) = this()
  def this(effect: Null, timeline: typingsSlinky.std.AnimationTimeline) = this()
  def this(effect: typingsSlinky.std.AnimationEffect, timeline: typingsSlinky.std.AnimationTimeline) = this()
}

@JSGlobal("Animation")
@js.native
object Animation
  extends Instantiable0[typingsSlinky.std.Animation]
     with Instantiable1[/* effect */ typingsSlinky.std.AnimationEffect, typingsSlinky.std.Animation]
     with Instantiable2[
      js.UndefOr[(/* effect */ typingsSlinky.std.AnimationEffect) | (/* effect */ Null)], 
      /* timeline */ typingsSlinky.std.AnimationTimeline, 
      typingsSlinky.std.Animation
    ]

