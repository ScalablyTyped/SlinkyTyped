package typingsSlinky.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** List of available classifiers. */
@js.native
trait ClassifierList extends js.Object {
  /** The classifiers available to the user. Returns an empty array if no classifiers are available. */
  var classifiers: js.Array[Classifier] = js.native
}

object ClassifierList {
  @scala.inline
  def apply(classifiers: js.Array[Classifier]): ClassifierList = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierList]
  }
  @scala.inline
  implicit class ClassifierListOps[Self <: ClassifierList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassifiers(value: js.Array[Classifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifiers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

