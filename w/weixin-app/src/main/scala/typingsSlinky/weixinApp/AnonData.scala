package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: String | scala.scalajs.js.typedarray.ArrayBuffer
}

object AnonData {
  @scala.inline
  def apply(data: String | scala.scalajs.js.typedarray.ArrayBuffer): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

