package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheQueryOptions extends js.Object {
  var ignoreMethod: js.UndefOr[scala.Boolean] = js.native
  var ignoreSearch: js.UndefOr[scala.Boolean] = js.native
  var ignoreVary: js.UndefOr[scala.Boolean] = js.native
}

object CacheQueryOptions {
  @scala.inline
  def apply(): CacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheQueryOptions]
  }
  @scala.inline
  implicit class CacheQueryOptionsOps[Self <: org.scalajs.dom.experimental.serviceworkers.CacheQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreMethod(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSearch(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreVary(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreVary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreVary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreVary")(js.undefined)
        ret
    }
  }
  
}

