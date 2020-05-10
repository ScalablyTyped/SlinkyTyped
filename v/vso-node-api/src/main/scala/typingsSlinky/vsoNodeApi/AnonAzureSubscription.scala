package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAzureSubscription extends js.Object {
  var azureSubscription: Double = js.native
  var chef: Double = js.native
  var custom: Double = js.native
  var generic: Double = js.native
}

object AnonAzureSubscription {
  @scala.inline
  def apply(azureSubscription: Double, chef: Double, custom: Double, generic: Double): AnonAzureSubscription = {
    val __obj = js.Dynamic.literal(azureSubscription = azureSubscription.asInstanceOf[js.Any], chef = chef.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAzureSubscription]
  }
  @scala.inline
  implicit class AnonAzureSubscriptionOps[Self <: AnonAzureSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAzureSubscription(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneric(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

