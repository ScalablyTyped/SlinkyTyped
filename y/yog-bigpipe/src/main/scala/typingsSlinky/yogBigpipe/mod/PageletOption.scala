package typingsSlinky.yogBigpipe.mod

import typingsSlinky.yogBigpipe.mod.Pagelet.mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageletOption extends js.Object {
  var compiled: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
  var `for`: js.UndefOr[String] = js.native
  var id: String = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var locals: js.UndefOr[js.Object] = js.native
  var mode: js.UndefOr[typingsSlinky.yogBigpipe.mod.Pagelet.mode] = js.native
  var reqID: String = js.native
  var skipAnalysis: Boolean = js.native
}

object PageletOption {
  @scala.inline
  def apply(id: String, reqID: String, skipAnalysis: Boolean): PageletOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reqID = reqID.asInstanceOf[js.Any], skipAnalysis = skipAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageletOption]
  }
  @scala.inline
  implicit class PageletOptionOps[Self <: PageletOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReqID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipAnalysis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompiled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompiled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiled")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withLocals(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

