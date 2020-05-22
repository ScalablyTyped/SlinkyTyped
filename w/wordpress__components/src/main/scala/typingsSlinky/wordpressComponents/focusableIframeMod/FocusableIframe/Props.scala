package typingsSlinky.wordpressComponents.focusableIframeMod.FocusableIframe

import org.scalajs.dom.raw.HTMLIFrameElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLIFrameElement]
     with ClassAttributes[HTMLIFrameElement] {
  var iframeRef: js.UndefOr[ReactRef[HTMLIFrameElement]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLIFrameElement] = null,
    ClassAttributes: ClassAttributes[HTMLIFrameElement] = null,
    iframeRef: ReactRef[HTMLIFrameElement] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (iframeRef != null) __obj.updateDynamic("iframeRef")(iframeRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

