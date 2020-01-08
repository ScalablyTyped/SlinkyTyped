package typingsSlinky.scrollDashIntoDashViewDashIfDashNeeded.scrollDashIntoDashViewDashIfDashNeededMod

import typingsSlinky.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.CustomScrollAction
import typingsSlinky.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.CustomScrollBehaviorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomBehaviorOptions[T]
  extends typingsSlinky.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.Options {
  @JSName("behavior")
  var behavior_Original: CustomScrollBehaviorCallback[T] = js.native
  def behavior(actions: js.Array[CustomScrollAction]): T = js.native
}

