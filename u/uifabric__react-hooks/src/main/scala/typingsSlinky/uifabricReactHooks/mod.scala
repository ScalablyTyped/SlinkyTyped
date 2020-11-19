package typingsSlinky.uifabricReactHooks

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.uifabricReactHooks.useBooleanMod.IUseBooleanCallbacks
import typingsSlinky.uifabricReactHooks.useControllableValueMod.ChangeCallback
import typingsSlinky.uifabricReactHooks.useRefEffectMod.RefCallback
import typingsSlinky.uifabricReactHooks.useSetIntervalMod.UseSetIntervalReturnType
import typingsSlinky.uifabricReactHooks.useSetTimeoutMod.UseSetTimeoutReturnType
import typingsSlinky.uifabricUtilities.mod.Async
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/react-hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def useAsync(): Async = js.native
  
  def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = js.native
  
  def useConst[T](initialValue: T): T = js.native
  def useConst[T](initialValue: js.Function0[T]): T = js.native
  
  def useConstCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T): T = js.native
  
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
  
  def useForceUpdate(): js.Function0[Unit] = js.native
  
  def useId(): String = js.native
  def useId(prefix: js.UndefOr[scala.Nothing], providedId: String): String = js.native
  def useId(prefix: String): String = js.native
  def useId(prefix: String, providedId: String): String = js.native
  
  def useMergedRefs[T](refs: Ref[T]*): js.Function1[/* instance */ T, Unit] = js.native
  
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: TElement, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: TElement,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[scala.Nothing],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[scala.Nothing],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Null, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Null,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: ReactRef[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: ReactRef[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Window, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Window,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  def usePrevious[T](value: T): js.UndefOr[T] = js.native
  
  def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit]): RefCallback[T] = js.native
  def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit], initial: T): RefCallback[T] = js.native
  
  def useSetInterval(): UseSetIntervalReturnType = js.native
  
  def useSetTimeout(): UseSetTimeoutReturnType = js.native
}
