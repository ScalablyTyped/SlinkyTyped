package typingsSlinky.squirrelly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeHelper extends js.Object {
  var blocks: js.UndefOr[Blocks] = js.native
  var helperEnd: js.UndefOr[js.Function0[String]] = js.native
  var helperStart: js.UndefOr[
    js.Function2[/* param */ js.UndefOr[String], /* id */ js.UndefOr[String], String]
  ] = js.native
  var selfClosing: js.UndefOr[js.Function1[/* param */ js.UndefOr[String], String]] = js.native
}

object NativeHelper {
  @scala.inline
  def apply(): NativeHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeHelper]
  }
  @scala.inline
  implicit class NativeHelperOps[Self <: NativeHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: Blocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperEnd(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHelperEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperStart(value: (/* param */ js.UndefOr[String], /* id */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHelperStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfClosing(value: /* param */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelfClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosing")(js.undefined)
        ret
    }
  }
  
}

