package typingsSlinky.wordpressShortcode

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeAttrs> */
@js.native
trait PartialShortcodeAttrs extends js.Object {
  var named: js.UndefOr[Record[String, js.UndefOr[String]]] = js.native
  var numeric: js.UndefOr[js.Array[String]] = js.native
}

object PartialShortcodeAttrs {
  @scala.inline
  def apply(): PartialShortcodeAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShortcodeAttrs]
  }
  @scala.inline
  implicit class PartialShortcodeAttrsOps[Self <: PartialShortcodeAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamed(value: Record[String, js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("named")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
  }
  
}

