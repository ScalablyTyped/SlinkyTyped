package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndexedResourceQualifier extends js.Object {
  var qualifierName: String = js.native
  var qualifierValue: String = js.native
}

object IIndexedResourceQualifier {
  @scala.inline
  def apply(qualifierName: String, qualifierValue: String): IIndexedResourceQualifier = {
    val __obj = js.Dynamic.literal(qualifierName = qualifierName.asInstanceOf[js.Any], qualifierValue = qualifierValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndexedResourceQualifier]
  }
  @scala.inline
  implicit class IIndexedResourceQualifierOps[Self <: IIndexedResourceQualifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

