package typingsSlinky.uifabricUtilities

import typingsSlinky.std.HTMLElement
import typingsSlinky.std.Window_
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/getRect", JSImport.Namespace)
@js.native
object getRectMod extends js.Object {
  def getRect(): js.UndefOr[IRectangle] = js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  def getRect(element: Window_): js.UndefOr[IRectangle] = js.native
}

