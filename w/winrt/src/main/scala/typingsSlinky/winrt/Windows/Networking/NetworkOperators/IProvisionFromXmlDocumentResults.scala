package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvisionFromXmlDocumentResults extends js.Object {
  var allElementsProvisioned: Boolean = js.native
  var provisionResultsXml: String = js.native
}

object IProvisionFromXmlDocumentResults {
  @scala.inline
  def apply(allElementsProvisioned: Boolean, provisionResultsXml: String): IProvisionFromXmlDocumentResults = {
    val __obj = js.Dynamic.literal(allElementsProvisioned = allElementsProvisioned.asInstanceOf[js.Any], provisionResultsXml = provisionResultsXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProvisionFromXmlDocumentResults]
  }
  @scala.inline
  implicit class IProvisionFromXmlDocumentResultsOps[Self <: IProvisionFromXmlDocumentResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllElementsProvisioned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allElementsProvisioned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionResultsXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionResultsXml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

