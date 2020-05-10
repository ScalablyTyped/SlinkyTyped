package typingsSlinky.workerpool.mod

import typingsSlinky.node.childProcessMod.ForkOptions
import typingsSlinky.workerpool.workerpoolStrings.auto
import typingsSlinky.workerpool.workerpoolStrings.max
import typingsSlinky.workerpool.workerpoolStrings.process
import typingsSlinky.workerpool.workerpoolStrings.thread
import typingsSlinky.workerpool.workerpoolStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerPoolOptions extends js.Object {
  /** 2nd argument to pass to childProcess.fork() */
  var forkArgs: js.UndefOr[js.Array[String]] = js.native
  var forkOpts: js.UndefOr[ForkOptions] = js.native
  /**
    * The default number of maxWorkers is the number of CPU's minus one.
    * When the number of CPU's could not be determined (for example in older browsers), maxWorkers is set to 3.
    */
  var maxWorkers: js.UndefOr[Double] = js.native
  /**
    * The minimum number of workers that must be initialized and kept available.
    * Setting this to 'max' will create maxWorkers default workers.
    */
  var minWorkers: js.UndefOr[Double | max] = js.native
  /**
    * In case of 'process' (default), child_process will be used.
    * In case of 'thread', worker_threads will be used. If worker_threads are not available, an error is thrown.
    * In case of 'auto', worker_threads will be used if available (Node.js >= 11.7.0), else child_process will be used as fallback.
    * @deprecated
    */
  var nodeWorker: js.UndefOr[process | thread | auto] = js.native
  /**
    * - In case of `'auto'` (default), workerpool will automatically pick a suitable type of worker:
    *   when in a browser environment, `'web'` will be used. When in a node.js environment, `worker_threads` will be used
    *   if available (Node.js >= 11.7.0), else `child_process` will be used.
    * - In case of `'web'`, a Web Worker will be used. Only available in a browser environment.
    * - In case of `'process'`, `child_process` will be used. Only available in a node.js environment.
    * - In case of `'thread'`, `worker_threads` will be used. If `worker_threads` are not available, an error is thrown.
    *   Only available in a node.js environment.
    */
  var workerType: js.UndefOr[auto | web | process | thread] = js.native
}

object WorkerPoolOptions {
  @scala.inline
  def apply(): WorkerPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerPoolOptions]
  }
  @scala.inline
  implicit class WorkerPoolOptionsOps[Self <: WorkerPoolOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForkArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForkArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withForkOpts(value: ForkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForkOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forkOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWorkers(value: Double | max): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeWorker(value: process | thread | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerType(value: auto | web | process | thread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerType")(js.undefined)
        ret
    }
  }
  
}

