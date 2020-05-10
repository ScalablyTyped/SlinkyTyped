package typingsSlinky.xadesjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributeNames extends js.Object {
  var AttributeNames: AnonEncoding = js.native
  var DefaultPrefix: String = js.native
  var ElementNames: AnonAllDataObjectsTimeStamp = js.native
  /**
    * The XAdES XML namespace URI
    */
  var NamespaceURI: String = js.native
  /**
    * Mandated type name for the Uri reference to the SignedProperties element
    */
  var SignedPropertiesType: String = js.native
}

object AnonAttributeNames {
  @scala.inline
  def apply(
    AttributeNames: AnonEncoding,
    DefaultPrefix: String,
    ElementNames: AnonAllDataObjectsTimeStamp,
    NamespaceURI: String,
    SignedPropertiesType: String
  ): AnonAttributeNames = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DefaultPrefix = DefaultPrefix.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], SignedPropertiesType = SignedPropertiesType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributeNames]
  }
  @scala.inline
  implicit class AnonAttributeNamesOps[Self <: AnonAttributeNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNames(value: AnonEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementNames(value: AnonAllDataObjectsTimeStamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElementNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedPropertiesType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedPropertiesType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

