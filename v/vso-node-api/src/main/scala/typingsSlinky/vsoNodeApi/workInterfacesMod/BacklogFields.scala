package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogFields extends StObject {
  
  /**
    * Field Type (e.g. Order, Activity) to Field Reference Name map
    */
  var typeFields: StringDictionary[String] = js.native
}
object BacklogFields {
  
  @scala.inline
  def apply(typeFields: StringDictionary[String]): BacklogFields = {
    val __obj = js.Dynamic.literal(typeFields = typeFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogFields]
  }
  
  @scala.inline
  implicit class BacklogFieldsMutableBuilder[Self <: BacklogFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeFields(value: StringDictionary[String]): Self = StObject.set(x, "typeFields", value.asInstanceOf[js.Any])
  }
}
