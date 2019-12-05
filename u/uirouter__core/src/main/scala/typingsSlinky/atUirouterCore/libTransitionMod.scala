package typingsSlinky.atUirouterCore

import typingsSlinky.atUirouterCore.libPathPathNodeMod.PathNode
import typingsSlinky.atUirouterCore.libRouterMod.UIRouter
import typingsSlinky.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typingsSlinky.atUirouterCore.libStateStateObjectMod.StateObject
import typingsSlinky.atUirouterCore.libStateTargetStateMod.TargetState
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.HookFn
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.HookMatchCriterion
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.HookRegOptions
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.HookResult
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.IHookRegistry
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.PathType
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookOptions
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase
import typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionOptions
import typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.ErrorHandler
import typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.GetResultHandler
import typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.ResultHandler
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition", JSImport.Namespace)
@js.native
object libTransitionMod extends js.Object {
  @js.native
  class HookBuilder protected ()
    extends typingsSlinky.atUirouterCore.libTransitionHookBuilderMod.HookBuilder {
    def this(transition: typingsSlinky.atUirouterCore.libTransitionTransitionMod.Transition) = this()
  }
  
  @js.native
  class RegisteredHook protected ()
    extends typingsSlinky.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook {
    def this(
      tranSvc: typingsSlinky.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
      eventType: typingsSlinky.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[
            /* hook */ typingsSlinky.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
            Unit
          ]
    ) = this()
    def this(
      tranSvc: typingsSlinky.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
      eventType: typingsSlinky.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[
            /* hook */ typingsSlinky.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
            Unit
          ],
      options: HookRegOptions
    ) = this()
  }
  
  @js.native
  class Rejection protected ()
    extends typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: String, detail: js.Any) = this()
  }
  
  @js.native
  class Transition protected ()
    extends typingsSlinky.atUirouterCore.libTransitionTransitionMod.Transition {
    /**
      * Creates a new Transition object.
      *
      * If the target state is not valid, an error is thrown.
      *
      * @internalapi
      *
      * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
      *        encapsulates the "from state".
      * @param targetState The target state and parameters being transitioned to (also, the transition options)
      * @param router The [[UIRouter]] instance
      */
    def this(fromPath: js.Array[PathNode], targetState: TargetState, router: UIRouter) = this()
  }
  
  @js.native
  class TransitionEventType protected ()
    extends typingsSlinky.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType {
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
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
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
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
  }
  
  @js.native
  class TransitionHook protected ()
    extends typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook {
    def this(
      transition: typingsSlinky.atUirouterCore.libTransitionTransitionMod.Transition,
      stateContext: StateDeclaration,
      registeredHook: typingsSlinky.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook,
      options: TransitionHookOptions
    ) = this()
  }
  
  @js.native
  class TransitionService protected ()
    extends typingsSlinky.atUirouterCore.libTransitionTransitionServiceMod.TransitionService {
    /** @hidden */
    def this(_router: UIRouter) = this()
  }
  
  var defaultTransOpts: TransitionOptions = js.native
  def makeEvent(
    registry: IHookRegistry,
    transitionService: typingsSlinky.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typingsSlinky.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  def matchState(
    state: StateObject,
    criterion: HookMatchCriterion,
    transition: typingsSlinky.atUirouterCore.libTransitionTransitionMod.Transition
  ): Boolean = js.native
  @js.native
  object RejectType extends js.Object {
    /* 3 */ val ABORTED: typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.RejectType.ABORTED with Double = js.native
    /* 6 */ val ERROR: typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.RejectType.ERROR with Double = js.native
    /* 5 */ val IGNORED: typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.RejectType.IGNORED with Double = js.native
    /* 4 */ val INVALID: typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.RejectType.INVALID with Double = js.native
    /* 2 */ val SUPERSEDED: typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.RejectType.SUPERSEDED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.RejectType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Rejection extends js.Object {
    /** Returns a Rejection due to aborted transition */
    def aborted(): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def aborted(detail: js.Any): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to aborted transition */
    def errored(): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def errored(detail: js.Any): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to ignored transition */
    def ignored(): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def ignored(detail: js.Any): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to invalid transition */
    def invalid(): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def invalid(detail: js.Any): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
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
    def normalize(): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: js.Any): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: Error): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to redirected transition */
    def redirected(): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def redirected(detail: js.Any): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to transition superseded */
    def superseded(): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any, options: js.Any): typingsSlinky.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    /** @hidden */
    var diToken: TypeofClassTransition = js.native
  }
  
  /* static members */
  @js.native
  object TransitionHook extends js.Object {
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
    @JSName("LOG_ERROR")
    var LOG_ERROR_Original: GetErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSName("LOG_REJECTED_RESULT")
    var LOG_REJECTED_RESULT_Original: GetResultHandler = js.native
    @JSName("REJECT_ERROR")
    var REJECT_ERROR_Original: GetErrorHandler = js.native
    @JSName("THROW_ERROR")
    var THROW_ERROR_Original: GetErrorHandler = js.native
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def HANDLE_RESULT(hook: typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def LOG_ERROR(hook: typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    def LOG_REJECTED_RESULT(hook: typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ResultHandler = js.native
    def REJECT_ERROR(hook: typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
    def THROW_ERROR(hook: typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
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
    def chain(hooks: js.Array[typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook]): js.Promise[_] = js.native
    def chain(
      hooks: js.Array[typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook],
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
      hooks: js.Array[typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[_] | T = js.native
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    def runAllHooks(hooks: js.Array[typingsSlinky.atUirouterCore.libTransitionTransitionHookMod.TransitionHook]): Unit = js.native
  }
  
  @js.native
  object TransitionHookPhase extends js.Object {
    /* 1 */ val BEFORE: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.BEFORE with Double = js.native
    /* 0 */ val CREATE: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.CREATE with Double = js.native
    /* 4 */ val ERROR: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.ERROR with Double = js.native
    /* 2 */ val RUN: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.RUN with Double = js.native
    /* 3 */ val SUCCESS: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.SUCCESS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase with Double
      ] = js.native
  }
  
  @js.native
  object TransitionHookScope extends js.Object {
    /* 1 */ val STATE: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope.STATE with Double = js.native
    /* 0 */ val TRANSITION: typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope.TRANSITION with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope with Double
      ] = js.native
  }
  
}

