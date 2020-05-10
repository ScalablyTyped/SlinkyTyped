package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress[T] extends js.Object {
  /**
  		 * Report a progress update.
  		 * @param value A progress item, like a message and/or an
  		 * report on how much work finished
  		 */
  def report(value: T): Unit = js.native
}

object Progress {
  @scala.inline
  def apply[T](report: T => Unit): Progress[T] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[Progress[T]]
  }
  @scala.inline
  implicit class ProgressOps[Self[t] <: Progress[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withReport(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

