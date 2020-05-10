package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceQualifier extends js.Object {
  var isDefault: Boolean = js.native
  var isMatch: Boolean = js.native
  var qualifierName: String = js.native
  var qualifierValue: String = js.native
  var score: Double = js.native
}

object IResourceQualifier {
  @scala.inline
  def apply(isDefault: Boolean, isMatch: Boolean, qualifierName: String, qualifierValue: String, score: Double): IResourceQualifier = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceQualifier]
  }
  @scala.inline
  implicit class IResourceQualifierOps[Self <: IResourceQualifier] (val x: Self) extends AnyVal {
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

