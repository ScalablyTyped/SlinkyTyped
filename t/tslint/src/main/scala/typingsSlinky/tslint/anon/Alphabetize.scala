package typingsSlinky.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alphabetize extends js.Object {
  var alphabetize: Boolean = js.native
  var order: String = js.native
}

object Alphabetize {
  @scala.inline
  def apply(alphabetize: Boolean, order: String): Alphabetize = {
    val __obj = js.Dynamic.literal(alphabetize = alphabetize.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alphabetize]
  }
  @scala.inline
  implicit class AlphabetizeOps[Self <: Alphabetize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphabetize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphabetize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

