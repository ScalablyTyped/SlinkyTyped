package typingsSlinky.x2js

import org.scalajs.dom.raw.Document
import typingsSlinky.x2js.x2jsStrings.`object`
import typingsSlinky.x2js.x2jsStrings.none
import typingsSlinky.x2js.x2jsStrings.property
import typingsSlinky.x2js.x2jsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("x2js", JSImport.Namespace)
  @js.native
  /**
    * Creates an instance of X2JS.
    * 
    * @param {X2JS.Options} [config]
    * 
    * @memberOf X2JS
    */
  class ^ () extends X2JS {
    def this(config: Options) = this()
  }
  
  @js.native
  trait AttributeConverter extends StObject {
    
    /**
      * Will be called for every attribute where test() returns true, replacing the original value of the attribute.
      * 
      * @param {string} name
      * @param {*} value
      * @returns {string}
      * 
      * @memberOf X2JS.AttributeConverter
      */
    def convert(name: String, value: js.Any): String = js.native
    
    /**
      * Indicates whether an attribute should be converted.
      * 
      * @param {string} name
      * @param {*} value
      * @returns {boolean}
      * 
      * @memberOf X2JS.AttributeConverter
      */
    def test(name: String, value: js.Any): Boolean = js.native
  }
  object AttributeConverter {
    
    @scala.inline
    def apply(convert: (String, js.Any) => String, test: (String, js.Any) => Boolean): AttributeConverter = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), test = js.Any.fromFunction2(test))
      __obj.asInstanceOf[AttributeConverter]
    }
    
    @scala.inline
    implicit class AttributeConverterMutableBuilder[Self <: AttributeConverter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvert(value: (String, js.Any) => String): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTest(value: (String, js.Any) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayAccessForm(value: property | none): Self = StObject.set(x, "arrayAccessForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayAccessFormPaths(
        value: js.Array[
              String | js.RegExp | (js.Function2[/* elementName */ String, /* elementPath */ String, Boolean])
            ]
      ): Self = StObject.set(x, "arrayAccessFormPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayAccessFormPathsUndefined: Self = StObject.set(x, "arrayAccessFormPaths", js.undefined)
      
      @scala.inline
      def setArrayAccessFormPathsVarargs(
        value: (String | js.RegExp | (js.Function2[/* elementName */ String, /* elementPath */ String, Boolean]))*
      ): Self = StObject.set(x, "arrayAccessFormPaths", js.Array(value :_*))
      
      @scala.inline
      def setArrayAccessFormUndefined: Self = StObject.set(x, "arrayAccessForm", js.undefined)
      
      @scala.inline
      def setAttributeConverters(value: js.Array[AttributeConverter]): Self = StObject.set(x, "attributeConverters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeConvertersUndefined: Self = StObject.set(x, "attributeConverters", js.undefined)
      
      @scala.inline
      def setAttributeConvertersVarargs(value: AttributeConverter*): Self = StObject.set(x, "attributeConverters", js.Array(value :_*))
      
      @scala.inline
      def setAttributePrefix(value: String): Self = StObject.set(x, "attributePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributePrefixUndefined: Self = StObject.set(x, "attributePrefix", js.undefined)
      
      @scala.inline
      def setDatetimeAccessFormPaths(value: js.Array[String | js.RegExp | (js.Function1[/* elementPath */ String, Boolean])]): Self = StObject.set(x, "datetimeAccessFormPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetimeAccessFormPathsUndefined: Self = StObject.set(x, "datetimeAccessFormPaths", js.undefined)
      
      @scala.inline
      def setDatetimeAccessFormPathsVarargs(value: (String | js.RegExp | (js.Function1[/* elementPath */ String, Boolean]))*): Self = StObject.set(x, "datetimeAccessFormPaths", js.Array(value :_*))
      
      @scala.inline
      def setEmptyNodeForm(value: `object` | text): Self = StObject.set(x, "emptyNodeForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyNodeFormUndefined: Self = StObject.set(x, "emptyNodeForm", js.undefined)
      
      @scala.inline
      def setEnableToStringFunc(value: Boolean): Self = StObject.set(x, "enableToStringFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableToStringFuncUndefined: Self = StObject.set(x, "enableToStringFunc", js.undefined)
      
      @scala.inline
      def setEscapeMode(value: Boolean): Self = StObject.set(x, "escapeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeModeUndefined: Self = StObject.set(x, "escapeMode", js.undefined)
      
      @scala.inline
      def setIgnoreRoot(value: Boolean): Self = StObject.set(x, "ignoreRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRootUndefined: Self = StObject.set(x, "ignoreRoot", js.undefined)
      
      @scala.inline
      def setKeepCData(value: Boolean): Self = StObject.set(x, "keepCData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepCDataUndefined: Self = StObject.set(x, "keepCData", js.undefined)
      
      @scala.inline
      def setKeepText(value: Boolean): Self = StObject.set(x, "keepText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepTextUndefined: Self = StObject.set(x, "keepText", js.undefined)
      
      @scala.inline
      def setSelfClosingElements(value: Boolean): Self = StObject.set(x, "selfClosingElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfClosingElementsUndefined: Self = StObject.set(x, "selfClosingElements", js.undefined)
      
      @scala.inline
      def setSkipEmptyTextNodesForObj(value: Boolean): Self = StObject.set(x, "skipEmptyTextNodesForObj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEmptyTextNodesForObjUndefined: Self = StObject.set(x, "skipEmptyTextNodesForObj", js.undefined)
      
      @scala.inline
      def setStripWhitespaces(value: Boolean): Self = StObject.set(x, "stripWhitespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripWhitespacesUndefined: Self = StObject.set(x, "stripWhitespaces", js.undefined)
      
      @scala.inline
      def setUseDoubleQuotes(value: Boolean): Self = StObject.set(x, "useDoubleQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDoubleQuotesUndefined: Self = StObject.set(x, "useDoubleQuotes", js.undefined)
      
      @scala.inline
      def setXmldomOptions(value: `object`): Self = StObject.set(x, "xmldomOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmldomOptionsUndefined: Self = StObject.set(x, "xmldomOptions", js.undefined)
    }
  }
  
  @js.native
  trait X2JS extends StObject {
    
    /**
      * Converts the provided property into an array. If the property is already an Array then it will return unchanged.
      * 
      * @template T
      * @param {(T | Array<T>)} prop
      * @returns {Array<T>}
      * 
      * @memberOf X2JS
      */
    def asArray[T](prop: T): js.Array[T] = js.native
    def asArray[T](prop: js.Array[T]): js.Array[T] = js.native
    
    /**
      * Converts the provided date string into a javascript Date instance.
      * 
      * @param {string} prop
      * @returns {Date}
      * 
      * @memberOf X2JS
      */
    def asDateTime(prop: String): js.Date = js.native
    
    /**
      * Transforms a DOM tree to JavaScript objects.
      * 
      * @template T
      * @param {Node} domNode
      * @returns {T}
      * 
      * @memberOf X2JS
      */
    def dom2js[T](domNode: Document): T = js.native
    
    /**
      * Gets the current version of x2js. 
      * 
      * @returns {string}
      * 
      * @memberOf X2JS
      */
    def getVersion(): String = js.native
    
    /**
      * 
      * 
      * @template T
      * @param {T} jsObject
      * @returns {Node}
      * 
      * @memberOf X2JS
      */
    def js2dom[T](jsObject: T): Document = js.native
    
    /**
      * Transforms JavaScript objects into an XML string.
      * 
      * @template T
      * @param {T} json
      * @returns {string}
      * 
      * @memberOf X2JS
      */
    def js2xml[T](json: T): String = js.native
    
    /**
      * Converts the provided date value to a valid XML string.
      * 
      * @param {(Date | number)} dt
      * @returns {string}
      * 
      * @memberOf X2JS
      */
    def toXmlDateTime(dt: js.Date): String = js.native
    def toXmlDateTime(dt: Double): String = js.native
    
    /**
      * Transformns an XML string into DOM-tree
      * 
      * @param {string} xml
      * @returns {Node}
      * 
      * @memberOf X2JS
      */
    def xml2dom(xml: String): Document = js.native
    
    /**
      * Transformns an XML string into JavaScript objects.
      * 
      * @template T
      * @param {string} xml
      * @returns {T}
      * 
      * @memberOf X2JS
      */
    def xml2js[T](xml: String): T = js.native
  }
}
