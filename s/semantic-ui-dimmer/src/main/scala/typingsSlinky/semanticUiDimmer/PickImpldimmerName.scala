package typingsSlinky.semanticUiDimmer

import typingsSlinky.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'dimmerName'> */
@js.native
trait PickImpldimmerName extends js.Object {
  var dimmerName: `false` | String = js.native
}

object PickImpldimmerName {
  @scala.inline
  def apply(dimmerName: `false` | String): PickImpldimmerName = {
    val __obj = js.Dynamic.literal(dimmerName = dimmerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmerName]
  }
  @scala.inline
  implicit class PickImpldimmerNameOps[Self <: PickImpldimmerName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimmerName(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

