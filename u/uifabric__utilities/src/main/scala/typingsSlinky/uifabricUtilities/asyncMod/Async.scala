package typingsSlinky.uifabricUtilities.asyncMod

import org.scalajs.dom.raw.Element
import typingsSlinky.uifabricUtilities.anon.Leading
import typingsSlinky.uifabricUtilities.anon.MaxWait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/Async", "Async")
@js.native
class Async () extends js.Object {
  def this(parent: js.Object) = this()
  def this(parent: js.UndefOr[scala.Nothing], onError: js.Function1[/* e */ js.Any, Unit]) = this()
  def this(parent: js.Object, onError: js.Function1[/* e */ js.Any, Unit]) = this()
  
  var _animationFrameIds: js.Any = js.native
  
  var _immediateIds: js.Any = js.native
  
  var _intervalIds: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /* protected */ def _logError(e: js.Any): Unit = js.native
  
  var _noop: js.Any = js.native
  
  var _onErrorHandler: js.Any = js.native
  
  var _parent: js.Any = js.native
  
  var _timeoutIds: js.Any = js.native
  
  def cancelAnimationFrame(id: Double): Unit = js.native
  def cancelAnimationFrame(id: Double, targetElement: Element): Unit = js.native
  
  /**
    * Clears the immediate.
    * @param id - Id to cancel.
    * @param targetElement - Optional target element to use for identifying the correct window.
    */
  def clearImmediate(id: Double): Unit = js.native
  def clearImmediate(id: Double, targetElement: Element): Unit = js.native
  
  /**
    * Clears the interval.
    * @param id - Id to cancel.
    */
  def clearInterval(id: Double): Unit = js.native
  
  /**
    * Clears the timeout.
    * @param id - Id to cancel.
    */
  def clearTimeout(id: Double): Unit = js.native
  
  /**
    * Creates a function that will delay the execution of func until after wait milliseconds have
    * elapsed since the last time it was invoked. Provide an options object to indicate that func
    * should be invoked on the leading and/or trailing edge of the wait timeout. Subsequent calls
    * to the debounced function will return the result of the last func call.
    *
    * Note: If leading and trailing options are true func will be called on the trailing edge of
    * the timeout only if the debounced function is invoked more than once during the wait
    * timeout.
    *
    * @param func - The function to debounce.
    * @param wait - The number of milliseconds to delay.
    * @param options - The options object.
    * @returns The new debounced function.
    */
  def debounce[T /* <: js.Function */](func: T): ICancelable[T] with js.Function0[Unit] = js.native
  def debounce[T /* <: js.Function */](func: T, wait: js.UndefOr[scala.Nothing], options: MaxWait): ICancelable[T] with js.Function0[Unit] = js.native
  def debounce[T /* <: js.Function */](func: T, wait: Double): ICancelable[T] with js.Function0[Unit] = js.native
  def debounce[T /* <: js.Function */](func: T, wait: Double, options: MaxWait): ICancelable[T] with js.Function0[Unit] = js.native
  
  /**
    * Dispose function, clears all async operations.
    */
  def dispose(): Unit = js.native
  
  def requestAnimationFrame(callback: js.Function0[Unit]): Double = js.native
  def requestAnimationFrame(callback: js.Function0[Unit], targetElement: Element): Double = js.native
  
  /**
    * SetImmediate override, which will auto cancel the immediate during dispose.
    * @param callback - Callback to execute.
    * @param targetElement - Optional target element to use for identifying the correct window.
    * @returns The setTimeout id.
    */
  def setImmediate(callback: js.Function0[Unit]): Double = js.native
  def setImmediate(callback: js.Function0[Unit], targetElement: Element): Double = js.native
  
  /**
    * SetInterval override, which will auto cancel the timeout during dispose.
    * @param callback - Callback to execute.
    * @param duration - Duration in milliseconds.
    * @returns The setTimeout id.
    */
  def setInterval(callback: js.Function0[Unit], duration: Double): Double = js.native
  
  /**
    * SetTimeout override, which will auto cancel the timeout during dispose.
    * @param callback - Callback to execute.
    * @param duration - Duration in milliseconds.
    * @returns The setTimeout id.
    */
  def setTimeout(callback: js.Function0[Unit], duration: Double): Double = js.native
  
  /**
    * Creates a function that, when executed, will only call the func function at most once per
    * every wait milliseconds. Provide an options object to indicate that func should be invoked
    * on the leading and/or trailing edge of the wait timeout. Subsequent calls to the throttled
    * function will return the result of the last func call.
    *
    * Note: If leading and trailing options are true func will be called on the trailing edge of
    * the timeout only if the throttled function is invoked more than once during the wait timeout.
    *
    * @param func - The function to throttle.
    * @param wait - The number of milliseconds to throttle executions to. Defaults to 0.
    * @param options - The options object.
    * @returns The new throttled function.
    */
  def throttle[T /* <: js.Function */](func: T): T | js.Function0[Unit] = js.native
  def throttle[T /* <: js.Function */](func: T, wait: js.UndefOr[scala.Nothing], options: Leading): T | js.Function0[Unit] = js.native
  def throttle[T /* <: js.Function */](func: T, wait: Double): T | js.Function0[Unit] = js.native
  def throttle[T /* <: js.Function */](func: T, wait: Double, options: Leading): T | js.Function0[Unit] = js.native
}
