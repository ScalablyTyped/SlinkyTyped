package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait txAuthGenericArg extends js.Object {
  var content: scala.scalajs.js.typedarray.ArrayBuffer
  var contentType: java.lang.String
}

object txAuthGenericArg {
  @scala.inline
  def apply(content: scala.scalajs.js.typedarray.ArrayBuffer, contentType: java.lang.String): txAuthGenericArg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[txAuthGenericArg]
  }
}

