package typingsSlinky.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the functions used for converting values to strings.
  */
@js.native
trait XMLStringifier extends js.Object {
  /**
    * Escapes special characters in attribute values.
    */
  var attEscape: js.UndefOr[js.Function1[/* v */ String, String]] = js.native
  /**
    * Converts attribute value to string
    */
  var attValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts the contents of a CDATA node to string
    */
  var cdata: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts the contents of a comment node to string
    */
  var comment: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to an attribute. 
    */
  var convertAttKey: js.UndefOr[String] = js.native
  /** 
    * When prepended to a JS object key, converts its value to a CDATA 
    * node. 
    */
  var convertCDataKey: js.UndefOr[String] = js.native
  /** 
    * When prepended to a JS object key, converts its value to a 
    * comment node.
    */
  var convertCommentKey: js.UndefOr[String] = js.native
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to a processing instruction node. 
    */
  var convertPIKey: js.UndefOr[String] = js.native
  /** 
    * When prepended to a JS object key, converts its value to a raw 
    * text node. 
    */
  var convertRawKey: js.UndefOr[String] = js.native
  /** 
    * When prepended to a JS object key, converts its value to a text node. 
    * 
    * _Note:_ Since JS objects cannot contain duplicate keys, multiple text 
    * nodes can be created by adding some unique text after each object 
    * key. For example: `{ '#text1': 'some text', '#text2': 'more text' };`
    */
  var convertTextKey: js.UndefOr[String] = js.native
  /**
    * Converts `!ATTLIST` node default value inside DocType to string
    */
  var dtdAttDefault: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts `!ATTLIST` node type inside DocType to string
    */
  var dtdAttType: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts `!ELEMENT` node content inside Doctype to string
    */
  var dtdElementValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts `!ENTITY` node content inside Doctype to string
    */
  var dtdEntityValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts `!NOTATION` node content inside Doctype to string
    */
  var dtdNData: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts DocType public identifier to string
    */
  var dtdPubID: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts DocType system identifier to string
    */
  var dtdSysID: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts processing instruction target to string
    */
  var insTarget: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts processing instruction value to string
    */
  var insValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts an element or attribute name to string
    */
  var name: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts the contents of a raw text node to string
    */
  var raw: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts the contents of a text node to string
    */
  var text: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Escapes special characters in text.
    */
  var textEscape: js.UndefOr[js.Function1[/* v */ String, String]] = js.native
  /**
    * Converts XML encoding to string
    */
  var xmlEncoding: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts standalone document declaration to string
    */
  var xmlStandalone: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
  /**
    * Converts XML version to string
    */
  var xmlVersion: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.native
}

object XMLStringifier {
  @scala.inline
  def apply(): XMLStringifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLStringifier]
  }
  @scala.inline
  implicit class XMLStringifierOps[Self <: XMLStringifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttEscape(value: /* v */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attEscape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAttEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withAttValue(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAttValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCdata(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdata")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertAttKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertAttKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertAttKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertAttKey")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertCDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertCDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertCDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertCDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertCommentKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertCommentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertCommentKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertCommentKey")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertPIKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertPIKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertPIKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertPIKey")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertRawKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertRawKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertRawKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertRawKey")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertTextKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTextKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertTextKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTextKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdAttDefault(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdAttDefault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDtdAttDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdAttDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdAttType(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdAttType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDtdAttType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdAttType")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdElementValue(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdElementValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDtdElementValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdElementValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdEntityValue(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdEntityValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDtdEntityValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdEntityValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdNData(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdNData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDtdNData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdNData")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdPubID(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdPubID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDtdPubID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdPubID")(js.undefined)
        ret
    }
    @scala.inline
    def withDtdSysID(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdSysID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDtdSysID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtdSysID")(js.undefined)
        ret
    }
    @scala.inline
    def withInsTarget(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withInsValue(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insValue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEscape(value: /* v */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEscape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTextEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlEncoding(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlEncoding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutXmlEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlStandalone(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlStandalone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutXmlStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlStandalone")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlVersion(value: /* v */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutXmlVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlVersion")(js.undefined)
        ret
    }
  }
  
}

