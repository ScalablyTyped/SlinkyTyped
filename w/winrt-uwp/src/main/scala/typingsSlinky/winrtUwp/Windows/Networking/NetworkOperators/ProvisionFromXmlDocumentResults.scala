package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results object returned to the application when the provisioning operation has completed. */
@js.native
trait ProvisionFromXmlDocumentResults extends js.Object {
  /** Determines whether all elements specified in the provisioning XML were applied. */
  var allElementsProvisioned: Boolean = js.native
  /** Indicates which elements in the provisioning profile could not be successfully provisioned. */
  var provisionResultsXml: String = js.native
}

object ProvisionFromXmlDocumentResults {
  @scala.inline
  def apply(allElementsProvisioned: Boolean, provisionResultsXml: String): ProvisionFromXmlDocumentResults = {
    val __obj = js.Dynamic.literal(allElementsProvisioned = allElementsProvisioned.asInstanceOf[js.Any], provisionResultsXml = provisionResultsXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionFromXmlDocumentResults]
  }
  @scala.inline
  implicit class ProvisionFromXmlDocumentResultsOps[Self <: ProvisionFromXmlDocumentResults] (val x: Self) extends AnyVal {
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

