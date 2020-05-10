package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumValuesAnonAbortedBySystem extends js.Object {
  var enumValues: AnonAbortedBySystem = js.native
}

object AnonEnumValuesAnonAbortedBySystem {
  @scala.inline
  def apply(enumValues: AnonAbortedBySystem): AnonEnumValuesAnonAbortedBySystem = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumValuesAnonAbortedBySystem]
  }
  @scala.inline
  implicit class AnonEnumValuesAnonAbortedBySystemOps[Self <: AnonEnumValuesAnonAbortedBySystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AnonAbortedBySystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

