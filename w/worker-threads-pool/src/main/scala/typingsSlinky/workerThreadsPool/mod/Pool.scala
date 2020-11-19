package typingsSlinky.workerThreadsPool.mod

import typingsSlinky.node.workerThreadsMod.Worker
import typingsSlinky.node.workerThreadsMod.WorkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool extends js.Object {
  
  /**
    * @param filename argument passed directly to `new Worker(filename, options)`
    * @param options argument passed directly to `new Worker(filename, options)`
    * @param callback will be called once the worker is created
    */
  def acquire(filename: String, callback: js.Function2[/* error */ js.Error | Null, /* worker */ Worker, Unit]): Unit = js.native
  def acquire(
    filename: String,
    options: WorkerOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* worker */ Worker, Unit]
  ): Unit = js.native
  
  /**
    * Calls `worker.terminate()` on all workers in the pool.
    * @param callback will be called once all workers have terminated
    */
  def destroy(): Unit = js.native
  def destroy(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Number of active workers in the pool.
    */
  var size: Double = js.native
}
