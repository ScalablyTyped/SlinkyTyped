package typingsSlinky.xrm.Xrm.Async

import typingsSlinky.xrm.Xrm.ErrorResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for asynchronous promises. Based on JQuery Promise
  */
@js.native
trait PromiseLike[T] extends js.Object {
  
  /**
    * UNDOCUMENTED (Web Client only): Add handlers to be called when the Deferred object is either resolved or rejected.
    */
  def always[U](alwaysCallback: js.Function0[U | PromiseLike[U]]): PromiseLike[U] = js.native
  
  /**
    * UNDOCUMENTED (Unified Client only): Add handlers to be called when the Deferred object is rejected.
    */
  def `catch`[U](): PromiseLike[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* reason */ ErrorResponse, U | PromiseLike[U]]): PromiseLike[U] = js.native
  
  /**
    * UNDOCUMENTED (Web Client only) Add handlers to be called when the Deferred object is rejected.
    */
  def fail[U](): PromiseLike[U] = js.native
  def fail[U](onRejected: js.Function1[/* reason */ ErrorResponse, U | PromiseLike[U]]): PromiseLike[U] = js.native
  
  /**
    * UNDOCUMENTED (Unified Client only): Add handlers to be called when the Deferred object is either resolved or rejected.
    */
  def `finally`[U](finallyCallback: js.Function0[U | PromiseLike[U]]): PromiseLike[U] = js.native
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[U](): PromiseLike[U] = js.native
  def `then`[U](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* error */ js.Any, PromiseLike[U] | U | Unit]
  ): PromiseLike[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ T, U | PromiseLike[U]]): PromiseLike[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ T, PromiseLike[U] | U],
    onRejected: js.Function1[/* error */ js.Any, PromiseLike[U] | U | Unit]
  ): PromiseLike[U] = js.native
}
