package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceReference extends StObject {
  
  /**
    * An alias to be used when referencing the resource.
    */
  var alias: String = js.native
}
object ResourceReference {
  
  @scala.inline
  def apply(alias: String): ResourceReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceReference]
  }
  
  @scala.inline
  implicit class ResourceReferenceMutableBuilder[Self <: ResourceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
  }
}
