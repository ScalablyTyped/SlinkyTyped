package typingsSlinky.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sharedb.sharedbMod.AddNumOp
  - typingsSlinky.sharedb.sharedbMod.ListInsertOp
  - typingsSlinky.sharedb.sharedbMod.ListDeleteOp
  - typingsSlinky.sharedb.sharedbMod.ListReplaceOp
  - typingsSlinky.sharedb.sharedbMod.ListMoveOp
  - typingsSlinky.sharedb.sharedbMod.ObjectInsertOp
  - typingsSlinky.sharedb.sharedbMod.ObjectDeleteOp
  - typingsSlinky.sharedb.sharedbMod.ObjectReplaceOp
  - typingsSlinky.sharedb.sharedbMod.StringInsertOp
  - typingsSlinky.sharedb.sharedbMod.StringDeleteOp
  - typingsSlinky.sharedb.sharedbMod.SubtypeOp
*/
trait Op extends js.Object

object Op {
  @scala.inline
  implicit def apply(value: AddNumOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: ListDeleteOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: ListInsertOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: ListMoveOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: ListReplaceOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: ObjectDeleteOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: ObjectInsertOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: ObjectReplaceOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: StringDeleteOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: StringInsertOp): Op = value.asInstanceOf[Op]
  @scala.inline
  implicit def apply(value: SubtypeOp): Op = value.asInstanceOf[Op]
}

