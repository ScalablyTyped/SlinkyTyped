package typingsSlinky.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterCore.commonCommonMod.PredicateBinary
import typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook
import typingsSlinky.uirouterCore.pathNodeMod.PathNode
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.targetStateMod.TargetState
import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import typingsSlinky.uirouterCore.uirouterCoreStrings.otherwise
import typingsSlinky.uirouterCore.uirouterCoreStrings.redirect
import typingsSlinky.uirouterCore.uirouterCoreStrings.replace
import typingsSlinky.uirouterCore.uirouterCoreStrings.sref
import typingsSlinky.uirouterCore.uirouterCoreStrings.unknown
import typingsSlinky.uirouterCore.uirouterCoreStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionInterfaceMod {
  
  @js.native
  sealed trait TransitionHookPhase extends StObject
  @JSImport("@uirouter/core/lib/transition/interface", "TransitionHookPhase")
  @js.native
  object TransitionHookPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransitionHookPhase with Double] = js.native
    
    @js.native
    sealed trait BEFORE extends TransitionHookPhase
    /* 1 */ val BEFORE: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.BEFORE with Double = js.native
    
    @js.native
    sealed trait CREATE extends TransitionHookPhase
    /* 0 */ val CREATE: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.CREATE with Double = js.native
    
    @js.native
    sealed trait ERROR extends TransitionHookPhase
    /* 4 */ val ERROR: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.ERROR with Double = js.native
    
    @js.native
    sealed trait RUN extends TransitionHookPhase
    /* 2 */ val RUN: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.RUN with Double = js.native
    
    @js.native
    sealed trait SUCCESS extends TransitionHookPhase
    /* 3 */ val SUCCESS: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.SUCCESS with Double = js.native
  }
  
  @js.native
  sealed trait TransitionHookScope extends StObject
  @JSImport("@uirouter/core/lib/transition/interface", "TransitionHookScope")
  @js.native
  object TransitionHookScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransitionHookScope with Double] = js.native
    
    @js.native
    sealed trait STATE extends TransitionHookScope
    /* 1 */ val STATE: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookScope.STATE with Double = js.native
    
    @js.native
    sealed trait TRANSITION extends TransitionHookScope
    /* 0 */ val TRANSITION: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookScope.TRANSITION with Double = js.native
  }
  
  type HookFn = TransitionHookFn | TransitionStateHookFn | TransitionCreateHookFn
  
  @js.native
  trait HookMatchCriteria
    extends /* key */ StringDictionary[js.UndefOr[HookMatchCriterion]] {
    
    /** A [[HookMatchCriterion]] to match any state that would be entering */
    var entering: js.UndefOr[HookMatchCriterion] = js.native
    
    /** A [[HookMatchCriterion]] to match any state that would be exiting */
    var exiting: js.UndefOr[HookMatchCriterion] = js.native
    
    /** A [[HookMatchCriterion]] to match the original (from) state */
    var from: js.UndefOr[HookMatchCriterion] = js.native
    
    /** A [[HookMatchCriterion]] to match any state that would be retained */
    var retained: js.UndefOr[HookMatchCriterion] = js.native
    
    /** A [[HookMatchCriterion]] to match the destination state */
    var to: js.UndefOr[HookMatchCriterion] = js.native
  }
  object HookMatchCriteria {
    
    @scala.inline
    def apply(): HookMatchCriteria = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookMatchCriteria]
    }
    
    @scala.inline
    implicit class HookMatchCriteriaMutableBuilder[Self <: HookMatchCriteria] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntering(value: HookMatchCriterion): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnteringFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = StObject.set(x, "entering", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnteringUndefined: Self = StObject.set(x, "entering", js.undefined)
      
      @scala.inline
      def setExiting(value: HookMatchCriterion): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitingFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = StObject.set(x, "exiting", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExitingUndefined: Self = StObject.set(x, "exiting", js.undefined)
      
      @scala.inline
      def setFrom(value: HookMatchCriterion): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = StObject.set(x, "from", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setRetained(value: HookMatchCriterion): Self = StObject.set(x, "retained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainedFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = StObject.set(x, "retained", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRetainedUndefined: Self = StObject.set(x, "retained", js.undefined)
      
      @scala.inline
      def setTo(value: HookMatchCriterion): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type HookMatchCriterion = String | IStateMatch | Boolean
  
  @js.native
  trait HookRegOptions extends StObject {
    
    /**
      * Specifies what `this` is bound to during hook invocation.
      */
    var bind: js.UndefOr[js.Any] = js.native
    
    /**
      * Limits the number of times that the hook will be invoked.
      * Once the hook has been invoked this many times, it is automatically deregistered.
      */
    var invokeLimit: js.UndefOr[Double] = js.native
    
    /**
      * Sets the priority of the registered hook
      *
      * Hooks of the same type (onBefore, onStart, etc) are invoked in priority order.  A hook with a higher priority
      * is invoked before a hook with a lower priority.
      *
      * The default hook priority is 0
      */
    var priority: js.UndefOr[Double] = js.native
  }
  object HookRegOptions {
    
    @scala.inline
    def apply(): HookRegOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookRegOptions]
    }
    
    @scala.inline
    implicit class HookRegOptionsMutableBuilder[Self <: HookRegOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: js.Any): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setInvokeLimit(value: Double): Self = StObject.set(x, "invokeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeLimitUndefined: Self = StObject.set(x, "invokeLimit", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  type HookResult = Boolean | TargetState | Unit | (js.Promise[Boolean | TargetState | Unit])
  
  type IHookRegistration = js.Function3[
    /* matchCriteria */ HookMatchCriteria, 
    /* callback */ HookFn, 
    /* options */ js.UndefOr[HookRegOptions], 
    js.Function
  ]
  
  @js.native
  trait IHookRegistry extends StObject {
    
    /** @internal place to store the hooks */
    var _registeredHooks: StringDictionary[js.Array[RegisteredHook]] = js.native
    
    /**
      * Returns all the registered hooks of a given `hookName` type
      *
      * #### Example:
      * ```
      * $transitions.getHooks("onEnter")
      * ```
      */
    def getHooks(hookName: String): js.Array[RegisteredHook] = js.native
    
    /**
      * Registers a [[TransitionHookFn]], called *before a transition starts*.
      *
      * Registers a transition lifecycle hook, which is invoked before a transition even begins.
      * This hook can be useful to implement logic which prevents a transition from even starting, such
      * as authentication, redirection
      *
      * See [[TransitionHookFn]] for the signature of the function.
      *
      * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
      * To match all Transitions, use an empty criteria object `{}`.
      *
      * ### Lifecycle
      *
      * `onBefore` hooks are invoked *before a Transition starts*.
      * No resolves have been fetched yet.
      * Each `onBefore` hook is invoked synchronously, in the same call stack as [[StateService.transitionTo]].
      * The registered `onBefore` hooks are invoked in priority order.
      *
      * Note: during the `onBefore` phase, additional hooks can be added to the specific [[Transition]] instance.
      * These "on-the-fly" hooks only affect the currently running transition..
      *
      * ### Return value
      *
      * The hook's return value can be used to pause, cancel, or redirect the current Transition.
      * See [[HookResult]] for more information.
      *
      * If any hook modifies the transition *synchronously* (by throwing, returning `false`, or returning
      * a [[TargetState]]), the remainder of the hooks are skipped.
      * If a hook returns a promise, the remainder of the `onBefore` hooks are still invoked synchronously.
      * All promises are resolved, and processed asynchronously before the `onStart` phase of the Transition.
      *
      * ### Examples
      *
      * #### Default Substate
      *
      * This example redirects any transition from 'home' to 'home.dashboard'.  This is commonly referred to as a
      * "default substate".
      *
      * @example
      * ```js
      * // ng2
      * transitionService.onBefore({ to: 'home' }, (trans: Transition) =>
      *     trans.router.stateService.target("home.dashboard"));
      * ```
      *
      * #### Data Driven Default Substate
      *
      * This example provides data-driven default substate functionality. It matches on a transition to any state
      * which has `defaultSubstate: "some.sub.state"` defined.  See: [[Transition.to]] which returns the "to state"
      * definition.
      *
      * @example
      * ```js
      * // ng1
      * // state declaration
      * {
      *   name: 'home',
      *   template: '<div ui-view/>',
      *   defaultSubstate: 'home.dashboard'
      * }
      *
      * var criteria = {
      *   to: function(state) {
      *     return state.defaultSubstate != null;
      *   }
      * }
      *
      * $transitions.onBefore(criteria, function(trans: Transition) {
      *   var substate = trans.to().defaultSubstate;
      *   return trans.router.stateService.target(substate);
      * });
      * ```
      *
      *
      * #### Require authentication
      *
      * This example cancels a transition to a state which requires authentication, if the user is not currently authenticated.
      *
      * This example assumes a state tree where all states which require authentication are children of a parent `'requireauth'` state.
      * This example assumes `MyAuthService` synchronously returns a boolean from `isAuthenticated()`.
      *
      * #### Example:
      * ```js
      * // ng1
      * $transitions.onBefore( { to: 'requireauth.**' }, function(trans) {
      *   var myAuthService = trans.injector().get('MyAuthService');
      *   // If isAuthenticated returns false, the transition is cancelled.
      *   return myAuthService.isAuthenticated();
      * });
      * ```
      *
      * @param matchCriteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be invoked.
      * @returns a function which deregisters the hook.
      */
    def onBefore(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
    def onBefore(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
    
    /**
      * Registers a [[TransitionStateHookFn]], called when a specific state is entered.
      *
      * Registers a lifecycle hook, which is invoked (during a transition) when a specific state is being entered.
      *
      * Since this hook is run only when the specific state is being *entered*, it can be useful for
      * performing tasks when entering a submodule/feature area such as initializing a stateful service,
      * or for guarding access to a submodule/feature area.
      *
      * See [[TransitionStateHookFn]] for the signature of the function.
      *
      * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
      * `onEnter` hooks generally specify `{ entering: 'somestate' }`.
      * To match all Transitions, use an empty criteria object `{}`.
      *
      * ### Lifecycle
      *
      * `onEnter` hooks are invoked when the Transition is entering a state.
      * States are entered after the `onRetain` phase is complete.
      * If more than one state is being entered, the parent state is entered first.
      * The registered `onEnter` hooks for a state are invoked in priority order.
      *
      * Note: A built-in `onEnter` hook with high priority is used to fetch lazy resolve data for states being entered.
      *
      * ### Return value
      *
      * The hook's return value can be used to pause, cancel, or redirect the current Transition.
      * See [[HookResult]] for more information.
      *
      * ### Inside a state declaration
      *
      * Instead of registering `onEnter` hooks using the [[TransitionService]], you may define an `onEnter` hook
      * directly on a state declaration (see: [[StateDeclaration.onEnter]]).
      *
      *
      * ### Examples
      *
      * #### Audit Log
      *
      * This example uses a service to log that a user has entered the admin section of an app.
      * This assumes that there are substates of the "admin" state, such as "admin.users", "admin.pages", etc.
      * @example
      * ```
      *
      * $transitions.onEnter({ entering: 'admin' }, function(transition, state) {
      *   var AuditService = trans.injector().get('AuditService');
      *   AuditService.log("Entered " + state.name + " module while transitioning to " + transition.to().name);
      * }
      * ```
      *
      * #### Audit Log (inside a state declaration)
      *
      * The `onEnter` inside this state declaration is syntactic sugar for the previous Audit Log example.
      * ```
      * {
      *   name: 'admin',
      *   component: 'admin',
      *   onEnter: function($transition$, $state$) {
      *     var AuditService = $transition$.injector().get('AuditService');
      *     AuditService.log("Entered " + state.name + " module while transitioning to " + transition.to().name);
      *   }
      * }
      * ```
      *
      * Note: A state declaration's `onEnter` function is injected for Angular 1 only.
      *
      * @param matchCriteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be injected and invoked.
      * @returns a function which deregisters the hook.
      */
    def onEnter(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn): js.Function = js.native
    def onEnter(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn, options: HookRegOptions): js.Function = js.native
    
    /**
      * Registers a [[TransitionHookFn]], called after a transition has errored.
      *
      * Registers a transition lifecycle hook, which is invoked after a transition has been rejected for any reason.
      *
      * See [[TransitionHookFn]] for the signature of the function.
      *
      * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
      * To match all Transitions, use an empty criteria object `{}`.
      *
      * ### Lifecycle
      *
      * The `onError` hooks are chained off the Transition's promise (see [[Transition.promise]]).
      * If a Transition fails, its promise is rejected and the `onError` hooks are invoked.
      * The `onError` hooks are invoked in priority order.
      *
      * Since these hooks are run after the transition is over, their return value is ignored.
      *
      * A transition "errors" if it was started, but failed to complete (for any reason).
      * A *non-exhaustive list* of reasons a transition can error:
      *
      * - A transition was cancelled because a new transition started while it was still running (`Transition superseded`)
      * - A transition was cancelled by a Transition Hook returning false
      * - A transition was redirected by a Transition Hook returning a [[TargetState]]
      * - A Transition Hook or resolve function threw an error
      * - A Transition Hook returned a rejected promise
      * - A resolve function returned a rejected promise
      *
      * To check the failure reason, inspect the return value of [[Transition.error]].
      *
      * Note: `onError` should be used for targeted error handling, or error recovery.
      * For simple catch-all error reporting, use [[StateService.defaultErrorHandler]].
      *
      * ### Return value
      *
      * Since the Transition is already completed, the hook's return value is ignored
      *
      * @param matchCriteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be injected and invoked.
      * @returns a function which deregisters the hook.
      */
    def onError(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
    def onError(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
    
    /**
      * Registers a [[TransitionStateHookFn]], called when a specific state is exited.
      *
      * Registers a lifecycle hook, which is invoked (during a transition) when a specific state is being exited.
      *
      * Since this hook is run only when the specific state is being *exited*, it can be useful for
      * performing tasks when leaving a submodule/feature area such as cleaning up a stateful service,
      * or for preventing the user from leaving a state or submodule until some criteria is satisfied.
      *
      * See [[TransitionStateHookFn]] for the signature of the function.
      *
      * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
      * `onExit` hooks generally specify `{ exiting: 'somestate' }`.
      * To match all Transitions, use an empty criteria object `{}`.
      *
      * ### Lifecycle
      *
      * `onExit` hooks are invoked when the Transition is exiting a state.
      * States are exited after any `onStart` phase is complete.
      * If more than one state is being exited, the child states are exited first.
      * The registered `onExit` hooks for a state are invoked in priority order.
      *
      * ### Return value
      *
      * The hook's return value can be used to pause, cancel, or redirect the current Transition.
      * See [[HookResult]] for more information.
      *
      * ### Inside a state declaration
      *
      * Instead of registering `onExit` hooks using the [[TransitionService]], you may define an `onExit` hook
      * directly on a state declaration (see: [[StateDeclaration.onExit]]).
      *
      * Note: A state declaration's `onExit` function is injected for Angular 1 only.
      *
      * @param matchCriteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be injected and invoked.
      * @returns a function which deregisters the hook.
      */
    def onExit(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn): js.Function = js.native
    def onExit(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn, options: HookRegOptions): js.Function = js.native
    
    /**
      * Registers a [[TransitionHookFn]], called *just before a transition finishes*.
      *
      * Registers a transition lifecycle hook, which is invoked just before a transition finishes.
      * This hook is a last chance to cancel or redirect a transition.
      *
      * See [[TransitionHookFn]] for the signature of the function.
      *
      * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
      * To match all Transitions, use an empty criteria object `{}`.
      *
      * ### Lifecycle
      *
      * `onFinish` hooks are invoked after the `onEnter` phase is complete.
      * These hooks are invoked just before the transition is "committed".
      * Each hook is invoked in priority order.
      *
      * ### Return value
      *
      * The hook's return value can be used to pause, cancel, or redirect the current Transition.
      * See [[HookResult]] for more information.
      *
      * @param matchCriteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be injected and invoked.
      * @returns a function which deregisters the hook.
      */
    def onFinish(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
    def onFinish(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
    
    /**
      * Registers a [[TransitionStateHookFn]], called when a specific state is retained/kept.
      *
      * Registers a lifecycle hook, which is invoked (during a transition) for
      * a specific state that was previously active will remain active (is not being entered nor exited).
      *
      * This hook is invoked when a state is "retained" or "kept".
      * It means the transition is coming *from* a substate of the retained state *to* a substate of the retained state.
      * This hook can be used to perform actions when the user moves from one substate to another, such as between steps in a wizard.
      *
      * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
      * `onRetain` hooks generally specify `{ retained: 'somestate' }`.
      * To match all Transitions, use an empty criteria object `{}`.
      *
      * ### Lifecycle
      *
      * `onRetain` hooks are invoked after any `onExit` hooks have been fired.
      * If more than one state is retained, the child states' `onRetain` hooks are invoked first.
      * The registered `onRetain` hooks for a state are invoked in priority order.
      *
      * ### Return value
      *
      * The hook's return value can be used to pause, cancel, or redirect the current Transition.
      * See [[HookResult]] for more information.
      *
      * ### Inside a state declaration
      *
      * Instead of registering `onRetain` hooks using the [[TransitionService]], you may define an `onRetain` hook
      * directly on a state declaration (see: [[StateDeclaration.onRetain]]).
      *
      * Note: A state declaration's `onRetain` function is injected for Angular 1 only.
      *
      * @param matchCriteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be injected and invoked.
      * @returns a function which deregisters the hook.
      */
    def onRetain(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn): js.Function = js.native
    def onRetain(matchCriteria: HookMatchCriteria, callback: TransitionStateHookFn, options: HookRegOptions): js.Function = js.native
    
    /**
      * Registers a [[TransitionHookFn]], called when a transition starts.
      *
      * Registers a transition lifecycle hook, which is invoked as a transition starts running.
      * This hook can be useful to perform some asynchronous action before completing a transition.
      *
      * See [[TransitionHookFn]] for the signature of the function.
      *
      * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
      * To match all Transitions, use an empty criteria object `{}`.
      *
      * ### Lifecycle
      *
      * `onStart` hooks are invoked asynchronously when the Transition starts running.
      * This happens after the `onBefore` phase is complete.
      * At this point, the Transition has not yet exited nor entered any states.
      * The registered `onStart` hooks are invoked in priority order.
      *
      * Note: A built-in `onStart` hook with high priority is used to fetch any eager resolve data.
      *
      * ### Return value
      *
      * The hook's return value can be used to pause, cancel, or redirect the current Transition.
      * See [[HookResult]] for more information.
      *
      * ### Example
      *
      * #### Login during transition
      *
      * This example intercepts any transition to a state which requires authentication, when the user is
      * not currently authenticated.  It allows the user to authenticate asynchronously, then resumes the
      * transition.  If the user did not authenticate successfully, it redirects to the "guest" state, which
      * does not require authentication.
      *
      * This example assumes:
      * - a state tree where all states which require authentication are children of a parent `'auth'` state.
      * - `MyAuthService.isAuthenticated()` synchronously returns a boolean.
      * - `MyAuthService.authenticate()` presents a login dialog, and returns a promise which is resolved
      *   or rejected, whether or not the login attempt was successful.
      *
      * #### Example:
      * ```js
      * // ng1
      * $transitions.onStart( { to: 'auth.**' }, function(trans) {
      *   var $state = trans.router.stateService;
      *   var MyAuthService = trans.injector().get('MyAuthService');
      *
      *   // If the user is not authenticated
      *   if (!MyAuthService.isAuthenticated()) {
      *
      *     // Then return a promise for a successful login.
      *     // The transition will wait for this promise to settle
      *
      *     return MyAuthService.authenticate().catch(function() {
      *
      *       // If the authenticate() method failed for whatever reason,
      *       // redirect to a 'guest' state which doesn't require auth.
      *       return $state.target("guest");
      *     });
      *   }
      * });
      * ```
      *
      * @param matchCriteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be injected and invoked.
      * @returns a function which deregisters the hook.
      */
    def onStart(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
    def onStart(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
    
    /**
      * Registers a [[TransitionHookFn]], called after a successful transition completed.
      *
      * Registers a transition lifecycle hook, which is invoked after a transition successfully completes.
      *
      * See [[TransitionHookFn]] for the signature of the function.
      *
      * The [[HookMatchCriteria]] is used to determine which Transitions the hook should be invoked for.
      * To match all Transitions, use an empty criteria object `{}`.
      *
      * ### Lifecycle
      *
      * `onSuccess` hooks are chained off the Transition's promise (see [[Transition.promise]]).
      * If the Transition is successful and its promise is resolved, then the `onSuccess` hooks are invoked.
      * Since these hooks are run after the transition is over, their return value is ignored.
      * The `onSuccess` hooks are invoked in priority order.
      *
      * ### Return value
      *
      * Since the Transition is already completed, the hook's return value is ignored
      *
      * @param matchCriteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be injected and invoked.
      * @returns a function which deregisters the hook.
      */
    def onSuccess(matchCriteria: HookMatchCriteria, callback: TransitionHookFn): js.Function = js.native
    def onSuccess(matchCriteria: HookMatchCriteria, callback: TransitionHookFn, options: HookRegOptions): js.Function = js.native
  }
  
  @js.native
  trait IMatchingNodes
    extends /* key */ StringDictionary[js.Array[PathNode]] {
    
    var entering: js.Array[PathNode] = js.native
    
    var exiting: js.Array[PathNode] = js.native
    
    var from: js.Array[PathNode] = js.native
    
    var retained: js.Array[PathNode] = js.native
    
    var to: js.Array[PathNode] = js.native
  }
  object IMatchingNodes {
    
    @scala.inline
    def apply(
      entering: js.Array[PathNode],
      exiting: js.Array[PathNode],
      from: js.Array[PathNode],
      retained: js.Array[PathNode],
      to: js.Array[PathNode]
    ): IMatchingNodes = {
      val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMatchingNodes]
    }
    
    @scala.inline
    implicit class IMatchingNodesMutableBuilder[Self <: IMatchingNodes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntering(value: js.Array[PathNode]): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnteringVarargs(value: PathNode*): Self = StObject.set(x, "entering", js.Array(value :_*))
      
      @scala.inline
      def setExiting(value: js.Array[PathNode]): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitingVarargs(value: PathNode*): Self = StObject.set(x, "exiting", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: js.Array[PathNode]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromVarargs(value: PathNode*): Self = StObject.set(x, "from", js.Array(value :_*))
      
      @scala.inline
      def setRetained(value: js.Array[PathNode]): Self = StObject.set(x, "retained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainedVarargs(value: PathNode*): Self = StObject.set(x, "retained", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: js.Array[PathNode]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToVarargs(value: PathNode*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  type IStateMatch = PredicateBinary[StateObject, Transition]
  
  @js.native
  trait PathType extends StObject {
    
    var name: String = js.native
    
    var scope: TransitionHookScope = js.native
  }
  object PathType {
    
    @scala.inline
    def apply(name: String, scope: TransitionHookScope): PathType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathType]
    }
    
    @scala.inline
    implicit class PathTypeMutableBuilder[Self <: PathType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: TransitionHookScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PathTypes extends /* key */ StringDictionary[PathType] {
    
    var entering: PathType = js.native
    
    var exiting: PathType = js.native
    
    var from: PathType = js.native
    
    var retained: PathType = js.native
    
    var to: PathType = js.native
  }
  object PathTypes {
    
    @scala.inline
    def apply(entering: PathType, exiting: PathType, from: PathType, retained: PathType, to: PathType): PathTypes = {
      val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathTypes]
    }
    
    @scala.inline
    implicit class PathTypesMutableBuilder[Self <: PathTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntering(value: PathType): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExiting(value: PathType): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: PathType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetained(value: PathType): Self = StObject.set(x, "retained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: PathType): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type RegisteredHooks = StringDictionary[js.Array[RegisteredHook]]
  
  type TransitionCreateHookFn = js.Function1[/* transition */ Transition, Unit]
  
  type TransitionHookFn = js.Function1[/* transition */ Transition, HookResult]
  
  @js.native
  trait TransitionHookOptions extends StObject {
    
    var bind: js.UndefOr[js.Any] = js.native
    
    var current: js.UndefOr[js.Function0[Transition]] = js.native
    
    var hookType: js.UndefOr[String] = js.native
    
    var stateHook: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[js.Any] = js.native
    
    var traceData: js.UndefOr[js.Any] = js.native
    
    var transition: js.UndefOr[Transition] = js.native
  }
  object TransitionHookOptions {
    
    @scala.inline
    def apply(): TransitionHookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionHookOptions]
    }
    
    @scala.inline
    implicit class TransitionHookOptionsMutableBuilder[Self <: TransitionHookOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: js.Any): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setCurrent(value: () => Transition): Self = StObject.set(x, "current", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setHookType(value: String): Self = StObject.set(x, "hookType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookTypeUndefined: Self = StObject.set(x, "hookType", js.undefined)
      
      @scala.inline
      def setStateHook(value: Boolean): Self = StObject.set(x, "stateHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateHookUndefined: Self = StObject.set(x, "stateHook", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTraceData(value: js.Any): Self = StObject.set(x, "traceData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceDataUndefined: Self = StObject.set(x, "traceData", js.undefined)
      
      @scala.inline
      def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  @js.native
  trait TransitionOptions extends StObject {
    
    /** @internal */
    var current: js.UndefOr[js.Function0[Transition]] = js.native
    
    /**
      * You can define your own Transition Options inside this property and use them, e.g., from a Transition Hook
      */
    var custom: js.UndefOr[js.Any] = js.native
    
    /**
      * This option sets whether or not the transition's parameter values should be inherited from
      * the current parameter values.
      *
      * - If `true`, it will inherit parameter values from the current parameter values.
      * - If `false`, only the parameters which are provided to `transitionTo` will be used.
      *
      * @default `false`
      */
    var inherit: js.UndefOr[Boolean] = js.native
    
    /**
      * This option changes how the Transition interacts with the browser's location bar (URL).
      *
      * - If `true`, it will update the url in the location bar.
      * - If `false`, it will not update the url in the location bar.
      * - If it is the string `"replace"`, it will update the url and also replace the last history record.
      *
      * @default `true`
      */
    var location: js.UndefOr[Boolean | replace] = js.native
    
    /**
      * @deprecated
      */
    @JSName("notify")
    var notify_FTransitionOptions: js.UndefOr[Boolean] = js.native
    
    /** @internal
      * If this transition is a redirect, this property should be the original Transition (which was redirected to this one)
      */
    var redirectedFrom: js.UndefOr[Transition] = js.native
    
    /**
      * When transitioning to relative path (e.g '`^`'), this option defines which state to be relative from.
      * @default `$state.current`
      */
    var relative: js.UndefOr[String | StateDeclaration | StateObject] = js.native
    
    /**
      * This option may be used to force states which are currently active to reload.
      *
      * During a normal transition, a state is "retained" if:
      * - It was previously active
      * - The state's parameter values have not changed
      * - All the parent states' parameter values have not changed
      *
      * Forcing a reload of a state will cause it to be exited and entered, which will:
      * - Refetch that state's resolve data
      * - Exit the state (onExit hook)
      * - Re-enter the state (onEnter hook)
      * - Re-render the views (controllers and templates)
      *
      * - When `true`, the destination state (and all parent states) will be reloaded.
      * - When it is a string and is the name of a state, or when it is a State object,
      *   that state and any children states will be reloaded.
      *
      * @default `false`
      */
    var reload: js.UndefOr[Boolean | String | StateDeclaration | StateObject] = js.native
    
    /** @internal */
    var reloadState: js.UndefOr[StateObject] = js.native
    
    /** @internal */
    var source: js.UndefOr[sref | url | redirect | otherwise | unknown] = js.native
    
    /**
      * This option may be used to cancel the active transition (if one is active) in favour of the this one.
      * This is the default behaviour or ui-router.
      *
      *
      * - When `true`, the active transition will be canceled and new transition will begin.
      * - when `false`, the transition will be canceled if a transition is already running. This can be useful in cases where
      * you only want to navigate to a different state if you are not already navigating somewhere.
      *
      * @default `true`
      */
    var supercede: js.UndefOr[Boolean] = js.native
  }
  object TransitionOptions {
    
    @scala.inline
    def apply(): TransitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionOptions]
    }
    
    @scala.inline
    implicit class TransitionOptionsMutableBuilder[Self <: TransitionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: () => Transition): Self = StObject.set(x, "current", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
      
      @scala.inline
      def setLocation(value: Boolean | replace): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
      
      @scala.inline
      def setRedirectedFrom(value: Transition): Self = StObject.set(x, "redirectedFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectedFromUndefined: Self = StObject.set(x, "redirectedFrom", js.undefined)
      
      @scala.inline
      def setRelative(value: String | StateDeclaration | StateObject): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setReload(value: Boolean | String | StateDeclaration | StateObject): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadState(value: StateObject): Self = StObject.set(x, "reloadState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadStateUndefined: Self = StObject.set(x, "reloadState", js.undefined)
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      @scala.inline
      def setSource(value: sref | url | redirect | otherwise | unknown): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSupercede(value: Boolean): Self = StObject.set(x, "supercede", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupercedeUndefined: Self = StObject.set(x, "supercede", js.undefined)
    }
  }
  
  type TransitionStateHookFn = js.Function2[/* transition */ Transition, /* state */ StateDeclaration, HookResult]
  
  @js.native
  trait TreeChanges
    extends /** @nodoc */
  /* key */ StringDictionary[js.UndefOr[js.Array[PathNode]]] {
    
    /**
      * The path of nodes that the transition is entering.
      *
      * After the Transition is successful, these nodes will be active.
      * Because they are entering, they have their resolves fetched, `onEnter` hooks run, and their views
      * (component(s) or controller(s)+template(s)) refreshed.
      *
      * Note that a state that is reloaded (due to parameter values changing, or `reload: true`) may be in both the
      * `exiting` and `entering` paths.
      */
    var entering: js.Array[PathNode] = js.native
    
    /**
      * The path of previously active nodes that the transition is exiting.
      *
      * After the Transition is successful, these nodes are no longer active.
      *
      * Note that a state that is being reloaded (due to parameter values changing, or `reload: true`) may be in both the
      * `exiting` and `entering` paths.
      */
    var exiting: js.Array[PathNode] = js.native
    
    /** The path of nodes in the state tree that the transition is coming *from* */
    var from: js.Array[PathNode] = js.native
    
    /**
      * The path of active nodes that the transition is retaining.
      *
      * These nodes are neither exited, nor entered.
      * Before and after the transition is successful, these nodes are active.
      */
    var retained: js.Array[PathNode] = js.native
    
    /**
      * The path of active nodes that the transition is retaining with updated "to params" applied.
      *
      * These nodes are neither exited, nor entered.
      * Before and after the transition is successful, these nodes are active.
      *
      * This is a shallow copy of [[retained]], but with new (dynamic) parameter values from [[to]] applied.
      */
    var retainedWithToParams: js.Array[PathNode] = js.native
    
    /** The path of nodes in the state tree that the transition is going *to* */
    var to: js.Array[PathNode] = js.native
  }
  object TreeChanges {
    
    @scala.inline
    def apply(
      entering: js.Array[PathNode],
      exiting: js.Array[PathNode],
      from: js.Array[PathNode],
      retained: js.Array[PathNode],
      retainedWithToParams: js.Array[PathNode],
      to: js.Array[PathNode]
    ): TreeChanges = {
      val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], retainedWithToParams = retainedWithToParams.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeChanges]
    }
    
    @scala.inline
    implicit class TreeChangesMutableBuilder[Self <: TreeChanges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntering(value: js.Array[PathNode]): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnteringVarargs(value: PathNode*): Self = StObject.set(x, "entering", js.Array(value :_*))
      
      @scala.inline
      def setExiting(value: js.Array[PathNode]): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitingVarargs(value: PathNode*): Self = StObject.set(x, "exiting", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: js.Array[PathNode]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromVarargs(value: PathNode*): Self = StObject.set(x, "from", js.Array(value :_*))
      
      @scala.inline
      def setRetained(value: js.Array[PathNode]): Self = StObject.set(x, "retained", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainedVarargs(value: PathNode*): Self = StObject.set(x, "retained", js.Array(value :_*))
      
      @scala.inline
      def setRetainedWithToParams(value: js.Array[PathNode]): Self = StObject.set(x, "retainedWithToParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainedWithToParamsVarargs(value: PathNode*): Self = StObject.set(x, "retainedWithToParams", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: js.Array[PathNode]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToVarargs(value: PathNode*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
}
