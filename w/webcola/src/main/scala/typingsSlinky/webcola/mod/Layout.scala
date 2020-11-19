package typingsSlinky.webcola.mod

import typingsSlinky.webcola.anon.X
import typingsSlinky.webcola.layoutMod.Group
import typingsSlinky.webcola.layoutMod.Link
import typingsSlinky.webcola.layoutMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Layout")
@js.native
class Layout ()
  extends typingsSlinky.webcola.layoutMod.Layout
/* static members */
@JSImport("webcola", "Layout")
@js.native
object Layout extends js.Object {
  
  def drag(d: Group, position: X): Unit = js.native
  def drag(d: Node, position: X): Unit = js.native
  
  def dragEnd(d: js.Any): Unit = js.native
  
  def dragOrigin(d: Group): X = js.native
  def dragOrigin(d: Node): X = js.native
  
  def dragStart(d: Group): Unit = js.native
  def dragStart(d: Node): Unit = js.native
  
  def getSourceIndex(e: Link[Node | Double]): Double = js.native
  
  def getTargetIndex(e: Link[Node | Double]): Double = js.native
  
  def linkId(e: Link[Node | Double]): String = js.native
  
  def mouseOut(d: js.Any): Unit = js.native
  
  def mouseOver(d: js.Any): Unit = js.native
  
  def setLinkLength(link: Link[Node | Double], length: Double): Unit = js.native
  
  var stopNode: js.Any = js.native
  
  var storeOffset: js.Any = js.native
}
