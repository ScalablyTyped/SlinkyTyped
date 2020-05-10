package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
@js.native
trait LogQueryResponseResultDocuments extends js.Object {
  /** The number of results returned in the query associate with this log. */
  var count: js.UndefOr[Double] = js.native
  /** Array of log query response results. */
  var results: js.UndefOr[js.Array[LogQueryResponseResultDocumentsResult]] = js.native
}

object LogQueryResponseResultDocuments {
  @scala.inline
  def apply(): LogQueryResponseResultDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResultDocuments]
  }
  @scala.inline
  implicit class LogQueryResponseResultDocumentsOps[Self <: LogQueryResponseResultDocuments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[LogQueryResponseResultDocumentsResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

