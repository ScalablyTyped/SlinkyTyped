package typingsSlinky.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterCore.paramsInterfaceMod.RawParams
import typingsSlinky.uirouterCore.resolvableMod.Resolvable
import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.stateInterfaceMod.StateOrName
import typingsSlinky.uirouterCore.stateInterfaceMod._StateDeclaration
import typingsSlinky.uirouterCore.stateRegistryMod.StateRegistryListener
import typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionOptions
import typingsSlinky.uirouterCore.urlMatcherFactoryMod.UrlMatcherFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("@uirouter/core/lib/state", "StateBuilder")
  @js.native
  class StateBuilder protected ()
    extends typingsSlinky.uirouterCore.stateBuilderMod.StateBuilder {
    def this(
      matcher: typingsSlinky.uirouterCore.stateMatcherMod.StateMatcher,
      urlMatcherFactory: UrlMatcherFactory
    ) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "StateMatcher")
  @js.native
  class StateMatcher protected ()
    extends typingsSlinky.uirouterCore.stateMatcherMod.StateMatcher {
    def this(_states: StringDictionary[typingsSlinky.uirouterCore.stateObjectMod.StateObject]) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "StateObject")
  @js.native
  /** @deprecated use State.create() */
  class StateObject ()
    extends typingsSlinky.uirouterCore.stateObjectMod.StateObject {
    def this(config: StateDeclaration) = this()
  }
  /* static members */
  object StateObject {
    
    /**
      * Create a state object to put the private/internal implementation details onto.
      * The object's prototype chain looks like:
      * (Internal State Object) -> (Copy of State.prototype) -> (State Declaration object) -> (State Declaration's prototype...)
      *
      * @param stateDecl the user-supplied State Declaration
      * @returns {StateObject} an internal State object
      */
    @JSImport("@uirouter/core/lib/state", "StateObject.create")
    @js.native
    def create(stateDecl: _StateDeclaration): typingsSlinky.uirouterCore.stateObjectMod.StateObject = js.native
    
    /** Predicate which returns true if the object is an internal [[StateObject]] object */
    @JSImport("@uirouter/core/lib/state", "StateObject.isState")
    @js.native
    def isState(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean = js.native
    
    /** Predicate which returns true if the object is an class with @State() decorator */
    @JSImport("@uirouter/core/lib/state", "StateObject.isStateClass")
    @js.native
    def isStateClass(stateDecl: _StateDeclaration): Boolean = js.native
    
    /** Predicate which returns true if the object is a [[StateDeclaration]] object */
    @JSImport("@uirouter/core/lib/state", "StateObject.isStateDeclaration")
    @js.native
    def isStateDeclaration(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.StateDeclaration */ Boolean = js.native
  }
  
  @JSImport("@uirouter/core/lib/state", "StateQueueManager")
  @js.native
  class StateQueueManager protected ()
    extends typingsSlinky.uirouterCore.stateQueueManagerMod.StateQueueManager {
    def this(
      router: UIRouter,
      states: StringDictionary[typingsSlinky.uirouterCore.stateObjectMod.StateObject],
      builder: typingsSlinky.uirouterCore.stateBuilderMod.StateBuilder,
      listeners: js.Array[StateRegistryListener]
    ) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "StateRegistry")
  @js.native
  class StateRegistry protected ()
    extends typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry {
    /** @internal */
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "StateService")
  @js.native
  class StateService protected ()
    extends typingsSlinky.uirouterCore.stateServiceMod.StateService {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "TargetState")
  @js.native
  class TargetState protected ()
    extends typingsSlinky.uirouterCore.targetStateMod.TargetState {
    /**
      * The TargetState constructor
      *
      * Note: Do not construct a `TargetState` manually.
      * To create a `TargetState`, use the [[StateService.target]] factory method.
      *
      * @param _stateRegistry The StateRegistry to use to look up the _definition
      * @param _identifier An identifier for a state.
      *    Either a fully-qualified state name, or the object used to define the state.
      * @param _params Parameters for the target state
      * @param _options Transition options.
      *
      * @internal
      */
    def this(
      _stateRegistry: typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry,
      _identifier: StateOrName
    ) = this()
    def this(
      _stateRegistry: typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: RawParams
    ) = this()
    def this(
      _stateRegistry: typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: js.UndefOr[scala.Nothing],
      _options: TransitionOptions
    ) = this()
    def this(
      _stateRegistry: typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: RawParams,
      _options: TransitionOptions
    ) = this()
  }
  /* static members */
  object TargetState {
    
    /** Returns true if the object has a state property that might be a state or state name */
    @JSImport("@uirouter/core/lib/state", "TargetState.isDef")
    @js.native
    def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ Boolean = js.native
  }
  
  @JSImport("@uirouter/core/lib/state", "resolvablesBuilder")
  @js.native
  def resolvablesBuilder(state: typingsSlinky.uirouterCore.stateObjectMod.StateObject): js.Array[Resolvable] = js.native
}
