package typingsSlinky.wordpressShortcode.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortcodeAttrs extends js.Object {
  var named: Record[String, js.UndefOr[String]] = js.native
  var numeric: js.Array[String] = js.native
}

object ShortcodeAttrs {
  @scala.inline
  def apply(named: Record[String, js.UndefOr[String]], numeric: js.Array[String]): ShortcodeAttrs = {
    val __obj = js.Dynamic.literal(named = named.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcodeAttrs]
  }
  @scala.inline
  implicit class ShortcodeAttrsOps[Self <: ShortcodeAttrs] (val x: Self) extends AnyVal {
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
    def withNumeric(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

