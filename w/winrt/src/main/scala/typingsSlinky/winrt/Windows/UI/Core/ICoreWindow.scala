package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import typingsSlinky.winrt.Windows.System.VirtualKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreWindow extends StObject {
  
  def activate(): Unit = js.native
  
  var automationHostProvider: js.Any = js.native
  
  var bounds: Rect = js.native
  
  def close(): Unit = js.native
  
  var customProperties: IPropertySet = js.native
  
  var dispatcher: CoreDispatcher = js.native
  
  var flowDirection: CoreWindowFlowDirection = js.native
  
  def getAsyncKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
  
  def getKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
  
  var isInputEnabled: Boolean = js.native
  
  var onactivated: js.Any = js.native
  
  var onautomationproviderrequested: js.Any = js.native
  
  var oncharacterreceived: js.Any = js.native
  
  var onclosed: js.Any = js.native
  
  var oninputenabled: js.Any = js.native
  
  var onkeydown: js.Any = js.native
  
  var onkeyup: js.Any = js.native
  
  var onpointercapturelost: js.Any = js.native
  
  var onpointerentered: js.Any = js.native
  
  var onpointerexited: js.Any = js.native
  
  var onpointermoved: js.Any = js.native
  
  var onpointerpressed: js.Any = js.native
  
  var onpointerreleased: js.Any = js.native
  
  var onpointerwheelchanged: js.Any = js.native
  
  var onsizechanged: js.Any = js.native
  
  var ontouchhittesting: js.Any = js.native
  
  var onvisibilitychanged: js.Any = js.native
  
  var pointerCursor: CoreCursor = js.native
  
  var pointerPosition: Point = js.native
  
  def releasePointerCapture(): Unit = js.native
  
  def setPointerCapture(): Unit = js.native
  
  var visible: Boolean = js.native
}
object ICoreWindow {
  
  @scala.inline
  def apply(
    activate: () => Unit,
    automationHostProvider: js.Any,
    bounds: Rect,
    close: () => Unit,
    customProperties: IPropertySet,
    dispatcher: CoreDispatcher,
    flowDirection: CoreWindowFlowDirection,
    getAsyncKeyState: VirtualKey => CoreVirtualKeyStates,
    getKeyState: VirtualKey => CoreVirtualKeyStates,
    isInputEnabled: Boolean,
    onactivated: js.Any,
    onautomationproviderrequested: js.Any,
    oncharacterreceived: js.Any,
    onclosed: js.Any,
    oninputenabled: js.Any,
    onkeydown: js.Any,
    onkeyup: js.Any,
    onpointercapturelost: js.Any,
    onpointerentered: js.Any,
    onpointerexited: js.Any,
    onpointermoved: js.Any,
    onpointerpressed: js.Any,
    onpointerreleased: js.Any,
    onpointerwheelchanged: js.Any,
    onsizechanged: js.Any,
    ontouchhittesting: js.Any,
    onvisibilitychanged: js.Any,
    pointerCursor: CoreCursor,
    pointerPosition: Point,
    releasePointerCapture: () => Unit,
    setPointerCapture: () => Unit,
    visible: Boolean
  ): ICoreWindow = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), automationHostProvider = automationHostProvider.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), customProperties = customProperties.asInstanceOf[js.Any], dispatcher = dispatcher.asInstanceOf[js.Any], flowDirection = flowDirection.asInstanceOf[js.Any], getAsyncKeyState = js.Any.fromFunction1(getAsyncKeyState), getKeyState = js.Any.fromFunction1(getKeyState), isInputEnabled = isInputEnabled.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any], onautomationproviderrequested = onautomationproviderrequested.asInstanceOf[js.Any], oncharacterreceived = oncharacterreceived.asInstanceOf[js.Any], onclosed = onclosed.asInstanceOf[js.Any], oninputenabled = oninputenabled.asInstanceOf[js.Any], onkeydown = onkeydown.asInstanceOf[js.Any], onkeyup = onkeyup.asInstanceOf[js.Any], onpointercapturelost = onpointercapturelost.asInstanceOf[js.Any], onpointerentered = onpointerentered.asInstanceOf[js.Any], onpointerexited = onpointerexited.asInstanceOf[js.Any], onpointermoved = onpointermoved.asInstanceOf[js.Any], onpointerpressed = onpointerpressed.asInstanceOf[js.Any], onpointerreleased = onpointerreleased.asInstanceOf[js.Any], onpointerwheelchanged = onpointerwheelchanged.asInstanceOf[js.Any], onsizechanged = onsizechanged.asInstanceOf[js.Any], ontouchhittesting = ontouchhittesting.asInstanceOf[js.Any], onvisibilitychanged = onvisibilitychanged.asInstanceOf[js.Any], pointerCursor = pointerCursor.asInstanceOf[js.Any], pointerPosition = pointerPosition.asInstanceOf[js.Any], releasePointerCapture = js.Any.fromFunction0(releasePointerCapture), setPointerCapture = js.Any.fromFunction0(setPointerCapture), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreWindow]
  }
  
  @scala.inline
  implicit class ICoreWindowMutableBuilder[Self <: ICoreWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutomationHostProvider(value: js.Any): Self = StObject.set(x, "automationHostProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustomProperties(value: IPropertySet): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatcher(value: CoreDispatcher): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowDirection(value: CoreWindowFlowDirection): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAsyncKeyState(value: VirtualKey => CoreVirtualKeyStates): Self = StObject.set(x, "getAsyncKeyState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeyState(value: VirtualKey => CoreVirtualKeyStates): Self = StObject.set(x, "getKeyState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsInputEnabled(value: Boolean): Self = StObject.set(x, "isInputEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnactivated(value: js.Any): Self = StObject.set(x, "onactivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnautomationproviderrequested(value: js.Any): Self = StObject.set(x, "onautomationproviderrequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncharacterreceived(value: js.Any): Self = StObject.set(x, "oncharacterreceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclosed(value: js.Any): Self = StObject.set(x, "onclosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOninputenabled(value: js.Any): Self = StObject.set(x, "oninputenabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeydown(value: js.Any): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeyup(value: js.Any): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointercapturelost(value: js.Any): Self = StObject.set(x, "onpointercapturelost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerentered(value: js.Any): Self = StObject.set(x, "onpointerentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerexited(value: js.Any): Self = StObject.set(x, "onpointerexited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointermoved(value: js.Any): Self = StObject.set(x, "onpointermoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerpressed(value: js.Any): Self = StObject.set(x, "onpointerpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerreleased(value: js.Any): Self = StObject.set(x, "onpointerreleased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerwheelchanged(value: js.Any): Self = StObject.set(x, "onpointerwheelchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsizechanged(value: js.Any): Self = StObject.set(x, "onsizechanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchhittesting(value: js.Any): Self = StObject.set(x, "ontouchhittesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnvisibilitychanged(value: js.Any): Self = StObject.set(x, "onvisibilitychanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerCursor(value: CoreCursor): Self = StObject.set(x, "pointerCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerPosition(value: Point): Self = StObject.set(x, "pointerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasePointerCapture(value: () => Unit): Self = StObject.set(x, "releasePointerCapture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPointerCapture(value: () => Unit): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
