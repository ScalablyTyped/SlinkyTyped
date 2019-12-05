package typingsSlinky.styledDashReactDashModal.styledDashReactDashModalMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var allowScroll: js.UndefOr[Boolean] = js.undefined
  var backgroundProps: js.UndefOr[js.Object] = js.undefined
  var beforeClose: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.undefined
  var beforeOpen: js.UndefOr[js.Promise[Unit] | js.Function0[Unit]] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var isOpen: Boolean
  var onBackgroundClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.undefined
  var onEscapeKeydown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    afterClose: () => Unit = null,
    afterOpen: () => Unit = null,
    allowScroll: js.UndefOr[Boolean] = js.undefined,
    backgroundProps: js.Object = null,
    beforeClose: js.Promise[Unit] | js.Function0[Unit] = null,
    beforeOpen: js.Promise[Unit] | js.Function0[Unit] = null,
    children: TagMod[Any] = null,
    onBackgroundClick: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onEscapeKeydown: /* event */ Event => Unit = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(js.Any.fromFunction0(afterOpen))
    if (!js.isUndefined(allowScroll)) __obj.updateDynamic("allowScroll")(allowScroll.asInstanceOf[js.Any])
    if (backgroundProps != null) __obj.updateDynamic("backgroundProps")(backgroundProps.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onBackgroundClick != null) __obj.updateDynamic("onBackgroundClick")(js.Any.fromFunction1(onBackgroundClick))
    if (onEscapeKeydown != null) __obj.updateDynamic("onEscapeKeydown")(js.Any.fromFunction1(onEscapeKeydown))
    __obj.asInstanceOf[ModalProps]
  }
}

