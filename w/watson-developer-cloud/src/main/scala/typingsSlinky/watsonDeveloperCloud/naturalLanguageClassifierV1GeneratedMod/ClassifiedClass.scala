package typingsSlinky.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class and confidence. */
@js.native
trait ClassifiedClass extends js.Object {
  /** Class label. */
  var class_name: js.UndefOr[String] = js.native
  /** A decimal percentage that represents the confidence that Watson has in this class. Higher values represent higher confidences. */
  var confidence: js.UndefOr[Double] = js.native
}

object ClassifiedClass {
  @scala.inline
  def apply(): ClassifiedClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifiedClass]
  }
  @scala.inline
  implicit class ClassifiedClassOps[Self <: ClassifiedClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class_name")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
  }
  
}

