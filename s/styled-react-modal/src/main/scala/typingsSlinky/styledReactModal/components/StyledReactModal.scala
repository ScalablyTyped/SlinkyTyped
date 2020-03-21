package typingsSlinky.styledReactModal.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.std.Event_
import typingsSlinky.styledReactModal.mod.ModalProps
import typingsSlinky.styledReactModal.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledReactModal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("styled-react-modal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    isOpen: Boolean,
    afterClose: () => Unit = null,
    afterOpen: () => Unit = null,
    allowScroll: js.UndefOr[Boolean] = js.undefined,
    backgroundProps: js.Object = null,
    beforeClose: js.Promise[Unit] | js.Function0[Unit] = null,
    beforeOpen: js.Promise[Unit] | js.Function0[Unit] = null,
    onBackgroundClick: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onEscapeKeydown: /* event */ Event_ => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(js.Any.fromFunction0(afterOpen))
    if (!js.isUndefined(allowScroll)) __obj.updateDynamic("allowScroll")(allowScroll.asInstanceOf[js.Any])
    if (backgroundProps != null) __obj.updateDynamic("backgroundProps")(backgroundProps.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen.asInstanceOf[js.Any])
    if (onBackgroundClick != null) __obj.updateDynamic("onBackgroundClick")(js.Any.fromFunction1(onBackgroundClick))
    if (onEscapeKeydown != null) __obj.updateDynamic("onEscapeKeydown")(js.Any.fromFunction1(onEscapeKeydown))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProps
}

