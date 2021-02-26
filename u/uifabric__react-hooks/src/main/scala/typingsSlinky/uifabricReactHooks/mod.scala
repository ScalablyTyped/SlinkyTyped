package typingsSlinky.uifabricReactHooks

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Window
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.SetStateAction
import typingsSlinky.uifabricReactHooks.useBooleanMod.IUseBooleanCallbacks
import typingsSlinky.uifabricReactHooks.useControllableValueMod.ChangeCallback
import typingsSlinky.uifabricReactHooks.useMergedRefsMod.RefObjectFunction
import typingsSlinky.uifabricReactHooks.useRefEffectMod.RefCallback
import typingsSlinky.uifabricReactHooks.useSetIntervalMod.UseSetIntervalReturnType
import typingsSlinky.uifabricReactHooks.useSetTimeoutMod.UseSetTimeoutReturnType
import typingsSlinky.uifabricReactHooks.useTargetMod.Target
import typingsSlinky.uifabricReactHooks.useWarningsMod.IWarningOptions
import typingsSlinky.uifabricUtilities.mod.Async
import typingsSlinky.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@uifabric/react-hooks", "useAsync")
  @js.native
  def useAsync(): Async = js.native
  
  @JSImport("@uifabric/react-hooks", "useBoolean")
  @js.native
  def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = js.native
  
  @JSImport("@uifabric/react-hooks", "useConst")
  @js.native
  def useConst[T](initialValue: T): T = js.native
  @JSImport("@uifabric/react-hooks", "useConst")
  @js.native
  def useConst[T](initialValue: js.Function0[T]): T = js.native
  
  @JSImport("@uifabric/react-hooks", "useConstCallback")
  @js.native
  def useConstCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T): T = js.native
  
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
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
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
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
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
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
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
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
  
  @JSImport("@uifabric/react-hooks", "useForceUpdate")
  @js.native
  def useForceUpdate(): js.Function0[Unit] = js.native
  
  @JSImport("@uifabric/react-hooks", "useId")
  @js.native
  def useId(): String = js.native
  @JSImport("@uifabric/react-hooks", "useId")
  @js.native
  def useId(prefix: js.UndefOr[scala.Nothing], providedId: String): String = js.native
  @JSImport("@uifabric/react-hooks", "useId")
  @js.native
  def useId(prefix: String): String = js.native
  @JSImport("@uifabric/react-hooks", "useId")
  @js.native
  def useId(prefix: String, providedId: String): String = js.native
  
  @JSImport("@uifabric/react-hooks", "useMergedRefs")
  @js.native
  def useMergedRefs[T](refs: js.UndefOr[Ref[T]]*): RefObjectFunction[T] = js.native
  
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: TElement, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: TElement,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[scala.Nothing],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[scala.Nothing],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Document, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Window, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Window,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Null, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Null,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: ReactRef[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = js.native
  @JSImport("@uifabric/react-hooks", "useOnEvent")
  @js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: ReactRef[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSImport("@uifabric/react-hooks", "usePrevious")
  @js.native
  def usePrevious[T](value: T): js.UndefOr[T] = js.native
  
  @JSImport("@uifabric/react-hooks", "useRefEffect")
  @js.native
  def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit]): RefCallback[T] = js.native
  @JSImport("@uifabric/react-hooks", "useRefEffect")
  @js.native
  def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit], initial: T): RefCallback[T] = js.native
  
  @JSImport("@uifabric/react-hooks", "useSetInterval")
  @js.native
  def useSetInterval(): UseSetIntervalReturnType = js.native
  
  @JSImport("@uifabric/react-hooks", "useSetTimeout")
  @js.native
  def useSetTimeout(): UseSetTimeoutReturnType = js.native
  
  @JSImport("@uifabric/react-hooks", "useTarget")
  @js.native
  def useTarget[TElement /* <: HTMLElement */](): js.Tuple2[ReactRef[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  @JSImport("@uifabric/react-hooks", "useTarget")
  @js.native
  def useTarget[TElement /* <: HTMLElement */](target: js.UndefOr[Target], hostElement: ReactRef[Null | TElement]): js.Tuple2[ReactRef[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  @JSImport("@uifabric/react-hooks", "useTarget")
  @js.native
  def useTarget[TElement /* <: HTMLElement */](target: Target): js.Tuple2[ReactRef[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  
  @JSImport("@uifabric/react-hooks", "useWarnings")
  @js.native
  def useWarnings[P](options: IWarningOptions[P]): Unit = js.native
  
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
  @JSImport("@uifabric/react-hooks", "useControllableValue")
  @js.native
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[Event, TElement]] */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with TElement, Event]], 
      Unit
    ]
  ] = js.native
}
