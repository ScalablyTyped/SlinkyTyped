package typingsSlinky.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueType extends js.Object {
  var date: js.Date
  var format: String
  var timestamp: Double
}

object ValueType {
  @scala.inline
  def apply(date: js.Date, format: String, timestamp: Double): ValueType = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValueType]
  }
}

