package typingsSlinky.winrtUwp.Windows.Media.Protection

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Protected Media Path (PMP) server to enable playback of protected content using digital rights management (DRM). */
@js.native
trait MediaProtectionPMPServer extends StObject {
  
  /** Gets the property set for the MediaProtectionPMPServer . */
  var properties: IPropertySet = js.native
}
object MediaProtectionPMPServer {
  
  @scala.inline
  def apply(properties: IPropertySet): MediaProtectionPMPServer = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProtectionPMPServer]
  }
  
  @scala.inline
  implicit class MediaProtectionPMPServerMutableBuilder[Self <: MediaProtectionPMPServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
