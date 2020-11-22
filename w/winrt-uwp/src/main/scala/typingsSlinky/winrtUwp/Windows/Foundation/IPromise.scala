package typingsSlinky.winrtUwp.Windows.Foundation

import typingsSlinky.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromise[TResult] extends PromiseLike[TResult] {
  
  def cancel(): Unit = js.native
  
  def done[U](): Unit = js.native
  def done[U](
    success: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](success: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def done[U](
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](success: js.Function1[/* value */ TResult, _]): Unit = js.native
  def done[U](
    success: js.Function1[/* value */ TResult, _],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](success: js.Function1[/* value */ TResult, _], error: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def done[U](
    success: js.Function1[/* value */ TResult, _],
    error: js.Function1[/* error */ js.Any, _],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  
  def `then`[U](
    success: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ TResult, IPromise[U] | U],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ TResult, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
}
