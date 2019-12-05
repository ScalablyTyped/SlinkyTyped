package typingsSlinky.atUifabricUtilities

import typingsSlinky.atUifabricUtilities.libIRectangleMod.IRectangle
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/getRect", JSImport.Namespace)
@js.native
object libDomGetRectMod extends js.Object {
  def getRect(): js.UndefOr[IRectangle] = js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  def getRect(element: Window): js.UndefOr[IRectangle] = js.native
}

