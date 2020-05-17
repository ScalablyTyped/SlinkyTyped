package typingsSlinky.stringPlaceholder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<string-placeholder.string-placeholder.Options> */
@js.native
trait ReadonlyOptions extends js.Object {
  val after: js.UndefOr[String] = js.native
  val before: js.UndefOr[String] = js.native
  val clean: js.UndefOr[Boolean] = js.native
  val escape: js.UndefOr[String] = js.native
}

object ReadonlyOptions {
  @scala.inline
  def apply(): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyOptions]
  }
  @scala.inline
  implicit class ReadonlyOptionsOps[Self <: ReadonlyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
  }
  
}

