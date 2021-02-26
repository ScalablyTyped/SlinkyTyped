package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.std.Extract
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.gestureCancel
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.gestureEnd
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.gestureStart
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.transitionEnd
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.transitionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `18`[EventName /* <: Extract[
/* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
String] */] extends StObject {
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: EventName = js.native
}
object `18` {
  
  @scala.inline
  def apply[EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
    String
  ] */](`type`: EventName): `18`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`[EventName]]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`[_], EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
    String
  ] */] (val x: Self with `18`[EventName]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
