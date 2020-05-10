package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingExample. */
@js.native
trait TrainingExample extends js.Object {
  /** The cross reference associated with this training example. */
  var cross_reference: js.UndefOr[String] = js.native
  /** The document ID associated with this training example. */
  var document_id: js.UndefOr[String] = js.native
  /** The relevance of the training example. */
  var relevance: js.UndefOr[Double] = js.native
}

object TrainingExample {
  @scala.inline
  def apply(): TrainingExample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingExample]
  }
  @scala.inline
  implicit class TrainingExampleOps[Self <: TrainingExample] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCross_reference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCross_reference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_reference")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document_id")(js.undefined)
        ret
    }
    @scala.inline
    def withRelevance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(js.undefined)
        ret
    }
  }
  
}

