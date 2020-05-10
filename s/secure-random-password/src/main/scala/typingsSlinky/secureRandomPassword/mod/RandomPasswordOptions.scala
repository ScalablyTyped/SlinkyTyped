package typingsSlinky.secureRandomPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomPasswordOptions extends js.Object {
  var characters: js.UndefOr[String | js.Array[String]] = js.native
  var length: js.UndefOr[Double] = js.native
}

object RandomPasswordOptions {
  @scala.inline
  def apply(): RandomPasswordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomPasswordOptions]
  }
  @scala.inline
  implicit class RandomPasswordOptionsOps[Self <: RandomPasswordOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacters(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
  }
  
}

