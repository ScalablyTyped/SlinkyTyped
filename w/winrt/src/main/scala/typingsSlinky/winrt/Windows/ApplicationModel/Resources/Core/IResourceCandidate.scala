package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceCandidate extends js.Object {
  var isDefault: Boolean = js.native
  var isMatch: Boolean = js.native
  var isMatchAsDefault: Boolean = js.native
  var qualifiers: IVectorView[ResourceQualifier] = js.native
  var valueAsString: String = js.native
  def getQualifierValue(qualifierName: String): String = js.native
  def getValueAsFileAsync(): IAsyncOperation[StorageFile] = js.native
}

object IResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => String,
    getValueAsFileAsync: () => IAsyncOperation[StorageFile],
    isDefault: Boolean,
    isMatch: Boolean,
    isMatchAsDefault: Boolean,
    qualifiers: IVectorView[ResourceQualifier],
    valueAsString: String
  ): IResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), getValueAsFileAsync = js.Any.fromFunction0(getValueAsFileAsync), isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], isMatchAsDefault = isMatchAsDefault.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceCandidate]
  }
  @scala.inline
  implicit class IResourceCandidateOps[Self <: IResourceCandidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetQualifierValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQualifierValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValueAsFileAsync(value: () => IAsyncOperation[StorageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueAsFileAsync")(js.Any.fromFunction0(value))
        ret
    }
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
    def withIsMatchAsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMatchAsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifiers(value: IVectorView[ResourceQualifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueAsString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAsString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

