package typingsSlinky.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventWorkflowController extends IEventController {
  var onAfterEventFiring: js.UndefOr[
    js.Function3[/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent], Unit]
  ] = js.undefined
  var onBeforeEventFiring: js.UndefOr[
    js.Function3[/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent], Unit]
  ] = js.undefined
}

object IEventWorkflowController {
  @scala.inline
  def apply(
    onAfterEventFiring: (/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent]) => Unit = null,
    onBeforeEventFiring: (/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent]) => Unit = null,
    onStartListening: (/* events */ IEventManager, /* type */ String) => Unit = null,
    onStopListening: (/* events */ IEventManager, /* type */ String) => Unit = null
  ): IEventWorkflowController = {
    val __obj = js.Dynamic.literal()
    if (onAfterEventFiring != null) __obj.updateDynamic("onAfterEventFiring")(js.Any.fromFunction3(onAfterEventFiring))
    if (onBeforeEventFiring != null) __obj.updateDynamic("onBeforeEventFiring")(js.Any.fromFunction3(onBeforeEventFiring))
    if (onStartListening != null) __obj.updateDynamic("onStartListening")(js.Any.fromFunction2(onStartListening))
    if (onStopListening != null) __obj.updateDynamic("onStopListening")(js.Any.fromFunction2(onStopListening))
    __obj.asInstanceOf[IEventWorkflowController]
  }
}

