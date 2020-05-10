package typingsSlinky.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Response from the classifier for multiple phrases. */
@js.native
trait ClassificationCollection extends js.Object {
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.native
  /** An array of classifier responses for each submitted phrase. */
  var collection: js.UndefOr[js.Array[CollectionItem]] = js.native
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.native
}

object ClassificationCollection {
  @scala.inline
  def apply(): ClassificationCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationCollection]
  }
  @scala.inline
  implicit class ClassificationCollectionOps[Self <: ClassificationCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassifier_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifier_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCollection(value: js.Array[CollectionItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

