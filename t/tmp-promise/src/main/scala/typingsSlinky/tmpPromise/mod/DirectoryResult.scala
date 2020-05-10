package typingsSlinky.tmpPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryResult extends js.Object {
  var path: String = js.native
  def cleanup(): Unit = js.native
}

object DirectoryResult {
  @scala.inline
  def apply(cleanup: () => Unit, path: String): DirectoryResult = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryResult]
  }
  @scala.inline
  implicit class DirectoryResultOps[Self <: DirectoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

