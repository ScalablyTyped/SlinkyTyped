package typingsSlinky.uifabricReactHooks

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/react-hooks/lib/useControllableValue", JSImport.Namespace)
@js.native
object useControllableValueMod extends js.Object {
  
  def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](
    controlledValue: TValue,
    defaultUncontrolledValue: TValue,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](
    controlledValue: TValue,
    defaultUncontrolledValue: js.UndefOr[scala.Nothing],
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](
    controlledValue: js.UndefOr[scala.Nothing],
    defaultUncontrolledValue: TValue,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](
    controlledValue: js.UndefOr[scala.Nothing],
    defaultUncontrolledValue: js.UndefOr[scala.Nothing],
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  @JSName("useControllableValue")
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  @JSName("useControllableValue")
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  @JSName("useControllableValue")
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  @JSName("useControllableValue")
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  
  type ChangeCallback[TElement /* <: HTMLElement */, TValue, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */] = js.Function2[/* ev */ TEvent, /* newValue */ js.UndefOr[TValue], Unit]
}
