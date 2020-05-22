package typingsSlinky.sharepoint.global.SP.UI

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.sharepoint.SP.HtmlBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Command")
@js.native
class Command protected ()
  extends typingsSlinky.sharepoint.SP.UI.Command {
  def this(name: String, displayName: String) = this()
  /* CompleteClass */
  override def attachEvents(): Unit = js.native
  /* CompleteClass */
  override def get_displayName(): String = js.native
  /* CompleteClass */
  override def get_elementIDPrefix(): String = js.native
  /* CompleteClass */
  override def get_href(): String = js.native
  /* CompleteClass */
  override def get_isDropDownCommand(): Boolean = js.native
  /* CompleteClass */
  override def get_isEnabled(): Boolean = js.native
  /* CompleteClass */
  override def get_linkElement(): HTMLAnchorElement = js.native
  /* CompleteClass */
  override def get_name(): String = js.native
  /* CompleteClass */
  override def get_tooltip(): String = js.native
  /**Should override*/
  /* CompleteClass */
  override def onClick(): Unit = js.native
  /* CompleteClass */
  override def render(builder: HtmlBuilder): Unit = js.native
  /* CompleteClass */
  override def set_displayName(value: String): String = js.native
  /* CompleteClass */
  override def set_elementIDPrefix(value: String): String = js.native
  /* CompleteClass */
  override def set_isDropDownCommand(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_isEnabled(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def set_tooltip(value: String): String = js.native
}

