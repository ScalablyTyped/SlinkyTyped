package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskReference extends StObject {
  
  var id: String = js.native
  
  var inputs: StringDictionary[String] = js.native
  
  var name: String = js.native
  
  var version: String = js.native
}
object TaskReference {
  
  @scala.inline
  def apply(id: String, inputs: StringDictionary[String], name: String, version: String): TaskReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskReference]
  }
  
  @scala.inline
  implicit class TaskReferenceMutableBuilder[Self <: TaskReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
