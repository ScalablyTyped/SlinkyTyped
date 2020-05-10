package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Pagination details, if required by the length of the output. */
@js.native
trait Pagination extends js.Object {
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.native
  /** The URL that returns the next page of results. */
  var next_url: js.UndefOr[String] = js.native
  /** A token identifying the current page of results. */
  var refresh_cursor: js.UndefOr[String] = js.native
  /** The URL that returns the current page of results. */
  var refresh_url: js.UndefOr[String] = js.native
  /** Reserved for future use. */
  var total: js.UndefOr[Double] = js.native
}

object Pagination {
  @scala.inline
  def apply(): Pagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagination]
  }
  @scala.inline
  implicit class PaginationOps[Self <: Pagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withRefresh_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh_cursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh_cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh_url")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

