package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.stateBuilderMod.BuilderFunction
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.stateInterfaceMod.StateOrName
import typingsSlinky.uirouterCore.stateInterfaceMod._StateDeclaration
import typingsSlinky.uirouterCore.stateMatcherMod.StateMatcher
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.stateQueueManagerMod.StateQueueManager
import typingsSlinky.uirouterCore.uirouterCoreStrings.deregistered
import typingsSlinky.uirouterCore.uirouterCoreStrings.registered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateRegistryMod {
  
  @JSImport("@uirouter/core/lib/state/stateRegistry", "StateRegistry")
  @js.native
  class StateRegistry protected () extends StObject {
    /** @internal */
    def this(router: UIRouter) = this()
    
    /** @internal */
    var _deregisterTree: js.Any = js.native
    
    /** @internal */
    var _registerRoot: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var builder: js.Any = js.native
    
    /**
      * Registers a [[BuilderFunction]] for a specific [[StateObject]] property (e.g., `parent`, `url`, or `path`).
      * More than one BuilderFunction can be registered for a given property.
      *
      * The BuilderFunction(s) will be used to define the property on any subsequently built [[StateObject]] objects.
      *
      * @param property The name of the State property being registered for.
      * @param builderFunction The BuilderFunction which will be used to build the State property
      * @returns a function which deregisters the BuilderFunction
      */
    def decorator(property: String, builderFunction: BuilderFunction): js.Function = js.native
    
    /**
      * Removes a state from the registry
      *
      * This removes a state from the registry.
      * If the state has children, they are are also removed from the registry.
      *
      * @param stateOrName the state's name or object representation
      * @returns {StateObject[]} a list of removed states
      */
    def deregister(stateOrName: StateOrName): js.Array[StateObject] = js.native
    
    /** @internal */
    def dispose(): Unit = js.native
    
    /**
      * Gets all registered states
      *
      * Calling this method with no arguments will return a list of all the states that are currently registered.
      * Note: this does not return states that are *queued* but not yet registered.
      *
      * @return a list of [[StateDeclaration]]s
      */
    def get(): js.Array[StateDeclaration] = js.native
    /**
      * Gets a registered state
      *
      * Given a state or a name, finds and returns the [[StateDeclaration]] from the registry.
      * Note: this does not return states that are *queued* but not yet registered.
      *
      * @param stateOrName either the name of a state, or a state object.
      * @param base the base state to use when stateOrName is relative.
      * @return a registered [[StateDeclaration]] that matched the `stateOrName`, or null if the state isn't registered.
      */
    def get(stateOrName: StateOrName): StateDeclaration = js.native
    def get(stateOrName: StateOrName, base: StateOrName): StateDeclaration = js.native
    
    /** @internal */
    var listeners: js.Array[StateRegistryListener] = js.native
    
    /** @internal */
    var matcher: StateMatcher = js.native
    
    /**
      * Listen for a State Registry events
      *
      * Adds a callback that is invoked when states are registered or deregistered with the StateRegistry.
      *
      * #### Example:
      * ```js
      * let allStates = registry.get();
      *
      * // Later, invoke deregisterFn() to remove the listener
      * let deregisterFn = registry.onStatesChanged((event, states) => {
      *   switch(event) {
      *     case: 'registered':
      *       states.forEach(state => allStates.push(state));
      *       break;
      *     case: 'deregistered':
      *       states.forEach(state => {
      *         let idx = allStates.indexOf(state);
      *         if (idx !== -1) allStates.splice(idx, 1);
      *       });
      *       break;
      *   }
      * });
      * ```
      *
      * @param listener a callback function invoked when the registered states changes.
      *        The function receives two parameters, `event` and `state`.
      *        See [[StateRegistryListener]]
      * @return a function that deregisters the listener
      */
    def onStatesChanged(listener: StateRegistryListener): js.Function0[Unit] = js.native
    
    /**
      * Adds a state to the registry
      *
      * Registers a [[StateDeclaration]] or queues it for registration.
      *
      * Note: a state will be queued if the state's parent isn't yet registered.
      *
      * @param stateDefinition the definition of the state to register.
      * @returns the internal [[StateObject]] object.
      *          If the state was successfully registered, then the object is fully built (See: [[StateBuilder]]).
      *          If the state was only queued, then the object is not fully built.
      */
    def register(stateDefinition: _StateDeclaration): StateObject = js.native
    
    /**
      * Gets the implicit root state
      *
      * Gets the root of the state tree.
      * The root state is implicitly created by UI-Router.
      * Note: this returns the internal [[StateObject]] representation, not a [[StateDeclaration]]
      *
      * @return the root [[StateObject]]
      */
    def root(): StateObject = js.native
    
    var router: js.Any = js.native
    
    /** @internal */
    var stateQueue: StateQueueManager = js.native
    
    var states: js.Any = js.native
  }
  
  type StateRegistryListener = js.Function2[/* event */ registered | deregistered, /* states */ js.Array[StateDeclaration], Unit]
}
