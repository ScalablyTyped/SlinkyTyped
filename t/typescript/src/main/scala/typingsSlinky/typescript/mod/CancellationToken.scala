package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellationToken extends js.Object {
  def isCancellationRequested(): Boolean = js.native
  /** @throws OperationCanceledException if isCancellationRequested is true */
  def throwIfCancellationRequested(): Unit = js.native
}

object CancellationToken {
  @scala.inline
  def apply(isCancellationRequested: () => Boolean, throwIfCancellationRequested: () => Unit): CancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested), throwIfCancellationRequested = js.Any.fromFunction0(throwIfCancellationRequested))
    __obj.asInstanceOf[CancellationToken]
  }
  @scala.inline
  implicit class CancellationTokenOps[Self <: CancellationToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCancellationRequested(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancellationRequested")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThrowIfCancellationRequested(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwIfCancellationRequested")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

