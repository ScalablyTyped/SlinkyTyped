package typingsSlinky.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends StObject {
  
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[js.Error] = js.native
  
  var table: js.UndefOr[String] = js.native
}
object Fields {
  
  @scala.inline
  def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setParent(value: js.Error): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
