package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** LogCollection. */
@js.native
trait LogCollection extends js.Object {
  /** An array of objects describing log events. */
  var logs: js.Array[Log] = js.native
  /** The pagination data for the returned objects. */
  var pagination: LogPagination = js.native
}

object LogCollection {
  @scala.inline
  def apply(logs: js.Array[Log], pagination: LogPagination): LogCollection = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogCollection]
  }
  @scala.inline
  implicit class LogCollectionOps[Self <: LogCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogs(value: js.Array[Log]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: LogPagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

