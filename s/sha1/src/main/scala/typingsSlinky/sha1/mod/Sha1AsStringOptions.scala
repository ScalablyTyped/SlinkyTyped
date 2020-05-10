package typingsSlinky.sha1.mod

import typingsSlinky.sha1.sha1Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha1AsStringOptions extends Sha1Options {
  var asBytes: js.UndefOr[`false`] = js.native
  var asString: js.UndefOr[Boolean] = js.native
}

object Sha1AsStringOptions {
  @scala.inline
  def apply(): Sha1AsStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sha1AsStringOptions]
  }
  @scala.inline
  implicit class Sha1AsStringOptionsOps[Self <: Sha1AsStringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsBytes(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withAsString(value: Boolean): Self = {
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

