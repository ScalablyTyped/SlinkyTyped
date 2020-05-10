package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Classifier and score combination. */
@js.native
trait ClassifierResult extends js.Object {
  /** Classes within the classifier. */
  var classes: js.Array[ClassResult] = js.native
  /** ID of a classifier identified in the image. */
  var classifier_id: String = js.native
  /** Name of the classifier. */
  var name: String = js.native
}

object ClassifierResult {
  @scala.inline
  def apply(classes: js.Array[ClassResult], classifier_id: String, name: String): ClassifierResult = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], classifier_id = classifier_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierResult]
  }
  @scala.inline
  implicit class ClassifierResultOps[Self <: ClassifierResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: js.Array[ClassResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassifier_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifier_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

