package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetDetails extends js.Object {
  /**
    * Gets or sets the Answers, which contains vs marketplace extension name and publisher name
    */
  var answers: Answers = js.native
  /**
    * Gets or sets the VS publisher Id
    */
  var publisherNaturalIdentifier: String = js.native
}

object AssetDetails {
  @scala.inline
  def apply(answers: Answers, publisherNaturalIdentifier: String): AssetDetails = {
    val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any], publisherNaturalIdentifier = publisherNaturalIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDetails]
  }
  @scala.inline
  implicit class AssetDetailsOps[Self <: AssetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswers(value: Answers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherNaturalIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherNaturalIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

