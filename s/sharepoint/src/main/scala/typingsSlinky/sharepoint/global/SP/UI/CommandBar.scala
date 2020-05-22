package typingsSlinky.sharepoint.global.SP.UI

import typingsSlinky.sharepoint.SP.HtmlBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.CommandBar")
@js.native
class CommandBar ()
  extends typingsSlinky.sharepoint.SP.UI.CommandBar {
  /* CompleteClass */
  override def addCommand(action: typingsSlinky.sharepoint.SP.UI.Command): Unit = js.native
  /* CompleteClass */
  override def attachEvents(): Unit = js.native
  /* CompleteClass */
  override def findCommandByName(name: String): typingsSlinky.sharepoint.SP.UI.Command = js.native
  /* CompleteClass */
  override def get_commands(): js.Array[typingsSlinky.sharepoint.SP.UI.Command] = js.native
  /* CompleteClass */
  override def get_dropDownThreshold(): Double = js.native
  /* CompleteClass */
  override def get_elementID(): String = js.native
  /* CompleteClass */
  override def get_overrideClass(): String = js.native
  /* CompleteClass */
  override def insertCommand(action: typingsSlinky.sharepoint.SP.UI.Command, position: Double): Unit = js.native
  /* CompleteClass */
  override def render(builder: HtmlBuilder): Unit = js.native
  /* CompleteClass */
  override def set_dropDownThreshold(value: Double): Double = js.native
  /* CompleteClass */
  override def set_overrideClass(value: String): String = js.native
}

