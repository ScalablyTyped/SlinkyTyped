package typingsSlinky.sharepoint.global.SP.Ribbon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.SP.Ribbon.WebPartComponentInitInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Ribbon.WebPartComponent")
@js.native
class WebPartComponent ()
  extends typingsSlinky.sharepoint.SP.Ribbon.WebPartComponent {
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  /* CompleteClass */
  override def getFocusedCommands(): js.Array[String] = js.native
  /* CompleteClass */
  override def getGlobalCommands(): js.Array[String] = js.native
  /* CompleteClass */
  override def getId(): String = js.native
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  /* CompleteClass */
  override def init(): Unit = js.native
  /* CompleteClass */
  override def isFocusable(): Boolean = js.native
  /* CompleteClass */
  override def receiveFocus(): Boolean = js.native
  /* CompleteClass */
  override def selectWebPart(zc: HTMLElement, setNextRibbonTab: Boolean): Unit = js.native
  /* CompleteClass */
  override def yieldFocus(): Boolean = js.native
}

/* static members */
@JSGlobal("SP.Ribbon.WebPartComponent")
@js.native
object WebPartComponent extends js.Object {
  def get_instance(): typingsSlinky.sharepoint.SP.Ribbon.WebPartComponent = js.native
  def registerWithPageManager(initInfo: WebPartComponentInitInfo): Unit = js.native
}

