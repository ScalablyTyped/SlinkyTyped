package typingsSlinky.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeFilterOption extends js.Object {
  var end: String | Double | js.Date
  var field: String
  var start: String | Double | js.Date
}

object RangeFilterOption {
  @scala.inline
  def apply(end: String | Double | js.Date, field: String, start: String | Double | js.Date): RangeFilterOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeFilterOption]
  }
}

