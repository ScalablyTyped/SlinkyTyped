package typingsSlinky.scrollIntoViewIfNeeded.mod

import typingsSlinky.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typingsSlinky.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomBehaviorOptions[T]
  extends typingsSlinky.scrollIntoViewIfNeeded.typesMod.Options {
  @JSName("behavior")
  var behavior_Original: CustomScrollBehaviorCallback[T] = js.native
  def behavior(actions: js.Array[CustomScrollAction]): T = js.native
}

