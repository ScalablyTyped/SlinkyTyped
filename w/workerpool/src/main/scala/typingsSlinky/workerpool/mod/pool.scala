package typingsSlinky.workerpool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workerpool", "pool")
@js.native
object pool extends js.Object {
  
  def apply(): WorkerPool = js.native
  def apply(options: WorkerPoolOptions): WorkerPool = js.native
  def apply(pathToScript: js.UndefOr[scala.Nothing], options: WorkerPoolOptions): WorkerPool = js.native
  def apply(pathToScript: String): WorkerPool = js.native
  def apply(pathToScript: String, options: WorkerPoolOptions): WorkerPool = js.native
}
