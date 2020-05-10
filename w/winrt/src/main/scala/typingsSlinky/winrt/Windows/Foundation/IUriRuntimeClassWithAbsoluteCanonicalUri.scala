package typingsSlinky.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUriRuntimeClassWithAbsoluteCanonicalUri extends js.Object {
  var absoluteCanonicalUri: String = js.native
  var displayIri: String = js.native
}

object IUriRuntimeClassWithAbsoluteCanonicalUri {
  @scala.inline
  def apply(absoluteCanonicalUri: String, displayIri: String): IUriRuntimeClassWithAbsoluteCanonicalUri = {
    val __obj = js.Dynamic.literal(absoluteCanonicalUri = absoluteCanonicalUri.asInstanceOf[js.Any], displayIri = displayIri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUriRuntimeClassWithAbsoluteCanonicalUri]
  }
  @scala.inline
  implicit class IUriRuntimeClassWithAbsoluteCanonicalUriOps[Self <: IUriRuntimeClassWithAbsoluteCanonicalUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteCanonicalUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteCanonicalUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayIri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayIri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

