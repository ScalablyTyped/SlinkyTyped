package typingsSlinky.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** Response from the classifier for a phrase. */
@js.native
trait Classification extends js.Object {
  /** An array of up to ten class-confidence pairs sorted in descending order of confidence. */
  var classes: js.UndefOr[js.Array[ClassifiedClass]] = js.native
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.native
  /** The submitted phrase. */
  var text: js.UndefOr[String] = js.native
  /** The class with the highest confidence. */
  var top_class: js.UndefOr[String] = js.native
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.native
}

object Classification {
  @scala.inline
  def apply(): Classification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classification]
  }
  @scala.inline
  implicit class ClassificationOps[Self <: Classification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: js.Array[ClassifiedClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTop_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_class")(js.undefined)
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

