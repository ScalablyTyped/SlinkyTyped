package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureSubscription extends js.Object {
  var azureSubscription: scala.Double = js.native
  var chef: scala.Double = js.native
  var custom: scala.Double = js.native
  var generic: scala.Double = js.native
}

object AzureSubscription {
  @scala.inline
  def apply(azureSubscription: scala.Double, chef: scala.Double, custom: scala.Double, generic: scala.Double): AzureSubscription = {
    val __obj = js.Dynamic.literal(azureSubscription = azureSubscription.asInstanceOf[js.Any], chef = chef.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscription]
  }
  @scala.inline
  implicit class AzureSubscriptionOps[Self <: AzureSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAzureSubscription(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChef(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneric(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

