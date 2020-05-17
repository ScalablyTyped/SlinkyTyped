package typingsSlinky.xmlCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.xmlCore.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlSchema extends js.Object {
  var items: js.UndefOr[StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with Type]] = js.native
  var localName: js.UndefOr[String] = js.native
  var namespaceURI: js.UndefOr[String | Null] = js.native
  var parser: js.UndefOr[IXmlSerializableConstructor] = js.native
  var prefix: js.UndefOr[String | Null] = js.native
  var target: js.UndefOr[js.Any] = js.native
}

object XmlSchema {
  @scala.inline
  def apply(): XmlSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlSchema]
  }
  @scala.inline
  implicit class XmlSchemaOps[Self <: XmlSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
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
    def withParser(value: IXmlSerializableConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
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
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

