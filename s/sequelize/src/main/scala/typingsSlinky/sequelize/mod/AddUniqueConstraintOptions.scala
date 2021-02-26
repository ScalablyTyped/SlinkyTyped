package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.sequelizeStrings.unique_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddUniqueConstraintOptions extends AddConstraintOptions {
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: unique_ = js.native
}
object AddUniqueConstraintOptions {
  
  @scala.inline
  def apply(`type`: unique_): AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUniqueConstraintOptions]
  }
  
  @scala.inline
  implicit class AddUniqueConstraintOptionsMutableBuilder[Self <: AddUniqueConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: unique_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
