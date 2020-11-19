package typingsSlinky.uifabricUtilities

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/dom/getRect", JSImport.Namespace)
@js.native
object getRectMod extends js.Object {
  
  def getRect(): js.UndefOr[IRectangle] = js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  def getRect(element: Window): js.UndefOr[IRectangle] = js.native
}
