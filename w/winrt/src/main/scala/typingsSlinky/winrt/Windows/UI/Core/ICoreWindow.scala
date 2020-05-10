package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import typingsSlinky.winrt.Windows.System.VirtualKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindow extends js.Object {
  var automationHostProvider: js.Any = js.native
  var bounds: Rect = js.native
  var customProperties: IPropertySet = js.native
  var dispatcher: CoreDispatcher = js.native
  var flowDirection: CoreWindowFlowDirection = js.native
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
  var visible: Boolean = js.native
  def activate(): Unit = js.native
  def close(): Unit = js.native
  def getAsyncKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
  def getKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
  def releasePointerCapture(): Unit = js.native
  def setPointerCapture(): Unit = js.native
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
  implicit class ICoreWindowOps[Self <: ICoreWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutomationHostProvider(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationHostProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCustomProperties(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatcher(value: CoreDispatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowDirection(value: CoreWindowFlowDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAsyncKeyState(value: VirtualKey => CoreVirtualKeyStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAsyncKeyState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKeyState(value: VirtualKey => CoreVirtualKeyStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsInputEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInputEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnactivated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onactivated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnautomationproviderrequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onautomationproviderrequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncharacterreceived(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncharacterreceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnclosed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOninputenabled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninputenabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnkeydown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnkeyup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointercapturelost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointercapturelost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerentered(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerexited(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerexited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointermoved(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointermoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerpressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerreleased(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerreleased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpointerwheelchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpointerwheelchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnsizechanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsizechanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOntouchhittesting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchhittesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnvisibilitychanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onvisibilitychanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerCursor(value: CoreCursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleasePointerCapture(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasePointerCapture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPointerCapture(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPointerCapture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

