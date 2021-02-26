package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.sequelizeStrings.`foreign key`
import typingsSlinky.sequelize.sequelizeStrings.`primary key`
import typingsSlinky.sequelize.sequelizeStrings.check
import typingsSlinky.sequelize.sequelizeStrings.unique_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sequelize.mod.AddUniqueConstraintOptions
  - typingsSlinky.sequelize.mod.AddDefaultConstraintOptions
  - typingsSlinky.sequelize.mod.AddCheckConstraintOptions
  - typingsSlinky.sequelize.mod.AddPrimaryKeyConstraintOptions
  - typingsSlinky.sequelize.mod.AddForeignKeyConstraintOptions
*/
trait AddConstraintOptions extends StObject
object AddConstraintOptions {
  
  @scala.inline
  def AddCheckConstraintOptions(`type`: check): typingsSlinky.sequelize.mod.AddCheckConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sequelize.mod.AddCheckConstraintOptions]
  }
  
  @scala.inline
  def AddDefaultConstraintOptions(`type`: typingsSlinky.sequelize.sequelizeStrings.default): typingsSlinky.sequelize.mod.AddDefaultConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sequelize.mod.AddDefaultConstraintOptions]
  }
  
  @scala.inline
  def AddForeignKeyConstraintOptions(onDelete: String, onUpdate: String, `type`: `foreign key`): typingsSlinky.sequelize.mod.AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sequelize.mod.AddForeignKeyConstraintOptions]
  }
  
  @scala.inline
  def AddPrimaryKeyConstraintOptions(`type`: `primary key`): typingsSlinky.sequelize.mod.AddPrimaryKeyConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sequelize.mod.AddPrimaryKeyConstraintOptions]
  }
  
  @scala.inline
  def AddUniqueConstraintOptions(`type`: unique_): typingsSlinky.sequelize.mod.AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sequelize.mod.AddUniqueConstraintOptions]
  }
}
