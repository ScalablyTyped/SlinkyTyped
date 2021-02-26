package typingsSlinky.tuyaPanelKit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.std.Extract
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.anon.A
import typingsSlinky.tuyaPanelKit.anon.AB
import typingsSlinky.tuyaPanelKit.anon.B
import typingsSlinky.tuyaPanelKit.anon.C
import typingsSlinky.tuyaPanelKit.anon.CanPreventDefault
import typingsSlinky.tuyaPanelKit.anon.CanPreventDefaultData
import typingsSlinky.tuyaPanelKit.anon.Children
import typingsSlinky.tuyaPanelKit.anon.Component
import typingsSlinky.tuyaPanelKit.anon.Data
import typingsSlinky.tuyaPanelKit.anon.Data9
import typingsSlinky.tuyaPanelKit.anon.DataNoop
import typingsSlinky.tuyaPanelKit.anon.DataOptionsObject
import typingsSlinky.tuyaPanelKit.anon.DataReadonly
import typingsSlinky.tuyaPanelKit.anon.DataStateState
import typingsSlinky.tuyaPanelKit.anon.DefaultPrevented
import typingsSlinky.tuyaPanelKit.anon.GetComponent
import typingsSlinky.tuyaPanelKit.anon.Initial
import typingsSlinky.tuyaPanelKit.anon.InitialParams
import typingsSlinky.tuyaPanelKit.anon.KeyNameRouteName
import typingsSlinky.tuyaPanelKit.anon.KeyParams
import typingsSlinky.tuyaPanelKit.anon.KeyString
import typingsSlinky.tuyaPanelKit.anon.NameRouteName
import typingsSlinky.tuyaPanelKit.anon.Navigation
import typingsSlinky.tuyaPanelKit.anon.PartialStateNavigationSta
import typingsSlinky.tuyaPanelKit.anon.TargetTypeEventName
import typingsSlinky.tuyaPanelKit.anon.TypeEventName
import typingsSlinky.tuyaPanelKit.anon.`10`
import typingsSlinky.tuyaPanelKit.anon.`11`
import typingsSlinky.tuyaPanelKit.anon.`12`
import typingsSlinky.tuyaPanelKit.anon.`2`
import typingsSlinky.tuyaPanelKit.anon.`3`
import typingsSlinky.tuyaPanelKit.anon.`4`
import typingsSlinky.tuyaPanelKit.anon.`5`
import typingsSlinky.tuyaPanelKit.anon.`6`
import typingsSlinky.tuyaPanelKit.anon.`7`
import typingsSlinky.tuyaPanelKit.anon.`8`
import typingsSlinky.tuyaPanelKit.routersTypesMod.InitialState
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationAction
import typingsSlinky.tuyaPanelKit.routersTypesMod.NavigationState
import typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase
import typingsSlinky.tuyaPanelKit.routersTypesMod.PartialState
import typingsSlinky.tuyaPanelKit.routersTypesMod.Route
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.__unsafe_action__
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings._empty
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.addListener
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.beforeRemove
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.blur
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.canGoBack
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.children
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.dangerouslyGetParent
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.dangerouslyGetState
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.dispatch
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.focus
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.goBack
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.initialRouteName
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.isFocused
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.navigate_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.options
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.removeListener
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.reset_
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.screenOptions
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.setOptions
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.setParams
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.state
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/types", "PrivateValueStore")
  @js.native
  class PrivateValueStore[A, B, C] () extends StObject {
    
    /**
      * UGLY HACK! DO NOT USE THE TYPE!!!
      *
      * TypeScript requires a type to be used to be able to infer it.
      * The type should exist as its own without any operations such as union.
      * So we need to figure out a way to store this type in a property.
      * The problem with a normal property is that it shows up in intelliSense.
      * Adding private keyword works, but the annotation is stripped away in declaration.
      * Turns out if we use an empty string, it doesn't show up in intelliSense.
      */
    @JSName("")
    var _empty: js.UndefOr[AB[A, B, C]] = js.native
  }
  
  type CompositeNavigationProp[A /* <: NavigationProp[ParamListBase, String, _, _, js.Object] */, B /* <: NavigationHelpersCommon[ParamListBase, _] */] = (Omit[
    A with B, 
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<any, string, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<any>, {}, {}> */ dispatch | navigate_ | reset_ | goBack | isFocused | canGoBack | dangerouslyGetParent | dangerouslyGetState | _empty | setParams | setOptions | addListener | removeListener
  ]) with (NavigationProp[js.Any, String, NavigationState[ParamListBase], js.Object, js.Object])
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.DefaultRouterOptions<std.Extract<keyof ParamList, string>> & {  children :react.react.ReactNode,   screenOptions :ScreenOptions | (props : {  route :tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.RouteProp<ParamList, keyof ParamList>,   navigation :any}): ScreenOptions | undefined} */
  @js.native
  trait DefaultNavigatorOptions[ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */] extends StObject {
    
    /**
      * Children React Elements to extract the route configuration from.
      * Only `Screen` components are supported as children.
      */
    var children: ReactElement = js.native
    
    /**
      * Name of the route to focus by on initial render.
      * If not specified, usually the first route is used.
      */
    var initialRouteName: js.UndefOr[Extract[/* keyof ParamList */ String, String]] = js.native
    
    /**
      * Default options for all screens under this navigator.
      */
    var screenOptions: js.UndefOr[ScreenOptions | (js.Function1[/* props */ Navigation[ParamList], ScreenOptions])] = js.native
  }
  object DefaultNavigatorOptions {
    
    @scala.inline
    def apply[ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */](): DefaultNavigatorOptions[ScreenOptions, ParamList] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultNavigatorOptions[ScreenOptions, ParamList]]
    }
    
    @scala.inline
    implicit class DefaultNavigatorOptionsMutableBuilder[Self <: DefaultNavigatorOptions[_, _], ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */] (val x: Self with (DefaultNavigatorOptions[ScreenOptions, ParamList])) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialRouteName(value: Extract[/* keyof ParamList */ String, String]): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      @scala.inline
      def setScreenOptions(value: ScreenOptions | (js.Function1[/* props */ Navigation[ParamList], ScreenOptions])): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenOptionsFunction1(value: /* props */ Navigation[ParamList] => ScreenOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
    }
  }
  
  @js.native
  trait Descriptor[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    /**
      * Navigation object for the screen
      */
    var navigation: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap] = js.native
    
    /**
      * Options for the route.
      */
    var options: ScreenOptions = js.native
    
    /**
      * Render the component associated with this route.
      */
    def render(): ReactElement = js.native
  }
  object Descriptor {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
      navigation: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap],
      options: ScreenOptions,
      render: () => ReactElement
    ): Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap] = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap]]
    }
    
    @scala.inline
    implicit class DescriptorMutableBuilder[Self <: Descriptor[_, _, _, _, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] (val x: Self with (Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap])) extends AnyVal {
      
      @scala.inline
      def setNavigation(value: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: ScreenOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: () => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  type EventArg[EventName /* <: String */, CanPreventDefault /* <: js.UndefOr[Boolean] */, Data] = TypeEventName[EventName] with (js.Object | DefaultPrevented) with (DataReadonly[Data] | `2`[Data])
  
  @js.native
  trait EventConsumer[EventMap /* <: EventMapBase */] extends StObject {
    
    /**
      * Subscribe to events from the parent navigator.
      *
      * @param type Type of the event (e.g. `focus`, `blur`)
      * @param callback Callback listener which is executed upon receiving the event.
      */
    def addListener[EventName /* <: Extract[/* keyof EventMap */ String, String] */](`type`: EventName, callback: EventListenerCallback[EventMap, EventName]): js.Function0[Unit] = js.native
    
    def removeListener[EventName /* <: Extract[/* keyof EventMap */ String, String] */](`type`: EventName, callback: EventListenerCallback[EventMap, EventName]): Unit = js.native
  }
  object EventConsumer {
    
    @scala.inline
    def apply[EventMap /* <: EventMapBase */](
      addListener: (js.Any, EventListenerCallback[EventMap, js.Any]) => js.Function0[Unit],
      removeListener: (js.Any, EventListenerCallback[EventMap, js.Any]) => Unit
    ): EventConsumer[EventMap] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[EventConsumer[EventMap]]
    }
    
    @scala.inline
    implicit class EventConsumerMutableBuilder[Self <: EventConsumer[_], EventMap /* <: EventMapBase */] (val x: Self with EventConsumer[EventMap]) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (js.Any, EventListenerCallback[EventMap, js.Any]) => js.Function0[Unit]): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveListener(value: (js.Any, EventListenerCallback[EventMap, js.Any]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait EventEmitter[EventMap /* <: EventMapBase */] extends StObject {
    
    /**
      * Emit an event to child screens.
      *
      * @param options.type Type of the event (e.g. `focus`, `blur`)
      * @param [options.data] Optional information regarding the event.
      * @param [options.target] Key of the target route which should receive the event.
      * If not specified, all routes receive the event.
      */
    def emit[EventName /* <: Extract[/* keyof EventMap */ String, String] */](
      options: (TargetTypeEventName[EventName, EventMap]) with (js.Object | `3`) with ((`5`[EventMap, EventName]) | (`4`[EventMap, EventName]))
    ): EventArg[
        EventName, 
        /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
      ] = js.native
  }
  object EventEmitter {
    
    @scala.inline
    def apply[EventMap /* <: EventMapBase */](
      emit: (TargetTypeEventName[js.Any, EventMap]) with (js.Object | `3`) with ((`5`[EventMap, js.Any]) | (`4`[EventMap, js.Any])) => EventArg[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
        ]
    ): EventEmitter[EventMap] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit))
      __obj.asInstanceOf[EventEmitter[EventMap]]
    }
    
    @scala.inline
    implicit class EventEmitterMutableBuilder[Self <: EventEmitter[_], EventMap /* <: EventMapBase */] (val x: Self with EventEmitter[EventMap]) extends AnyVal {
      
      @scala.inline
      def setEmit(
        value: (TargetTypeEventName[js.Any, EventMap]) with (js.Object | `3`) with ((`5`[EventMap, js.Any]) | (`4`[EventMap, js.Any])) => EventArg[
              js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
            ]
      ): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
    }
  }
  
  type EventListenerCallback[EventMap /* <: EventMapBase */, EventName /* <: /* keyof EventMap */ String */] = js.Function1[
    /* e */ EventArg[
      Extract[EventName, String], 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ], 
    Unit
  ]
  
  type EventMapBase = Record[String, CanPreventDefault]
  
  @js.native
  trait EventMapCore[State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    var beforeRemove: CanPreventDefaultData = js.native
    
    var blur: Data = js.native
    
    var focus: Data = js.native
    
    var state: DataStateState[State] = js.native
  }
  object EventMapCore {
    
    @scala.inline
    def apply[State /* <: NavigationState[ParamListBase] */](beforeRemove: CanPreventDefaultData, blur: Data, focus: Data, state: DataStateState[State]): EventMapCore[State] = {
      val __obj = js.Dynamic.literal(beforeRemove = beforeRemove.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMapCore[State]]
    }
    
    @scala.inline
    implicit class EventMapCoreMutableBuilder[Self <: EventMapCore[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with EventMapCore[State]) extends AnyVal {
      
      @scala.inline
      def setBeforeRemove(value: CanPreventDefaultData): Self = StObject.set(x, "beforeRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlur(value: Data): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocus(value: Data): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: DataStateState[State]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavigationContainerEventMap extends StObject {
    
    /**
      * Event which fires when an action is dispatched.
      * Only intended for debugging purposes, don't use it for app logic.
      * This event will be emitted before state changes have been applied.
      */
    var __unsafe_action__ : DataNoop = js.native
    
    /**
      * Event which fires when current options changes.
      */
    var options: DataOptionsObject = js.native
    
    /**
      * Event which fires when the navigation state changes.
      */
    var state: Data9 = js.native
  }
  object NavigationContainerEventMap {
    
    @scala.inline
    def apply(__unsafe_action__ : DataNoop, options: DataOptionsObject, state: Data9): NavigationContainerEventMap = {
      val __obj = js.Dynamic.literal(__unsafe_action__ = __unsafe_action__.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationContainerEventMap]
    }
    
    @scala.inline
    implicit class NavigationContainerEventMapMutableBuilder[Self <: NavigationContainerEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: DataOptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Data9): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__unsafe_action__(value: DataNoop): Self = StObject.set(x, "__unsafe_action__", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavigationContainerProps extends StObject {
    
    /**
      * Children elements to render.
      */
    var children: ReactElement = js.native
    
    /**
      * Whether this navigation container should be independent of parent containers.
      * If this is not set to `true`, this container cannot be nested inside another container.
      * Setting it to `true` disconnects any children navigators from parent container.
      */
    var independent: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial navigation state for the child navigators.
      */
    var initialState: js.UndefOr[InitialState] = js.native
    
    /**
      * Callback which is called with the latest navigation state when it changes.
      */
    var onStateChange: js.UndefOr[js.Function1[/* state */ js.UndefOr[NavigationState[ParamListBase]], Unit]] = js.native
    
    /**
      * Callback which is called when an action is not handled.
      */
    var onUnhandledAction: js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]] = js.native
  }
  object NavigationContainerProps {
    
    @scala.inline
    def apply(): NavigationContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationContainerProps]
    }
    
    @scala.inline
    implicit class NavigationContainerPropsMutableBuilder[Self <: NavigationContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
      
      @scala.inline
      def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      @scala.inline
      def setOnUnhandledAction(value: /* action */ NavigationAction => Unit): Self = StObject.set(x, "onUnhandledAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnhandledActionUndefined: Self = StObject.set(x, "onUnhandledAction", js.undefined)
    }
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpers<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.ParamListBase, {}> & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventConsumer<tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationContainerEventMap> & {resetRoot (state : tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.PartialState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>> | tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase> | undefined): void, getRootState (): tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>, getCurrentRoute (): tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.Route<string, object | undefined> | undefined, getCurrentOptions (): object | undefined} */
  @js.native
  trait NavigationContainerRef extends StObject {
    
    /**
      * UGLY HACK! DO NOT USE THE TYPE!!!
      *
      * TypeScript requires a type to be used to be able to infer it.
      * The type should exist as its own without any operations such as union.
      * So we need to figure out a way to store this type in a property.
      * The problem with a normal property is that it shows up in intelliSense.
      * Adding private keyword works, but the annotation is stripped away in declaration.
      * Turns out if we use an empty string, it doesn't show up in intelliSense.
      */
    @JSName("")
    var _empty: js.UndefOr[C] = js.native
    
    /**
      * Subscribe to events from the parent navigator.
      *
      * @param type Type of the event (e.g. `focus`, `blur`)
      * @param callback Callback listener which is executed upon receiving the event.
      */
    def addListener[EventName /* <: Extract[
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationContainerEventMap */ state | options | __unsafe_action__, 
        String
      ] */](`type`: EventName, callback: EventListenerCallback[NavigationContainerEventMap, EventName]): js.Function0[Unit] = js.native
    
    /**
      * Check if dispatching back action will be handled by navigation.
      * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
      */
    def canGoBack(): Boolean = js.native
    
    /**
      * Returns the parent navigator, if any. Reason why the function is called
      * dangerouslyGetParent is to warn developers against overusing it to eg. get parent
      * of parent and other hard-to-follow patterns.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def dangerouslyGetParent[T](): T = js.native
    
    /**
      * Returns the navigator's state. Reason why the function is called
      * dangerouslyGetState is to discourage developers to use internal navigation's state.
      * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
      */
    def dangerouslyGetState(): NavigationState[ParamListBase] = js.native
    
    def dispatch(action: js.Function1[/* state */ NavigationState[ParamListBase], NavigationAction]): Unit = js.native
    /**
      * Dispatch an action or an update function to the router.
      * The update function will receive the current state,
      *
      * @param action Action object or update function.
      */
    def dispatch(action: NavigationAction): Unit = js.native
    
    /**
      * Emit an event to child screens.
      *
      * @param options.type Type of the event (e.g. `focus`, `blur`)
      * @param [options.data] Optional information regarding the event.
      * @param [options.target] Key of the target route which should receive the event.
      * If not specified, all routes receive the event.
      */
    def emit[EventName /* <: Extract[/* keyof {} */ String, String] */](options: `10`[EventName] with (js.Object | `3`) with (`12`[EventName] | `11`[EventName])): EventArg[
        EventName, 
        /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['canPreventDefault'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
      ] = js.native
    
    /**
      * Get the currently focused route's options.
      */
    def getCurrentOptions(): js.UndefOr[js.Object] = js.native
    
    /**
      * Get the currently focused navigation route.
      */
    def getCurrentRoute(): js.UndefOr[Route[String, js.UndefOr[js.Object]]] = js.native
    
    /**
      * Get the rehydrated navigation state of the navigation tree.
      */
    def getRootState(): NavigationState[ParamListBase] = js.native
    
    /**
      * Go back to the previous route in history.
      */
    def goBack(): Unit = js.native
    
    /**
      * Check if the screen is focused. The method returns `true` if focused, `false` otherwise.
      * Note that this method doesn't re-render screen when the focus changes. So don't use it in `render`.
      * To get notified of focus changes, use `addListener('focus', cb)` and `addListener('blur', cb)`.
      * To conditionally render content based on focus state, use the `useIsFocused` hook.
      */
    def isFocused(): Boolean = js.native
    
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param name Name of the route to navigate to.
      * @param [params] Params object for the route.
      */
    def navigate[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
    def navigate[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](route: KeyNameRouteName[RouteName]): Unit = js.native
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
      */
    def navigate[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](route: KeyString[RouteName]): Unit = js.native
    
    def removeListener[EventName /* <: Extract[
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationContainerEventMap */ state | options | __unsafe_action__, 
        String
      ] */](`type`: EventName, callback: EventListenerCallback[NavigationContainerEventMap, EventName]): Unit = js.native
    
    /**
      * Reset the navigation state to the provided state.
      *
      * @param state Navigation state object.
      */
    def reset(state: PartialStateNavigationSta): Unit = js.native
    def reset(state: NavigationState[ParamListBase]): Unit = js.native
    
    /**
      * Reset the navigation state of the root navigator to the provided state.
      *
      * @param state Navigation state object.
      */
    def resetRoot(): Unit = js.native
    def resetRoot(state: PartialStateNavigationSta): Unit = js.native
    def resetRoot(state: NavigationState[ParamListBase]): Unit = js.native
    
    /**
      * Update the param object for the route.
      * The new params will be shallow merged with the old one.
      *
      * @param params Params object for the current route.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def setParams[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](
      params: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
        ]
    ): Unit = js.native
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpersCommon<ParamList, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>> & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventEmitter<EventMap> & {setParams <RouteName extends keyof ParamList>(params : std.Partial<ParamList[RouteName]>): void} */
  @js.native
  trait NavigationHelpers[ParamList /* <: ParamListBase */, EventMap /* <: EventMapBase */] extends StObject {
    
    /**
      * UGLY HACK! DO NOT USE THE TYPE!!!
      *
      * TypeScript requires a type to be used to be able to infer it.
      * The type should exist as its own without any operations such as union.
      * So we need to figure out a way to store this type in a property.
      * The problem with a normal property is that it shows up in intelliSense.
      * Adding private keyword works, but the annotation is stripped away in declaration.
      * Turns out if we use an empty string, it doesn't show up in intelliSense.
      */
    @JSName("")
    var _empty: js.UndefOr[A[ParamList]] = js.native
    
    /**
      * Check if dispatching back action will be handled by navigation.
      * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
      */
    def canGoBack(): Boolean = js.native
    
    /**
      * Returns the parent navigator, if any. Reason why the function is called
      * dangerouslyGetParent is to warn developers against overusing it to eg. get parent
      * of parent and other hard-to-follow patterns.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def dangerouslyGetParent[T](): T = js.native
    
    /**
      * Returns the navigator's state. Reason why the function is called
      * dangerouslyGetState is to discourage developers to use internal navigation's state.
      * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
      */
    def dangerouslyGetState(): NavigationState[ParamListBase] = js.native
    
    def dispatch(action: js.Function1[/* state */ NavigationState[ParamListBase], NavigationAction]): Unit = js.native
    /**
      * Dispatch an action or an update function to the router.
      * The update function will receive the current state,
      *
      * @param action Action object or update function.
      */
    def dispatch(action: NavigationAction): Unit = js.native
    
    /**
      * Emit an event to child screens.
      *
      * @param options.type Type of the event (e.g. `focus`, `blur`)
      * @param [options.data] Optional information regarding the event.
      * @param [options.target] Key of the target route which should receive the event.
      * If not specified, all routes receive the event.
      */
    def emit[EventName /* <: Extract[/* keyof EventMap */ String, String] */](
      options: (`6`[EventName, EventMap]) with (js.Object | `3`) with ((`8`[EventMap, EventName]) | (`7`[EventMap, EventName]))
    ): EventArg[
        EventName, 
        /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
      ] = js.native
    
    /**
      * Go back to the previous route in history.
      */
    def goBack(): Unit = js.native
    
    /**
      * Check if the screen is focused. The method returns `true` if focused, `false` otherwise.
      * Note that this method doesn't re-render screen when the focus changes. So don't use it in `render`.
      * To get notified of focus changes, use `addListener('focus', cb)` and `addListener('blur', cb)`.
      * To conditionally render content based on focus state, use the `useIsFocused` hook.
      */
    def isFocused(): Boolean = js.native
    
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param name Name of the route to navigate to.
      * @param [params] Params object for the route.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyParams[ParamList, RouteName]): Unit = js.native
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: NameRouteName[RouteName, ParamList]): Unit = js.native
    
    /**
      * Reset the navigation state to the provided state.
      *
      * @param state Navigation state object.
      */
    def reset(state: PartialStateNavigationSta): Unit = js.native
    def reset(state: NavigationState[ParamListBase]): Unit = js.native
    
    /**
      * Update the param object for the route.
      * The new params will be shallow merged with the old one.
      *
      * @param params Params object for the current route.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def setParams[RouteName /* <: /* keyof ParamList */ String */](
      params: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]
    ): Unit = js.native
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Inlined {dispatch (action : tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationAction | (state : State): tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationAction): void, navigate <RouteName extends keyof ParamList>(args : undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]]): void, navigate <RouteName extends keyof ParamList>(route : {  key :string,   params :ParamList[RouteName] | undefined} | {  name :RouteName,   key :string | undefined,   params :ParamList[RouteName]}): void, reset (state : tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.PartialState<State> | State): void, goBack (): void, isFocused (): boolean, canGoBack (): boolean, dangerouslyGetParent <T = tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.ParamListBase, string, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.ParamListBase>, {}, {}> | undefined>(): T, dangerouslyGetState (): State} & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.PrivateValueStore<ParamList, keyof ParamList, {}> */
  @js.native
  trait NavigationHelpersCommon[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    /**
      * UGLY HACK! DO NOT USE THE TYPE!!!
      *
      * TypeScript requires a type to be used to be able to infer it.
      * The type should exist as its own without any operations such as union.
      * So we need to figure out a way to store this type in a property.
      * The problem with a normal property is that it shows up in intelliSense.
      * Adding private keyword works, but the annotation is stripped away in declaration.
      * Turns out if we use an empty string, it doesn't show up in intelliSense.
      */
    @JSName("")
    var _empty: js.UndefOr[A[ParamList]] = js.native
    
    /**
      * Check if dispatching back action will be handled by navigation.
      * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
      */
    def canGoBack(): Boolean = js.native
    
    /**
      * Returns the parent navigator, if any. Reason why the function is called
      * dangerouslyGetParent is to warn developers against overusing it to eg. get parent
      * of parent and other hard-to-follow patterns.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def dangerouslyGetParent[T](): T = js.native
    
    /**
      * Returns the navigator's state. Reason why the function is called
      * dangerouslyGetState is to discourage developers to use internal navigation's state.
      * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
      */
    def dangerouslyGetState(): State = js.native
    
    def dispatch(action: js.Function1[/* state */ State, NavigationAction]): Unit = js.native
    /**
      * Dispatch an action or an update function to the router.
      * The update function will receive the current state,
      *
      * @param action Action object or update function.
      */
    def dispatch(action: NavigationAction): Unit = js.native
    
    /**
      * Go back to the previous route in history.
      */
    def goBack(): Unit = js.native
    
    /**
      * Check if the screen is focused. The method returns `true` if focused, `false` otherwise.
      * Note that this method doesn't re-render screen when the focus changes. So don't use it in `render`.
      * To get notified of focus changes, use `addListener('focus', cb)` and `addListener('blur', cb)`.
      * To conditionally render content based on focus state, use the `useIsFocused` hook.
      */
    def isFocused(): Boolean = js.native
    
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param name Name of the route to navigate to.
      * @param [params] Params object for the route.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyParams[ParamList, RouteName]): Unit = js.native
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: NameRouteName[RouteName, ParamList]): Unit = js.native
    
    def reset(state: State): Unit = js.native
    /**
      * Reset the navigation state to the provided state.
      *
      * @param state Navigation state object.
      */
    def reset(state: PartialState[State]): Unit = js.native
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpersCommon<ParamList, State> & {setParams (params : std.Partial<ParamList[RouteName]>): void, setOptions (options : std.Partial<ScreenOptions>): void} & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventConsumer<EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State>> & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.PrivateValueStore<ParamList, RouteName, EventMap> */
  @js.native
  trait NavigationProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    /**
      * UGLY HACK! DO NOT USE THE TYPE!!!
      *
      * TypeScript requires a type to be used to be able to infer it.
      * The type should exist as its own without any operations such as union.
      * So we need to figure out a way to store this type in a property.
      * The problem with a normal property is that it shows up in intelliSense.
      * Adding private keyword works, but the annotation is stripped away in declaration.
      * Turns out if we use an empty string, it doesn't show up in intelliSense.
      */
    @JSName("")
    var _empty: js.UndefOr[A[ParamList]] with (js.UndefOr[B[ParamList, RouteName, EventMap]]) = js.native
    
    /**
      * Subscribe to events from the parent navigator.
      *
      * @param type Type of the event (e.g. `focus`, `blur`)
      * @param callback Callback listener which is executed upon receiving the event.
      */
    def addListener[EventName /* <: Extract[
        /* keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> */ focus | blur | state | beforeRemove, 
        String
      ] */](`type`: EventName, callback: EventListenerCallback[EventMap with EventMapCore[State], EventName]): js.Function0[Unit] = js.native
    
    /**
      * Check if dispatching back action will be handled by navigation.
      * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
      */
    def canGoBack(): Boolean = js.native
    
    /**
      * Returns the parent navigator, if any. Reason why the function is called
      * dangerouslyGetParent is to warn developers against overusing it to eg. get parent
      * of parent and other hard-to-follow patterns.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def dangerouslyGetParent[T](): T = js.native
    
    /**
      * Returns the navigator's state. Reason why the function is called
      * dangerouslyGetState is to discourage developers to use internal navigation's state.
      * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
      */
    def dangerouslyGetState(): State = js.native
    
    def dispatch(action: js.Function1[/* state */ State, NavigationAction]): Unit = js.native
    /**
      * Dispatch an action or an update function to the router.
      * The update function will receive the current state,
      *
      * @param action Action object or update function.
      */
    def dispatch(action: NavigationAction): Unit = js.native
    
    /**
      * Go back to the previous route in history.
      */
    def goBack(): Unit = js.native
    
    /**
      * Check if the screen is focused. The method returns `true` if focused, `false` otherwise.
      * Note that this method doesn't re-render screen when the focus changes. So don't use it in `render`.
      * To get notified of focus changes, use `addListener('focus', cb)` and `addListener('blur', cb)`.
      * To conditionally render content based on focus state, use the `useIsFocused` hook.
      */
    def isFocused(): Boolean = js.native
    
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param name Name of the route to navigate to.
      * @param [params] Params object for the route.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
          RouteName, 
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]) | js.Array[RouteName]
    ): Unit = js.native
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyParams[ParamList, RouteName]): Unit = js.native
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: NameRouteName[RouteName, ParamList]): Unit = js.native
    
    def removeListener[EventName /* <: Extract[
        /* keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> */ focus | blur | state | beforeRemove, 
        String
      ] */](`type`: EventName, callback: EventListenerCallback[EventMap with EventMapCore[State], EventName]): Unit = js.native
    
    def reset(state: State): Unit = js.native
    /**
      * Reset the navigation state to the provided state.
      *
      * @param state Navigation state object.
      */
    def reset(state: PartialState[State]): Unit = js.native
    
    /**
      * Update the options for the route.
      * The options object will be shallow merged with default options object.
      *
      * @param options Options object for the route.
      */
    def setOptions(options: Partial[ScreenOptions]): Unit = js.native
    
    /**
      * Update the param object for the route.
      * The new params will be shallow merged with the old one.
      *
      * @param params Params object for the current route.
      */
    def setParams(
      params: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]
    ): Unit = js.native
  }
  
  type NavigatorScreenParams[ParamList, State /* <: NavigationState[ParamListBase] */] = Initial[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ RouteName in keyof ParamList ]: undefined extends ParamList[RouteName]? {  screen :RouteName,   params :ParamList[RouteName] | undefined,   initial :boolean | undefined,   state :never | undefined} : {  screen :RouteName,   params :ParamList[RouteName],   initial :boolean | undefined,   state :never | undefined}}[keyof ParamList] */ js.Any)
  
  @js.native
  trait PathConfig extends StObject {
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var initialRouteName: js.UndefOr[String] = js.native
    
    var parse: js.UndefOr[Record[String, js.Function1[/* value */ String, _]]] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var screens: js.UndefOr[PathConfigMap] = js.native
    
    var stringify: js.UndefOr[Record[String, js.Function1[/* value */ _, String]]] = js.native
  }
  object PathConfig {
    
    @scala.inline
    def apply(): PathConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathConfig]
    }
    
    @scala.inline
    implicit class PathConfigMutableBuilder[Self <: PathConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      @scala.inline
      def setParse(value: Record[String, js.Function1[/* value */ String, _]]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreensUndefined: Self = StObject.set(x, "screens", js.undefined)
      
      @scala.inline
      def setStringify(value: Record[String, js.Function1[/* value */ _, String]]): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    }
  }
  
  @js.native
  trait PathConfigMap extends /* routeName */ StringDictionary[String | PathConfig]
  object PathConfigMap {
    
    @scala.inline
    def apply(): PathConfigMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathConfigMap]
    }
  }
  
  type RouteConfig[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] = (InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]) with (Children | Component | (GetComponent[ParamList, RouteName]))
  
  type RouteProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = Route[
    Extract[RouteName, String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]
  
  type ScreenListeners[State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] = Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ EventName in keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> ]: tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventListenerCallback<EventMap, EventName>}
    */ typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.ScreenListeners with TopLevel[js.Any]
  ]
  
  @js.native
  trait TypedNavigator[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ReactComponentClass[_] */] extends StObject {
    
    /**
      * Navigator component which manages the child screens.
      */
    var Navigator: ReactComponentClass[
        (Omit[
          ComponentProps[Navigator], 
          /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ initialRouteName | children | screenOptions
        ]) with (DefaultNavigatorOptions[ScreenOptions, ParamList])
      ] = js.native
    
    /**
      * Component used for specifying route configuration.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def Screen[RouteName /* <: /* keyof ParamList */ String */](_underscore: RouteConfig[ParamList, RouteName, State, ScreenOptions, EventMap]): Null = js.native
  }
  object TypedNavigator {
    
    @scala.inline
    def apply[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ReactComponentClass[_] */](
      Navigator: ReactComponentClass[
          (Omit[
            ComponentProps[Navigator], 
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ initialRouteName | children | screenOptions
          ]) with (DefaultNavigatorOptions[ScreenOptions, ParamList])
        ],
      Screen: RouteConfig[ParamList, js.Any, State, ScreenOptions, EventMap] => Null
    ): TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator] = {
      val __obj = js.Dynamic.literal(Navigator = Navigator.asInstanceOf[js.Any], Screen = js.Any.fromFunction1(Screen))
      __obj.asInstanceOf[TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator]]
    }
    
    @scala.inline
    implicit class TypedNavigatorMutableBuilder[Self <: TypedNavigator[_, _, _, _, _], ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ReactComponentClass[_] */] (val x: Self with (TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator])) extends AnyVal {
      
      @scala.inline
      def setNavigator(
        value: ReactComponentClass[
              (Omit[
                ComponentProps[Navigator], 
                /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ initialRouteName | children | screenOptions
              ]) with (DefaultNavigatorOptions[ScreenOptions, ParamList])
            ]
      ): Self = StObject.set(x, "Navigator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen(value: RouteConfig[ParamList, js.Any, State, ScreenOptions, EventMap] => Null): Self = StObject.set(x, "Screen", js.Any.fromFunction1(value))
    }
  }
}
