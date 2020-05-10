package typingsSlinky.zoneJs

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UncaughtPromiseError extends Error {
  var promise: js.Promise[_] = js.native
  var rejection: js.Any = js.native
  var task: Task = js.native
  var zone: Zone = js.native
}

object UncaughtPromiseError {
  @scala.inline
  def apply(message: String, name: String, promise: js.Promise[_], rejection: js.Any, task: Task, zone: Zone): UncaughtPromiseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], rejection = rejection.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncaughtPromiseError]
  }
  @scala.inline
  implicit class UncaughtPromiseErrorOps[Self <: UncaughtPromiseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: Task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZone(value: Zone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

