package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlSchemaItemParser extends js.Object {
  /**
    * Xml parser for item
    *
    * @type {*}
    * @memberOf XmlSchemaItemParser
    */
  var parser: js.UndefOr[IXmlSerializableConstructor] = js.native
}

object XmlSchemaItemParser {
  @scala.inline
  def apply(): XmlSchemaItemParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlSchemaItemParser]
  }
  @scala.inline
  implicit class XmlSchemaItemParserOps[Self <: XmlSchemaItemParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

