package typingsSlinky.x2js.mod

import typingsSlinky.x2js.x2jsStrings.`object`
import typingsSlinky.x2js.x2jsStrings.none
import typingsSlinky.x2js.x2jsStrings.property
import typingsSlinky.x2js.x2jsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If set to "property" then <element>_asArray will be created to allow you to access any element as an array (even if there is only one of it).
    * 
    * @type {('property' | 'none')}
    * @memberOf X2JS.Options
    */
  var arrayAccessForm: js.UndefOr[property | none] = js.native
  /**
    * Any elements that match the paths listed here will be stored in JavaScript objects as arrays even if there is only one of them. The path can be a plain string (parent.child1.child2), a regex (/.*\.child2/) or function(elementName, elementPath).
    * 
    * @type {(Array<string | RegExp | ((elementName: string, elementPath: string) => boolean)>)}
    * @memberOf X2JS.Options
    */
  var arrayAccessFormPaths: js.UndefOr[
    js.Array[
      String | js.RegExp | (js.Function2[/* elementName */ String, /* elementPath */ String, Boolean])
    ]
  ] = js.native
  /**
    * Allows attribute values to be converted on the fly during parsing to objects.
    * 
    * @type {Array<X2JS.AttributeConverter>}
    * @memberOf X2JS.Options
    */
  var attributeConverters: js.UndefOr[js.Array[AttributeConverter]] = js.native
  /**
    * Prefix to use for properties that are created to represent XML attributes. 
    * 
    * @type {string}
    * @memberOf X2JS.Options
    */
  var attributePrefix: js.UndefOr[String] = js.native
  /**
    * Any elements that match the paths here will have their text parsed as an XML datetime value (2011-11-12T13:00:00-07:00 style). The path can be a plain string (parent.child1.child2), a regex (/.*\.child2/) or function(elementPath).
    * 
    * @type {(Array<string | RegExp | ((elementPath: string) => boolean)>)}
    * @memberOf X2JS.Options
    */
  var datetimeAccessFormPaths: js.UndefOr[js.Array[String | js.RegExp | (js.Function1[/* elementPath */ String, Boolean])]] = js.native
  /**
    * If "text" then <empty></empty> will be transformed to "". If "object" then <empty></empty> will be transformed to {}.
    * 
    * @type {('object' | 'text')}
    * @memberOf X2JS.Options
    */
  var emptyNodeForm: js.UndefOr[`object` | text] = js.native
  /**
    * If true, a toString function is generated to print nodes containing text or cdata. Useful if you want to accept both plain text and CData as equivalent inputs.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var enableToStringFunc: js.UndefOr[Boolean] = js.native
  /**
    * Whether XML characters in text are escaped when reading/writing XML.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var escapeMode: js.UndefOr[Boolean] = js.native
  /**
    * If true, the root element of the XML document is ignored when converting to objects. The result will directly have the root element's children as its own properties.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var ignoreRoot: js.UndefOr[Boolean] = js.native
  /**
    * If this property defined as false and an XML element has CData node ONLY, it will be converted to text without additional property "__cdata".
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var keepCData: js.UndefOr[Boolean] = js.native
  /**
    * If this property defined as true, use { __text: 'abc' } over 'abc'
    *
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var keepText: js.UndefOr[Boolean] = js.native
  /**
    * If true, empty elements will created as self closing elements (<element />). If false, empty elements will be created with start and end tags (<element></element>).
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var selfClosingElements: js.UndefOr[Boolean] = js.native
  /**
    * If true, empty text tags are ignored for elements with child nodes.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var skipEmptyTextNodesForObj: js.UndefOr[Boolean] = js.native
  /**
    * If true, whitespace is trimmed from text nodes.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var stripWhitespaces: js.UndefOr[Boolean] = js.native
  /**
    * If true, double quotes are used in generated XML. 
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var useDoubleQuotes: js.UndefOr[Boolean] = js.native
  /**
    * If "object" then <empty></empty> will be transformed to {}.
    *
    * @type {'object'}
    * @memberOf X2JS.Options
    */
  var xmldomOptions: js.UndefOr[`object`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayAccessForm(value: property | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayAccessForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayAccessForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayAccessForm")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayAccessFormPaths(
      value: js.Array[
          String | js.RegExp | (js.Function2[/* elementName */ String, /* elementPath */ String, Boolean])
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayAccessFormPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayAccessFormPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayAccessFormPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeConverters(value: js.Array[AttributeConverter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeConverters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeConverters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeConverters")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDatetimeAccessFormPaths(value: js.Array[String | js.RegExp | (js.Function1[/* elementPath */ String, Boolean])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeAccessFormPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetimeAccessFormPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeAccessFormPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyNodeForm(value: `object` | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyNodeForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyNodeForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyNodeForm")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableToStringFunc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToStringFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableToStringFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToStringFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepCData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCData")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfClosingElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosingElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfClosingElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfClosingElements")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipEmptyTextNodesForObj(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyTextNodesForObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipEmptyTextNodesForObj: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyTextNodesForObj")(js.undefined)
        ret
    }
    @scala.inline
    def withStripWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripWhitespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripWhitespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDoubleQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDoubleQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDoubleQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDoubleQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withXmldomOptions(value: `object`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmldomOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmldomOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmldomOptions")(js.undefined)
        ret
    }
  }
  
}

