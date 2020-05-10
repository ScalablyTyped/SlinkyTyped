package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The pagination data for the returned objects. */
@js.native
trait LogPagination extends js.Object {
  /** Reserved for future use. */
  var matched: js.UndefOr[Double] = js.native
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.native
  /** The URL that will return the next page of results, if any. */
  var next_url: js.UndefOr[String] = js.native
}

object LogPagination {
  @scala.inline
  def apply(): LogPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPagination]
  }
  @scala.inline
  implicit class LogPaginationOps[Self <: LogPagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatched(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_cursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_url")(js.undefined)
        ret
    }
  }
  
}

