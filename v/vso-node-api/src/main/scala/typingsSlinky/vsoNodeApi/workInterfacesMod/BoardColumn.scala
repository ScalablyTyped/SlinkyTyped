package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardColumn extends StObject {
  
  var columnType: BoardColumnType = js.native
  
  var description: String = js.native
  
  var id: String = js.native
  
  var isSplit: Boolean = js.native
  
  var itemLimit: Double = js.native
  
  var name: String = js.native
  
  var stateMappings: StringDictionary[String] = js.native
}
object BoardColumn {
  
  @scala.inline
  def apply(
    columnType: BoardColumnType,
    description: String,
    id: String,
    isSplit: Boolean,
    itemLimit: Double,
    name: String,
    stateMappings: StringDictionary[String]
  ): BoardColumn = {
    val __obj = js.Dynamic.literal(columnType = columnType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSplit = isSplit.asInstanceOf[js.Any], itemLimit = itemLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stateMappings = stateMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardColumn]
  }
  
  @scala.inline
  implicit class BoardColumnMutableBuilder[Self <: BoardColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnType(value: BoardColumnType): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSplit(value: Boolean): Self = StObject.set(x, "isSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemLimit(value: Double): Self = StObject.set(x, "itemLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMappings(value: StringDictionary[String]): Self = StObject.set(x, "stateMappings", value.asInstanceOf[js.Any])
  }
}
