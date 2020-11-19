package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookFn
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookMatchCriterion
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookRegOptions
import typingsSlinky.uirouterCore.transitionInterfaceMod.IHookRegistry
import typingsSlinky.uirouterCore.transitionInterfaceMod.IMatchingNodes
import typingsSlinky.uirouterCore.transitionInterfaceMod.TreeChanges
import typingsSlinky.uirouterCore.transitionServiceMod.TransitionService
import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/transition/hookRegistry", JSImport.Namespace)
@js.native
object hookRegistryMod extends js.Object {
  
  def makeEvent(registry: IHookRegistry, transitionService: TransitionService, eventType: TransitionEventType): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  
  def matchState(state: StateObject, criterion: HookMatchCriterion, transition: Transition): Boolean = js.native
  
  @js.native
  class RegisteredHook protected () extends js.Object {
    def this(
      tranSvc: TransitionService,
      eventType: TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ RegisteredHook, Unit]
    ) = this()
    def this(
      tranSvc: TransitionService,
      eventType: TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ RegisteredHook, Unit],
      options: HookRegOptions
    ) = this()
    
    var _deregistered: Boolean = js.native
    
    /**
      * Gets the default match criteria (all `true`)
      *
      * Returns an object which has all the criteria match paths as keys and `true` as values, i.e.:
      *
      * ```js
      * {
      *   to: true,
      *   from: true,
      *   entering: true,
      *   exiting: true,
      *   retained: true,
      * }
      */
    var _getDefaultMatchCriteria: js.Any = js.native
    
    /**
      * Gets matching nodes as [[IMatchingNodes]]
      *
      * Create a IMatchingNodes object from the TransitionHookTypes that is roughly equivalent to:
      *
      * ```js
      * let matches: IMatchingNodes = {
      *   to:       _matchingNodes([tail(treeChanges.to)],   mc.to),
      *   from:     _matchingNodes([tail(treeChanges.from)], mc.from),
      *   exiting:  _matchingNodes(treeChanges.exiting,      mc.exiting),
      *   retained: _matchingNodes(treeChanges.retained,     mc.retained),
      *   entering: _matchingNodes(treeChanges.entering,     mc.entering),
      * };
      * ```
      */
    var _getMatchingNodes: js.Any = js.native
    
    /**
      * Gets the matching [[PathNode]]s
      *
      * Given an array of [[PathNode]]s, and a [[HookMatchCriterion]], returns an array containing
      * the [[PathNode]]s that the criteria matches, or `null` if there were no matching nodes.
      *
      * Returning `null` is significant to distinguish between the default
      * "match-all criterion value" of `true` compared to a `() => true` function,
      * when the nodes is an empty array.
      *
      * This is useful to allow a transition match criteria of `entering: true`
      * to still match a transition, even when `entering === []`.  Contrast that
      * with `entering: (state) => true` which only matches when a state is actually
      * being entered.
      */
    var _matchingNodes: js.Any = js.native
    
    var bind: js.Any = js.native
    
    var callback: HookFn = js.native
    
    def deregister(): Unit = js.native
    
    var eventType: TransitionEventType = js.native
    
    var invokeCount: Double = js.native
    
    var invokeLimit: Double = js.native
    
    var matchCriteria: HookMatchCriteria = js.native
    
    /**
      * Determines if this hook's [[matchCriteria]] match the given [[TreeChanges]]
      *
      * @returns an IMatchingNodes object, or null. If an IMatchingNodes object is returned, its values
      * are the matching [[PathNode]]s for each [[HookMatchCriterion]] (to, from, exiting, retained, entering)
      */
    def matches(treeChanges: TreeChanges, transition: Transition): IMatchingNodes = js.native
    
    var priority: Double = js.native
    
    def removeHookFromRegistry(hook: RegisteredHook): Unit = js.native
    
    var tranSvc: TransitionService = js.native
  }
}
