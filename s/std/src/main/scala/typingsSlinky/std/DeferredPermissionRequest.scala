package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferredPermissionRequest extends StObject {
  
  def allow(): Unit = js.native
  
  def deny(): Unit = js.native
  
  val id: Double = js.native
  
  val `type`: MSWebViewPermissionType = js.native
  
  val uri: java.lang.String = js.native
}
object DeferredPermissionRequest {
  
  @scala.inline
  def apply(
    allow: () => Unit,
    deny: () => Unit,
    id: Double,
    `type`: MSWebViewPermissionType,
    uri: java.lang.String
  ): DeferredPermissionRequest = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), deny = js.Any.fromFunction0(deny), id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferredPermissionRequest]
  }
  
  @scala.inline
  implicit class DeferredPermissionRequestMutableBuilder[Self <: DeferredPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: () => Unit): Self = StObject.set(x, "allow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeny(value: () => Unit): Self = StObject.set(x, "deny", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MSWebViewPermissionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: java.lang.String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
