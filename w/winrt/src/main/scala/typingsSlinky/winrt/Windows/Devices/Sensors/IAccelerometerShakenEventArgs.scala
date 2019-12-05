package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerShakenEventArgs extends js.Object {
  var timestamp: js.Date
}

object IAccelerometerShakenEventArgs {
  @scala.inline
  def apply(timestamp: js.Date): IAccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAccelerometerShakenEventArgs]
  }
}

