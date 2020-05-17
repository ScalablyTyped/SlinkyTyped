package typingsSlinky.sinon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sinon.sinon.SinonExposeOptions> */
@js.native
trait PartialSinonExposeOptions extends js.Object {
  var includeFail: js.UndefOr[Boolean] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object PartialSinonExposeOptions {
  @scala.inline
  def apply(): PartialSinonExposeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonExposeOptions]
  }
  @scala.inline
  implicit class PartialSinonExposeOptionsOps[Self <: PartialSinonExposeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeFail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFail")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

