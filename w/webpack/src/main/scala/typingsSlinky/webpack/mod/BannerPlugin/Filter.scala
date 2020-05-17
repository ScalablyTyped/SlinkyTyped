package typingsSlinky.webpack.mod.BannerPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  implicit def apply(value: js.RegExp): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: String): Filter = value.asInstanceOf[Filter]
}

