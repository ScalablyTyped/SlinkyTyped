package typingsSlinky.winrt.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasicProperties extends js.Object {
  var dateModified: js.Date
  var itemDate: js.Date
  var size: Double
}

object IBasicProperties {
  @scala.inline
  def apply(dateModified: js.Date, itemDate: js.Date, size: Double): IBasicProperties = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], itemDate = itemDate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBasicProperties]
  }
}

