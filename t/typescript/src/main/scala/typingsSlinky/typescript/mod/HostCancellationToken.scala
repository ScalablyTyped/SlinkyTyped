package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostCancellationToken extends js.Object {
  def isCancellationRequested(): Boolean = js.native
}

object HostCancellationToken {
  @scala.inline
  def apply(isCancellationRequested: () => Boolean): HostCancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested))
    __obj.asInstanceOf[HostCancellationToken]
  }
  @scala.inline
  implicit class HostCancellationTokenOps[Self <: HostCancellationToken] (val x: Self) extends AnyVal {
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
  }
  
}

