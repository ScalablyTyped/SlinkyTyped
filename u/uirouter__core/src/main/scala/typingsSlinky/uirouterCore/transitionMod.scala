package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.anon.TypeofTransition
import typingsSlinky.uirouterCore.pathNodeMod.PathNode
import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.targetStateMod.TargetState
import typingsSlinky.uirouterCore.transitionHookMod.ErrorHandler
import typingsSlinky.uirouterCore.transitionHookMod.GetErrorHandler
import typingsSlinky.uirouterCore.transitionHookMod.GetResultHandler
import typingsSlinky.uirouterCore.transitionHookMod.ResultHandler
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookFn
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookMatchCriterion
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookRegOptions
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookResult
import typingsSlinky.uirouterCore.transitionInterfaceMod.IHookRegistry
import typingsSlinky.uirouterCore.transitionInterfaceMod.PathType
import typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookOptions
import typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  
  var defaultTransOpts: TransitionOptions = js.native
  
  def makeEvent(
    registry: IHookRegistry,
    transitionService: typingsSlinky.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  
  def matchState(
    state: StateObject,
    criterion: HookMatchCriterion,
    transition: typingsSlinky.uirouterCore.transitionTransitionMod.Transition
  ): Boolean = js.native
  
  @js.native
  class HookBuilder protected ()
    extends typingsSlinky.uirouterCore.hookBuilderMod.HookBuilder {
    def this(transition: typingsSlinky.uirouterCore.transitionTransitionMod.Transition) = this()
  }
  
  @js.native
  class RegisteredHook protected ()
    extends typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook {
    def this(
      tranSvc: typingsSlinky.uirouterCore.transitionServiceMod.TransitionService,
      eventType: typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook, Unit]
    ) = this()
    def this(
      tranSvc: typingsSlinky.uirouterCore.transitionServiceMod.TransitionService,
      eventType: typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook, Unit],
      options: HookRegOptions
    ) = this()
  }
  
  @js.native
  object RejectType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uirouterCore.rejectFactoryMod.RejectType with Double] = js.native
    
    /* 3 */ val ABORTED: typingsSlinky.uirouterCore.rejectFactoryMod.RejectType.ABORTED with Double = js.native
    
    /* 6 */ val ERROR: typingsSlinky.uirouterCore.rejectFactoryMod.RejectType.ERROR with Double = js.native
    
    /* 5 */ val IGNORED: typingsSlinky.uirouterCore.rejectFactoryMod.RejectType.IGNORED with Double = js.native
    
    /* 4 */ val INVALID: typingsSlinky.uirouterCore.rejectFactoryMod.RejectType.INVALID with Double = js.native
    
    /* 2 */ val SUPERSEDED: typingsSlinky.uirouterCore.rejectFactoryMod.RejectType.SUPERSEDED with Double = js.native
  }
  
  @js.native
  class Rejection protected ()
    extends typingsSlinky.uirouterCore.rejectFactoryMod.Rejection {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: js.UndefOr[scala.Nothing], detail: js.Any) = this()
    def this(`type`: Double, message: String, detail: js.Any) = this()
  }
  /* static members */
  @js.native
  object Rejection extends js.Object {
    
    /** Returns a Rejection due to aborted transition */
    def aborted(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def aborted(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    
    /** Returns a Rejection due to aborted transition */
    def errored(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def errored(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    
    /** Returns a Rejection due to ignored transition */
    def ignored(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def ignored(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    
    /** Returns a Rejection due to invalid transition */
    def invalid(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def invalid(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    def isRejectionPromise(obj: js.Any): Boolean = js.native
    
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    def normalize(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def normalize(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def normalize(detail: js.Error): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def normalize(detail: typingsSlinky.uirouterCore.rejectFactoryMod.Rejection): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    
    /** Returns a Rejection due to redirected transition */
    def redirected(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def redirected(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    
    /** Returns a Rejection due to transition superseded */
    def superseded(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def superseded(detail: js.UndefOr[scala.Nothing], options: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any, options: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  }
  
  @js.native
  class Transition protected ()
    extends typingsSlinky.uirouterCore.transitionTransitionMod.Transition {
    /**
      * Creates a new Transition object.
      *
      * If the target state is not valid, an error is thrown.
      *
      * @internal
      *
      * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
      *        encapsulates the "from state".
      * @param targetState The target state and parameters being transitioned to (also, the transition options)
      * @param router The [[UIRouter]] instance
      * @internal
      */
    def this(fromPath: js.Array[PathNode], targetState: TargetState, router: UIRouter) = this()
  }
  /* static members */
  @js.native
  object Transition extends js.Object {
    
    /** @internal */
    var diToken: TypeofTransition = js.native
  }
  
  @js.native
  class TransitionEventType protected ()
    extends typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType {
    def this(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: GetResultHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: js.UndefOr[scala.Nothing],
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: GetResultHandler,
      getErrorHandler: js.UndefOr[scala.Nothing],
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: js.UndefOr[scala.Nothing],
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: js.UndefOr[scala.Nothing],
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: js.UndefOr[scala.Nothing],
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: js.UndefOr[scala.Nothing],
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
  }
  
  @js.native
  class TransitionHook protected ()
    extends typingsSlinky.uirouterCore.transitionHookMod.TransitionHook {
    def this(
      transition: typingsSlinky.uirouterCore.transitionTransitionMod.Transition,
      stateContext: StateDeclaration,
      registeredHook: typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook,
      options: TransitionHookOptions
    ) = this()
  }
  /* static members */
  @js.native
  object TransitionHook extends js.Object {
    
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def HANDLE_RESULT(hook: typingsSlinky.uirouterCore.transitionHookMod.TransitionHook): ResultHandler = js.native
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("HANDLE_RESULT")
    var HANDLE_RESULT_Original: GetResultHandler = js.native
    
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def LOG_ERROR(hook: typingsSlinky.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("LOG_ERROR")
    var LOG_ERROR_Original: GetErrorHandler = js.native
    
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    def LOG_REJECTED_RESULT(hook: typingsSlinky.uirouterCore.transitionHookMod.TransitionHook): ResultHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSName("LOG_REJECTED_RESULT")
    var LOG_REJECTED_RESULT_Original: GetResultHandler = js.native
    
    def REJECT_ERROR(hook: typingsSlinky.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = js.native
    @JSName("REJECT_ERROR")
    var REJECT_ERROR_Original: GetErrorHandler = js.native
    
    def THROW_ERROR(hook: typingsSlinky.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = js.native
    @JSName("THROW_ERROR")
    var THROW_ERROR_Original: GetErrorHandler = js.native
    
    /**
      * Chains together an array of TransitionHooks.
      *
      * Given a list of [[TransitionHook]] objects, chains them together.
      * Each hook is invoked after the previous one completes.
      *
      * #### Example:
      * ```js
      * var hooks: TransitionHook[] = getHooks();
      * let promise: Promise<any> = TransitionHook.chain(hooks);
      *
      * promise.then(handleSuccess, handleError);
      * ```
      *
      * @param hooks the list of hooks to chain together
      * @param waitFor if provided, the chain is `.then()`'ed off this promise
      * @returns a `Promise` for sequentially invoking the hooks (in order)
      */
    def chain(hooks: js.Array[typingsSlinky.uirouterCore.transitionHookMod.TransitionHook]): js.Promise[_] = js.native
    def chain(
      hooks: js.Array[typingsSlinky.uirouterCore.transitionHookMod.TransitionHook],
      waitFor: js.Promise[_]
    ): js.Promise[_] = js.native
    
    /**
      * Invokes all the provided TransitionHooks, in order.
      * Each hook's return value is checked.
      * If any hook returns a promise, then the rest of the hooks are chained off that promise, and the promise is returned.
      * If no hook returns a promise, then all hooks are processed synchronously.
      *
      * @param hooks the list of TransitionHooks to invoke
      * @param doneCallback a callback that is invoked after all the hooks have successfully completed
      *
      * @returns a promise for the async result, or the result of the callback
      */
    def invokeHooks[T](
      hooks: js.Array[typingsSlinky.uirouterCore.transitionHookMod.TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[_] | T = js.native
    
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    def runAllHooks(hooks: js.Array[typingsSlinky.uirouterCore.transitionHookMod.TransitionHook]): Unit = js.native
  }
  
  @js.native
  object TransitionHookPhase extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase with Double
      ] = js.native
    
    /* 1 */ val BEFORE: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.BEFORE with Double = js.native
    
    /* 0 */ val CREATE: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.CREATE with Double = js.native
    
    /* 4 */ val ERROR: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.ERROR with Double = js.native
    
    /* 2 */ val RUN: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.RUN with Double = js.native
    
    /* 3 */ val SUCCESS: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookPhase.SUCCESS with Double = js.native
  }
  
  @js.native
  object TransitionHookScope extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookScope with Double
      ] = js.native
    
    /* 1 */ val STATE: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookScope.STATE with Double = js.native
    
    /* 0 */ val TRANSITION: typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookScope.TRANSITION with Double = js.native
  }
  
  @js.native
  class TransitionService protected ()
    extends typingsSlinky.uirouterCore.transitionServiceMod.TransitionService {
    /** @internal */
    def this(_router: UIRouter) = this()
  }
}
