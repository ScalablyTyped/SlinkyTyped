package typingsSlinky.sha1.mod

import typingsSlinky.sha1.sha1Booleans.`false`
import typingsSlinky.sha1.sha1Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha1AsBytesOptions extends Sha1Options {
  var asBytes: `true` = js.native
  var asString: js.UndefOr[`false`] = js.native
}

object Sha1AsBytesOptions {
  @scala.inline
  def apply(asBytes: `true`): Sha1AsBytesOptions = {
    val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha1AsBytesOptions]
  }
  @scala.inline
  implicit class Sha1AsBytesOptionsOps[Self <: Sha1AsBytesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsBytes(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsString(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asString")(js.undefined)
        ret
    }
  }
  
}

