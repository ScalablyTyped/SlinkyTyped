package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sequelize.mod.TransactionIsolationLevelReadUncommitted
  - typingsSlinky.sequelize.mod.TransactionIsolationLevelReadCommitted
  - typingsSlinky.sequelize.mod.TransactionIsolationLevelRepeatableRead
  - typingsSlinky.sequelize.mod.TransactionIsolationLevelSerializable
*/
trait TransactionIsolationLevel extends js.Object

object TransactionIsolationLevel {
  @scala.inline
  implicit def apply(value: TransactionIsolationLevelReadCommitted): TransactionIsolationLevel = value.asInstanceOf[TransactionIsolationLevel]
  @scala.inline
  implicit def apply(value: TransactionIsolationLevelReadUncommitted): TransactionIsolationLevel = value.asInstanceOf[TransactionIsolationLevel]
  @scala.inline
  implicit def apply(value: TransactionIsolationLevelRepeatableRead): TransactionIsolationLevel = value.asInstanceOf[TransactionIsolationLevel]
  @scala.inline
  implicit def apply(value: TransactionIsolationLevelSerializable): TransactionIsolationLevel = value.asInstanceOf[TransactionIsolationLevel]
}

