package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.RenameInfoSuccess
  - typingsSlinky.typescript.mod.RenameInfoFailure
*/
trait RenameInfo extends js.Object

object RenameInfo {
  @scala.inline
  implicit def apply(value: RenameInfoFailure): RenameInfo = value.asInstanceOf[RenameInfo]
  @scala.inline
  implicit def apply(value: RenameInfoSuccess): RenameInfo = value.asInstanceOf[RenameInfo]
}

