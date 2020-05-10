package typingsSlinky.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkOptions extends js.Object {
  var filters: js.UndefOr[js.Array[String]] = js.native
  var followLinks: js.UndefOr[Boolean] = js.native
  var listeners: js.UndefOr[WalkOptionsListeners] = js.native
}

object WalkOptions {
  @scala.inline
  def apply(): WalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkOptions]
  }
  @scala.inline
  implicit class WalkOptionsOps[Self <: WalkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withListeners(value: WalkOptionsListeners): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.undefined)
        ret
    }
  }
  
}

