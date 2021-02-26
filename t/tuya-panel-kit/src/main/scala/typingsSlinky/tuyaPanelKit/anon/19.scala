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
trait `19`[EventName /* <: Extract[
/* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
String] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap[EventName]['data'] */ js.Any
  ] = js.native
}
object `19` {
  
  @scala.inline
  def apply[EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
    String
  ] */](): `19`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`[EventName]]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`[_], EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
    String
  ] */] (val x: Self with `19`[EventName]) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
