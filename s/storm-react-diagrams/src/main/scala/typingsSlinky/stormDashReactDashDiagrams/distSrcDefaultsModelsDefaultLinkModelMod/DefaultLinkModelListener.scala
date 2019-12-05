package typingsSlinky.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultLinkModelMod

import typingsSlinky.stormDashReactDashDiagrams.Anon_0
import typingsSlinky.stormDashReactDashDiagrams.Anon_Color
import typingsSlinky.stormDashReactDashDiagrams.Anon_IsSelected
import typingsSlinky.stormDashReactDashDiagrams.Anon_Locked
import typingsSlinky.stormDashReactDashDiagrams.Anon_Port
import typingsSlinky.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typingsSlinky.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEvent
import typingsSlinky.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLinkModelListener extends LinkModelListener {
  var colorChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[DefaultLinkModel] with Anon_Color, Unit]] = js.undefined
  var widthChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[DefaultLinkModel] with Anon_0, Unit]] = js.undefined
}

object DefaultLinkModelListener {
  @scala.inline
  def apply(
    colorChanged: /* event */ BaseEvent[DefaultLinkModel] with Anon_Color => Unit = null,
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], DefaultLinkModelListener]] => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with Anon_Locked => Unit = null,
    selectionChanged: /* event */ (BaseEvent[BaseModel[BaseEntity[BaseListener[_]], DefaultLinkModelListener]]) with Anon_IsSelected => Unit = null,
    sourcePortChanged: /* event */ BaseEvent[LinkModel[DefaultLinkModelListener]] with Anon_Port => Unit = null,
    targetPortChanged: /* event */ BaseEvent[LinkModel[DefaultLinkModelListener]] with Anon_Port => Unit = null,
    widthChanged: /* event */ BaseEvent[DefaultLinkModel] with Anon_0 => Unit = null
  ): DefaultLinkModelListener = {
    val __obj = js.Dynamic.literal()
    if (colorChanged != null) __obj.updateDynamic("colorChanged")(js.Any.fromFunction1(colorChanged))
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1(entityRemoved))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1(selectionChanged))
    if (sourcePortChanged != null) __obj.updateDynamic("sourcePortChanged")(js.Any.fromFunction1(sourcePortChanged))
    if (targetPortChanged != null) __obj.updateDynamic("targetPortChanged")(js.Any.fromFunction1(targetPortChanged))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1(widthChanged))
    __obj.asInstanceOf[DefaultLinkModelListener]
  }
}

