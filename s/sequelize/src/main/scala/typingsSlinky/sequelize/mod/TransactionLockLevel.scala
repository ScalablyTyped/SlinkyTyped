package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sequelize.mod.TransactionLockLevelUpdate
  - typingsSlinky.sequelize.mod.TransactionLockLevelShare
  - typingsSlinky.sequelize.mod.TransactionLockLevelKeyShare
  - typingsSlinky.sequelize.mod.TransactionLockLevelNoKeyUpdate
*/
trait TransactionLockLevel extends js.Object

object TransactionLockLevel {
  @scala.inline
  implicit def apply(value: TransactionLockLevelKeyShare): TransactionLockLevel = value.asInstanceOf[TransactionLockLevel]
  @scala.inline
  implicit def apply(value: TransactionLockLevelNoKeyUpdate): TransactionLockLevel = value.asInstanceOf[TransactionLockLevel]
  @scala.inline
  implicit def apply(value: TransactionLockLevelShare): TransactionLockLevel = value.asInstanceOf[TransactionLockLevel]
  @scala.inline
  implicit def apply(value: TransactionLockLevelUpdate): TransactionLockLevel = value.asInstanceOf[TransactionLockLevel]
}

