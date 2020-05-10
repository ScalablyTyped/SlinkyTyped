package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.linear
import typingsSlinky.vegaTypings.vegaTypingsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseGradient extends js.Object {
  /**
    * The type of gradient.
    */
  var gradient: linear | radial = js.native
}

object BaseGradient {
  @scala.inline
  def apply(gradient: linear | radial): BaseGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGradient]
  }
  @scala.inline
  implicit class BaseGradientOps[Self <: BaseGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradient(value: linear | radial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

