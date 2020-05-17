package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiConfiguration extends js.Object {
  var multiConfiguration: scala.Double = js.native
  var multiMachine: scala.Double = js.native
  var none: scala.Double = js.native
}

object MultiConfiguration {
  @scala.inline
  def apply(multiConfiguration: scala.Double, multiMachine: scala.Double, none: scala.Double): MultiConfiguration = {
    val __obj = js.Dynamic.literal(multiConfiguration = multiConfiguration.asInstanceOf[js.Any], multiMachine = multiMachine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiConfiguration]
  }
  @scala.inline
  implicit class MultiConfigurationOps[Self <: MultiConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiConfiguration(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiMachine(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiMachine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

