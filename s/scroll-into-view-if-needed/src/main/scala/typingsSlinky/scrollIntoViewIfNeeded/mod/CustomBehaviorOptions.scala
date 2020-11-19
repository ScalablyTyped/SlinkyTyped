package typingsSlinky.scrollIntoViewIfNeeded.mod

import typingsSlinky.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typingsSlinky.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomBehaviorOptions[T]
  extends typingsSlinky.scrollIntoViewIfNeeded.typesMod.Options {
  
  def behavior(actions: js.Array[CustomScrollAction]): T = js.native
  @JSName("behavior")
  var behavior_Original: CustomScrollBehaviorCallback[T] = js.native
}
