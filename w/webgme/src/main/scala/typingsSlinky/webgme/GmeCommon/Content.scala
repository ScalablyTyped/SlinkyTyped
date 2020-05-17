package typingsSlinky.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webgme.GmeCommon.DataObject
  - typingsSlinky.webgme.GmeCommon.Buffer
  - js.Array[typingsSlinky.webgme.GmeCommon.Buffer]
*/
trait Content extends js.Object

object Content {
  @scala.inline
  implicit def apply(value: js.Array[Buffer] | Buffer): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: DataObject): Content = value.asInstanceOf[Content]
}

