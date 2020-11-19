package typingsSlinky.webcola.powergraphMod

import typingsSlinky.webcola.anon.Groups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola/dist/src/powergraph", "getGroups")
@js.native
object getGroups extends js.Object {
  
  def apply[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link]): Groups = js.native
  def apply[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link], rootGroup: js.Array[_]): Groups = js.native
}
