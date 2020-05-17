package typingsSlinky.xadesjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeNames extends js.Object {
  var AttributeNames: Encoding = js.native
  var DefaultPrefix: String = js.native
  var ElementNames: AllDataObjectsTimeStamp = js.native
  /**
    * The XAdES XML namespace URI
    */
  var NamespaceURI: String = js.native
  /**
    * Mandated type name for the Uri reference to the SignedProperties element
    */
  var SignedPropertiesType: String = js.native
}

object AttributeNames {
  @scala.inline
  def apply(
    AttributeNames: Encoding,
    DefaultPrefix: String,
    ElementNames: AllDataObjectsTimeStamp,
    NamespaceURI: String,
    SignedPropertiesType: String
  ): AttributeNames = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DefaultPrefix = DefaultPrefix.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], NamespaceURI = NamespaceURI.asInstanceOf[js.Any], SignedPropertiesType = SignedPropertiesType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeNames]
  }
  @scala.inline
  implicit class AttributeNamesOps[Self <: AttributeNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNames(value: Encoding): Self = {
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
    def withElementNames(value: AllDataObjectsTimeStamp): Self = {
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

