package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionDescriptor extends StObject {
  
  var name: PermissionName = js.native
}
object PermissionDescriptor {
  
  @scala.inline
  def apply(name: PermissionName): PermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDescriptor]
  }
  
  @scala.inline
  implicit class PermissionDescriptorMutableBuilder[Self <: PermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: PermissionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
