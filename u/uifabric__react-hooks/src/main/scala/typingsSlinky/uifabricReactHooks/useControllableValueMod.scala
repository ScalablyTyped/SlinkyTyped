package typingsSlinky.uifabricReactHooks

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/react-hooks/lib/useControllableValue", JSImport.Namespace)
@js.native
object useControllableValueMod extends js.Object {
  def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](controlledValue: TValue, defaultUncontrolledValue: TValue, onChange: TCallback): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* newValue */ js.UndefOr[TValue], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](controlledValue: TValue, defaultUncontrolledValue: js.UndefOr[scala.Nothing], onChange: TCallback): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* newValue */ js.UndefOr[TValue], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue, onChange: TCallback): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* newValue */ js.UndefOr[TValue], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](
    controlledValue: js.UndefOr[scala.Nothing],
    defaultUncontrolledValue: js.UndefOr[scala.Nothing],
    onChange: TCallback
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* newValue */ js.UndefOr[TValue], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  type ChangeCallback[TElement /* <: HTMLElement */, TValue] = js.Function2[
    /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
    /* newValue */ js.UndefOr[TValue], 
    Unit
  ]
}

