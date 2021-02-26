package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureProps extends ViewProps {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  @JSName("pointerEvents")
  var pointerEvents_GestureProps: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.native
}
object GestureProps {
  
  @scala.inline
  def apply(): GestureProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureProps]
  }
  
  @scala.inline
  implicit class GesturePropsMutableBuilder[Self <: GestureProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
  }
}
