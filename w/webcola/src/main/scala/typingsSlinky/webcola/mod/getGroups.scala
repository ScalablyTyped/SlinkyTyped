package typingsSlinky.webcola.mod

import typingsSlinky.webcola.AnonGroups
import typingsSlinky.webcola.powergraphMod.LinkTypeAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "getGroups")
@js.native
object getGroups extends js.Object {
  def apply[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link]): AnonGroups = js.native
  def apply[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link], rootGroup: js.Array[_]): AnonGroups = js.native
}

