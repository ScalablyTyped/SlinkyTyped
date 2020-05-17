package typingsSlinky.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webgme.GmeCommon.DefStringObject
  - typingsSlinky.webgme.GmeCommon.DefIntegerObject
  - typingsSlinky.webgme.GmeCommon.DefFloatObject
  - typingsSlinky.webgme.GmeCommon.DefBoolObject
  - typingsSlinky.webgme.GmeCommon.DefAssetObject
*/
trait DefObject extends js.Object

object DefObject {
  @scala.inline
  implicit def apply(value: DefAssetObject): DefObject = value.asInstanceOf[DefObject]
  @scala.inline
  implicit def apply(value: DefBoolObject): DefObject = value.asInstanceOf[DefObject]
  @scala.inline
  implicit def apply(value: DefFloatObject): DefObject = value.asInstanceOf[DefObject]
  @scala.inline
  implicit def apply(value: DefIntegerObject): DefObject = value.asInstanceOf[DefObject]
  @scala.inline
  implicit def apply(value: DefStringObject): DefObject = value.asInstanceOf[DefObject]
}

