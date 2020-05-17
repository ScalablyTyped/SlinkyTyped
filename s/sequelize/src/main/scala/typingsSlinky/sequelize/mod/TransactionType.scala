package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sequelize.mod.TransactionTypeDeferred
  - typingsSlinky.sequelize.mod.TransactionTypeImmediate
  - typingsSlinky.sequelize.mod.TransactionTypeExclusive
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  implicit def apply(value: TransactionTypeDeferred): TransactionType = value.asInstanceOf[TransactionType]
  @scala.inline
  implicit def apply(value: TransactionTypeExclusive): TransactionType = value.asInstanceOf[TransactionType]
  @scala.inline
  implicit def apply(value: TransactionTypeImmediate): TransactionType = value.asInstanceOf[TransactionType]
}

