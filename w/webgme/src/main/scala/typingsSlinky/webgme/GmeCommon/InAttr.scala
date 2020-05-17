package typingsSlinky.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webgme.GmeCommon.RegObj
  - typingsSlinky.webgme.GmeCommon.Primitive
  - scala.Null
*/
trait InAttr extends js.Object

object InAttr {
  @scala.inline
  implicit def apply(value: Null): InAttr = value.asInstanceOf[InAttr]
  @scala.inline
  implicit def apply(value: Primitive): InAttr = value.asInstanceOf[InAttr]
  @scala.inline
  implicit def apply(value: RegObj): InAttr = value.asInstanceOf[InAttr]
}

