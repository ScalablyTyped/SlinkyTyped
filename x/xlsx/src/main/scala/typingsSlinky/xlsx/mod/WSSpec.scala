package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.xlsx.mod.WorkSheet
*/
trait WSSpec extends js.Object

object WSSpec {
  @scala.inline
  implicit def apply(value: Double): WSSpec = value.asInstanceOf[WSSpec]
  @scala.inline
  implicit def apply(value: String): WSSpec = value.asInstanceOf[WSSpec]
  @scala.inline
  implicit def apply(value: WorkSheet): WSSpec = value.asInstanceOf[WSSpec]
}

