package typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the qualifiers associated with a ResourceCandidate . */
@js.native
trait ResourceQualifier extends js.Object {
  /** Indicates whether this qualifier should be considered as a default match when no match is found. */
  var isDefault: Boolean = js.native
  /** Indicates whether a given qualifier for a given candidate matched the context when a named resource is resolved to a candidate for some given context. */
  var isMatch: Boolean = js.native
  /** The name of the qualifier. */
  var qualifierName: String = js.native
  /** The value of the qualifier. */
  var qualifierValue: String = js.native
  /** A score that indicates how well the qualifier matched the context against which it was resolved. */
  var score: Double = js.native
}

object ResourceQualifier {
  @scala.inline
  def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): ResourceQualifier = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQualifier]
  }
  @scala.inline
  implicit class ResourceQualifierOps[Self <: ResourceQualifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifierName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifierName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifierValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifierValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

