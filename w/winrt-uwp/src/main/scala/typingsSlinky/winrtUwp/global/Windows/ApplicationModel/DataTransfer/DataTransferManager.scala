package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Programmatically initiates an exchange of content with other apps. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
abstract class DataTransferManager ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
object DataTransferManager extends js.Object {
  /**
    * Returns the DataTransferManager object associated with the current window.
    * @return The DataTransferManager object associated with the current window.
    */
  def getForCurrentView(): typingsSlinky.winrtUwp.Windows.ApplicationModel.DataTransfer.DataTransferManager = js.native
  /** Programmatically initiates the user interface for sharing content with another app. */
  def showShareUI(): Unit = js.native
}

