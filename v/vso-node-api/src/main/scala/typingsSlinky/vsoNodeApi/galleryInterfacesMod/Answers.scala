package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Answers extends js.Object {
  /**
    * Gets or sets the vs marketplace extension name
    */
  var vSMarketplaceExtensionName: String = js.native
  /**
    * Gets or sets the vs marketplace publsiher name
    */
  var vSMarketplacePublisherName: String = js.native
}

object Answers {
  @scala.inline
  def apply(vSMarketplaceExtensionName: String, vSMarketplacePublisherName: String): Answers = {
    val __obj = js.Dynamic.literal(vSMarketplaceExtensionName = vSMarketplaceExtensionName.asInstanceOf[js.Any], vSMarketplacePublisherName = vSMarketplacePublisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Answers]
  }
  @scala.inline
  implicit class AnswersOps[Self <: Answers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVSMarketplaceExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vSMarketplaceExtensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVSMarketplacePublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vSMarketplacePublisherName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

