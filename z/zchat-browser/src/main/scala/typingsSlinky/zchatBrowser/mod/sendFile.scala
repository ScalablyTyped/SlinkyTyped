package typingsSlinky.zchatBrowser.mod

import org.scalajs.dom.raw.File
import typingsSlinky.zchatBrowser.AnonMimetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "sendFile")
@js.native
object sendFile extends js.Object {
  def apply(file: File): Unit = js.native
  def apply(file: File, callback: js.Function2[/* err */ SendFileErrorMessage, /* data */ AnonMimetype, Unit]): Unit = js.native
}

