package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesBatchedContinuousIntegration extends js.Object {
  var enumValues: BatchedContinuousIntegration = js.native
}

object EnumValuesBatchedContinuousIntegration {
  @scala.inline
  def apply(enumValues: BatchedContinuousIntegration): EnumValuesBatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBatchedContinuousIntegration]
  }
  @scala.inline
  implicit class EnumValuesBatchedContinuousIntegrationOps[Self <: EnumValuesBatchedContinuousIntegration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: BatchedContinuousIntegration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

