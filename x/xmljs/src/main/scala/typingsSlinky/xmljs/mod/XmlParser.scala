package typingsSlinky.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
@js.native
trait XmlParser extends js.Object {
  var errors: js.Array[js.Error] = js.native
  /**
    * Parses a xml string
    * @param xml  XML string to parse
    * @param cb Callback function with error and the result (an Node)
    * @returns whenever or not there where any errors
    */
  def parseString(xml: String, cb: js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]): Boolean = js.native
}

object XmlParser {
  @scala.inline
  def apply(
    errors: js.Array[js.Error],
    parseString: (String, js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]) => Boolean
  ): XmlParser = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], parseString = js.Any.fromFunction2(parseString))
    __obj.asInstanceOf[XmlParser]
  }
  @scala.inline
  implicit class XmlParserOps[Self <: XmlParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseString(
      value: (String, js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseString")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

