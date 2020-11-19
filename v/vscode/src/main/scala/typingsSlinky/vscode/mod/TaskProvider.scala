package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskProvider[T /* <: Task */] extends js.Object {
  
  /**
    * Provides tasks.
    * @param token A cancellation token.
    * @return an array of tasks
    */
  def provideTasks(): ProviderResult[js.Array[T]] = js.native
  def provideTasks(token: CancellationToken): ProviderResult[js.Array[T]] = js.native
  
  /**
    * Resolves a task that has no [`execution`](#Task.execution) set. Tasks are
    * often created from information found in the `tasks.json`-file. Such tasks miss
    * the information on how to execute them and a task provider must fill in
    * the missing information in the `resolveTask`-method. This method will not be
    * called for tasks returned from the above `provideTasks` method since those
    * tasks are always fully resolved. A valid default implementation for the
    * `resolveTask` method is to return `undefined`.
    *
    * @param task The task to resolve.
    * @param token A cancellation token.
    * @return The resolved task
    */
  def resolveTask(task: T): ProviderResult[T] = js.native
  def resolveTask(task: T, token: CancellationToken): ProviderResult[T] = js.native
}
