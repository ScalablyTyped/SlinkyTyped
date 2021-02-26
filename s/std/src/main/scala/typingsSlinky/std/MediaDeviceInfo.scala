package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The MediaDevicesInfo interface contains information that describes a single media input or output device. */
@js.native
trait MediaDeviceInfo extends StObject {
  
  val deviceId: java.lang.String = js.native
  
  val groupId: java.lang.String = js.native
  
  val kind: org.scalajs.dom.experimental.mediastream.MediaDeviceKind = js.native
  
  val label: java.lang.String = js.native
  
  def toJSON(): js.Any = js.native
}
object MediaDeviceInfo {
  
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    groupId: java.lang.String,
    kind: org.scalajs.dom.experimental.mediastream.MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => js.Any
  ): org.scalajs.dom.experimental.mediastream.MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]
  }
  
  @scala.inline
  implicit class MediaDeviceInfoMutableBuilder[Self <: org.scalajs.dom.experimental.mediastream.MediaDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: java.lang.String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: org.scalajs.dom.experimental.mediastream.MediaDeviceKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
