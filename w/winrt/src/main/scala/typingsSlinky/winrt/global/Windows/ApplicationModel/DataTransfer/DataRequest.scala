package typingsSlinky.winrt.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataRequest")
@js.native
class DataRequest ()
  extends typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.DataRequest {
  /* CompleteClass */
  override var data: typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.DataPackage = js.native
  /* CompleteClass */
  override var deadline: js.Date = js.native
  /* CompleteClass */
  override def failWithDisplayText(value: String): Unit = js.native
  /* CompleteClass */
  override def getDeferral(): typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.DataRequestDeferral = js.native
}

