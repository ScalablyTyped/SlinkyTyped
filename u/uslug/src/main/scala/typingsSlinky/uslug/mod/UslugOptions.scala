package typingsSlinky.uslug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UslugOptions extends js.Object {
  var allowedChars: js.UndefOr[String] = js.native
  var lower: js.UndefOr[Boolean] = js.native
  var spaces: js.UndefOr[Boolean] = js.native
}

object UslugOptions {
  @scala.inline
  def apply(): UslugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UslugOptions]
  }
  @scala.inline
  implicit class UslugOptionsOps[Self <: UslugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedChars")(js.undefined)
        ret
    }
    @scala.inline
    def withLower(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
  }
  
}

