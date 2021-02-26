package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionStatusEventMap extends StObject {
  
  var change: org.scalajs.dom.raw.Event = js.native
}
object PermissionStatusEventMap {
  
  @scala.inline
  def apply(change: org.scalajs.dom.raw.Event): PermissionStatusEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionStatusEventMap]
  }
  
  @scala.inline
  implicit class PermissionStatusEventMapMutableBuilder[Self <: PermissionStatusEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
