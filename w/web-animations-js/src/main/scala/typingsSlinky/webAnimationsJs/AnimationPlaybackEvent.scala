package typingsSlinky.webAnimationsJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPlaybackEvent extends js.Object {
  var bubbles: Boolean = js.native
  var cancelable: Boolean = js.native
  var currentTarget: Animation = js.native
  val currentTime: Double | Null = js.native
  var defaultPrevented: Boolean = js.native
  var eventPhase: Double = js.native
  var target: Animation = js.native
  var timeStamp: Double = js.native
  val timelineTime: Double | Null = js.native
  var `type`: String = js.native
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
object AnimationPlaybackEvent
  extends Instantiable1[/* type */ String, AnimationPlaybackEvent]
     with Instantiable2[
      /* type */ String, 
      /* eventInitDict */ AnimationPlaybackEventInit, 
      AnimationPlaybackEvent
    ]

