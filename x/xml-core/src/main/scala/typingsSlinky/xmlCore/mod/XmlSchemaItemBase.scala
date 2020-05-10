package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlSchemaItemBase extends js.Object {
  /**
    * Local name of item
    *
    * @type {string}
    * @memberOf XmlSchemaItemBase
    */
  var localName: js.UndefOr[String] = js.native
  /**
    * Namespace URI of attribute
    *
    * @type {(string |)}
    * @memberOf XmlSchemaItemBase
    */
  var namespaceURI: js.UndefOr[String | Null] = js.native
  /**
    * Default prefix for Xml element
    *
    * @type {(string |)}
    * @memberOf XmlSchemaItemBase
    */
  var prefix: js.UndefOr[String | Null] = js.native
}

object XmlSchemaItemBase {
  @scala.inline
  def apply(): XmlSchemaItemBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlSchemaItemBase]
  }
  @scala.inline
  implicit class XmlSchemaItemBaseOps[Self <: XmlSchemaItemBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceURINull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(null)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(null)
        ret
    }
  }
  
}

