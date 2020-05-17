package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Additional extends js.Object {
  var additional: js.Array[String] = js.native
  var minimum: js.Array[String] = js.native
}

object Additional {
  @scala.inline
  def apply(additional: js.Array[String], minimum: js.Array[String]): Additional = {
    val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Additional]
  }
  @scala.inline
  implicit class AdditionalOps[Self <: Additional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

