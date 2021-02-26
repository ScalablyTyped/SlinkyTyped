package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventField extends StObject {
  
  /**
    * Gets or sets the type of this field.
    */
  var fieldType: NotificationEventFieldType = js.native
  
  /**
    * Gets or sets the unique identifier of this field.
    */
  var id: String = js.native
  
  /**
    * Gets or sets the name of this field.
    */
  var name: String = js.native
  
  /**
    * Gets or sets the path to the field in the event object. This path can be either Json Path or XPath, depending on if the event will be serialized into Json or XML
    */
  var path: String = js.native
  
  /**
    * Gets or sets the scopes that this field supports. If not specified then the event type scopes apply.
    */
  var supportedScopes: js.Array[String] = js.native
}
object NotificationEventField {
  
  @scala.inline
  def apply(
    fieldType: NotificationEventFieldType,
    id: String,
    name: String,
    path: String,
    supportedScopes: js.Array[String]
  ): NotificationEventField = {
    val __obj = js.Dynamic.literal(fieldType = fieldType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventField]
  }
  
  @scala.inline
  implicit class NotificationEventFieldMutableBuilder[Self <: NotificationEventField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldType(value: NotificationEventFieldType): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopes(value: js.Array[String]): Self = StObject.set(x, "supportedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopesVarargs(value: String*): Self = StObject.set(x, "supportedScopes", js.Array(value :_*))
  }
}
