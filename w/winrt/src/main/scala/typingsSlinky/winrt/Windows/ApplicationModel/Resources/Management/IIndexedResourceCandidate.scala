package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Management

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndexedResourceCandidate extends js.Object {
  var metadata: IMapView[String, String] = js.native
  var qualifiers: IVectorView[IndexedResourceQualifier] = js.native
  var `type`: IndexedResourceType = js.native
  var uri: Uri = js.native
  var valueAsString: String = js.native
  def getQualifierValue(qualifierName: String): String = js.native
}

object IIndexedResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => String,
    metadata: IMapView[String, String],
    qualifiers: IVectorView[IndexedResourceQualifier],
    `type`: IndexedResourceType,
    uri: Uri,
    valueAsString: String
  ): IIndexedResourceCandidate = {
    val __obj = js.Dynamic.literal(getQualifierValue = js.Any.fromFunction1(getQualifierValue), metadata = metadata.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndexedResourceCandidate]
  }
  @scala.inline
  implicit class IIndexedResourceCandidateOps[Self <: IIndexedResourceCandidate] (val x: Self) extends AnyVal {
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
    def withMetadata(value: IMapView[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifiers(value: IVectorView[IndexedResourceQualifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IndexedResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
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

