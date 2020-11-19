package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook
import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.transitionEventTypeMod.TransitionEventType
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookResult
import typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookOptions
import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/transition/transitionHook", JSImport.Namespace)
@js.native
object transitionHookMod extends js.Object {
  
  @js.native
  class TransitionHook protected () extends js.Object {
    def this(
      transition: Transition,
      stateContext: StateDeclaration,
      registeredHook: RegisteredHook,
      options: TransitionHookOptions
    ) = this()
    
    /**
      * Return a Rejection promise if the transition is no longer current due
      * to a stopped router (disposed), or a new transition has started and superseded this one.
      */
    var getNotCurrentRejection: js.Any = js.native
    
    /**
      * This method handles the return value of a Transition Hook.
      *
      * A hook can return false (cancel), a TargetState (redirect),
      * or a promise (which may later resolve to false or a redirect)
      *
      * This also handles "transition superseded" -- when a new transition
      * was started while the hook was still running
      */
    def handleHookResult(result: HookResult): js.Promise[HookResult] = js.native
    
    def invokeHook(): js.Promise[HookResult] | Unit = js.native
    
    var isSuperseded: js.Any = js.native
    
    def logError(err: js.Any): js.Any = js.native
    
    var options: js.Any = js.native
    
    var registeredHook: js.Any = js.native
    
    var stateContext: js.Any = js.native
    
    var transition: js.Any = js.native
    
    var `type`: TransitionEventType = js.native
  }
  /* static members */
  @js.native
  object TransitionHook extends js.Object {
    
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def HANDLE_RESULT(hook: TransitionHook): ResultHandler = js.native
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
    def LOG_ERROR(hook: TransitionHook): ErrorHandler = js.native
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
    def LOG_REJECTED_RESULT(hook: TransitionHook): ResultHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSName("LOG_REJECTED_RESULT")
    var LOG_REJECTED_RESULT_Original: GetResultHandler = js.native
    
    def REJECT_ERROR(hook: TransitionHook): ErrorHandler = js.native
    @JSName("REJECT_ERROR")
    var REJECT_ERROR_Original: GetErrorHandler = js.native
    
    def THROW_ERROR(hook: TransitionHook): ErrorHandler = js.native
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
    def chain(hooks: js.Array[TransitionHook]): js.Promise[_] = js.native
    def chain(hooks: js.Array[TransitionHook], waitFor: js.Promise[_]): js.Promise[_] = js.native
    
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
      hooks: js.Array[TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[_] | T = js.native
    
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    def runAllHooks(hooks: js.Array[TransitionHook]): Unit = js.native
  }
  
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Promise[js.Any]]
  
  type GetErrorHandler = js.Function1[/* hook */ TransitionHook, ErrorHandler]
  
  type GetResultHandler = js.Function1[/* hook */ TransitionHook, ResultHandler]
  
  type ResultHandler = js.Function1[/* result */ HookResult, js.Promise[HookResult]]
}
