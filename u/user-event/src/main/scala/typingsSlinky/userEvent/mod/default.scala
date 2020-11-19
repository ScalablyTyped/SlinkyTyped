package typingsSlinky.userEvent.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("user-event", JSImport.Default)
@js.native
object default extends js.Object {
  
  def click(element: Element): Unit = js.native
  def click(element: Window): Unit = js.native
  
  def dblClick(element: Element): Unit = js.native
  def dblClick(element: Window): Unit = js.native
  
  def selectOptions(element: Element, values: String): Unit = js.native
  def selectOptions(element: Element, values: js.Array[String]): Unit = js.native
  def selectOptions(element: Window, values: String): Unit = js.native
  def selectOptions(element: Window, values: js.Array[String]): Unit = js.native
  
  def `type`(element: Element, text: String): js.Promise[Unit] = js.native
  def `type`(element: Element, text: String, userOpts: UserOpts): js.Promise[Unit] = js.native
  def `type`(element: Window, text: String): js.Promise[Unit] = js.native
  def `type`(element: Window, text: String, userOpts: UserOpts): js.Promise[Unit] = js.native
}
