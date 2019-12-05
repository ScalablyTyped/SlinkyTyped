package typingsSlinky.zchatDashBrowser.zchatDashBrowserMod

import org.scalajs.dom.raw.File
import typingsSlinky.zchatDashBrowser.Anon_Mimetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "sendFile")
@js.native
object sendFile extends js.Object {
  def apply(file: File): Unit = js.native
  def apply(file: File, callback: js.Function2[/* err */ SendFileErrorMessage, /* data */ Anon_Mimetype, Unit]): Unit = js.native
}

