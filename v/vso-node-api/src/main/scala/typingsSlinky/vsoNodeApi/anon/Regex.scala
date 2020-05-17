package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Regex extends js.Object {
  var regex: scala.Double = js.native
  var variable: scala.Double = js.native
}

object Regex {
  @scala.inline
  def apply(regex: scala.Double, variable: scala.Double): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  @scala.inline
  implicit class RegexOps[Self <: Regex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegex(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariable(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

