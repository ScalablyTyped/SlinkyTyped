package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMultiConfiguration extends js.Object {
  var multiConfiguration: Double = js.native
  var multiMachine: Double = js.native
  var none: Double = js.native
}

object AnonMultiConfiguration {
  @scala.inline
  def apply(multiConfiguration: Double, multiMachine: Double, none: Double): AnonMultiConfiguration = {
    val __obj = js.Dynamic.literal(multiConfiguration = multiConfiguration.asInstanceOf[js.Any], multiMachine = multiMachine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultiConfiguration]
  }
  @scala.inline
  implicit class AnonMultiConfigurationOps[Self <: AnonMultiConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiConfiguration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiMachine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiMachine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

