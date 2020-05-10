package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.sequelizeStrings.`foreign key`
import typingsSlinky.sequelize.sequelizeStrings.`primary key`
import typingsSlinky.sequelize.sequelizeStrings.check
import typingsSlinky.sequelize.sequelizeStrings.default
import typingsSlinky.sequelize.sequelizeStrings.unique_
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
  def AddDefaultConstraintOptions(`type`: default): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddForeignKeyConstraintOptions(onDelete: String, onUpdate: String, `type`: `foreign key`): AddConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddCheckConstraintOptions(`type`: check): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddUniqueConstraintOptions(`type`: unique_): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddPrimaryKeyConstraintOptions(`type`: `primary key`): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
}

