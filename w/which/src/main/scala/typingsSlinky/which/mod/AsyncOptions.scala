package typingsSlinky.which.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for which() async API */
@js.native
trait AsyncOptions extends js.Object {
  /** If true, return all matches, instead of just the first one. Note that this means the function returns an array of strings instead of a single string. */
  var all: js.UndefOr[Boolean] = js.native
  /** Use instead of the PATH environment variable. */
  var path: js.UndefOr[String] = js.native
  /** Use instead of the PATHEXT environment variable. */
  var pathExt: js.UndefOr[String] = js.native
}

object AsyncOptions {
  @scala.inline
  def apply(): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions]
  }
  @scala.inline
  implicit class AsyncOptionsOps[Self <: AsyncOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPathExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathExt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathExt")(js.undefined)
        ret
    }
  }
  
}

