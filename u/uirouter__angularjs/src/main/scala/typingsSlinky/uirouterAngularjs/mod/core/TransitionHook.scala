package typingsSlinky.uirouterAngularjs.mod.core

import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.transitionHookMod.ErrorHandler
import typingsSlinky.uirouterCore.transitionHookMod.GetErrorHandler
import typingsSlinky.uirouterCore.transitionHookMod.GetResultHandler
import typingsSlinky.uirouterCore.transitionHookMod.ResultHandler
import typingsSlinky.uirouterCore.transitionInterfaceMod.HookResult
import typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.TransitionHook")
@js.native
class TransitionHook protected ()
  extends typingsSlinky.uirouterCore.mod.TransitionHook {
  def this(
    transition: typingsSlinky.uirouterCore.transitionTransitionMod.Transition,
    stateContext: StateDeclaration,
    registeredHook: typingsSlinky.uirouterCore.hookRegistryMod.RegisteredHook,
    options: TransitionHookOptions
  ) = this()
}
/* static members */
@JSImport("@uirouter/angularjs", "core.TransitionHook")
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
