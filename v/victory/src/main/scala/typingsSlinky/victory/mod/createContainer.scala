package typingsSlinky.victory.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("victory", "createContainer")
@js.native
object createContainer extends js.Object {
  def apply[V, W](c1: ContainerType, c2: ContainerType): ReactComponentClass[V with W] = js.native
}

