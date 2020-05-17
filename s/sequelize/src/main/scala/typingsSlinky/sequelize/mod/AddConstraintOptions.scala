package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sequelize.mod.AddUniqueConstraintOptions
  - typingsSlinky.sequelize.mod.AddDefaultConstraintOptions
  - typingsSlinky.sequelize.mod.AddCheckConstraintOptions
  - typingsSlinky.sequelize.mod.AddPrimaryKeyConstraintOptions
  - typingsSlinky.sequelize.mod.AddForeignKeyConstraintOptions
*/
trait AddConstraintOptions extends js.Object

object AddConstraintOptions {
  @scala.inline
  implicit def apply(value: AddCheckConstraintOptions): AddConstraintOptions = value.asInstanceOf[AddConstraintOptions]
  @scala.inline
  implicit def apply(value: AddDefaultConstraintOptions): AddConstraintOptions = value.asInstanceOf[AddConstraintOptions]
  @scala.inline
  implicit def apply(value: AddForeignKeyConstraintOptions): AddConstraintOptions = value.asInstanceOf[AddConstraintOptions]
  @scala.inline
  implicit def apply(value: AddPrimaryKeyConstraintOptions): AddConstraintOptions = value.asInstanceOf[AddConstraintOptions]
  @scala.inline
  implicit def apply(value: AddUniqueConstraintOptions): AddConstraintOptions = value.asInstanceOf[AddConstraintOptions]
}

