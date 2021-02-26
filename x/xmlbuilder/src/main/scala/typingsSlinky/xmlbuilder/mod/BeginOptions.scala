package typingsSlinky.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the options used while creating an XML document with the `begin`
  * function.
  */
@js.native
trait BeginOptions extends StObject {
  
  /** 
    * Whether decorator strings will be ignored when converting JS 
    * objects
    */
  var ignoreDecorators: js.UndefOr[Boolean] = js.native
  
  /**
    * A character to replace invalid characters in all values. This also
    * disables character validation.
    */
  var invalidCharReplacement: js.UndefOr[String] = js.native
  
  /**
    * Whether attributes with null values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether nodes with null values will be kept or ignored
    */
  var keepNullNodes: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether existing html entities are encoded
    */
  var noDoubleEncoding: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether values will be validated and escaped or returned as is
    */
  var noValidation: js.UndefOr[Boolean] = js.native
  
  /** 
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[Boolean] = js.native
  
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.native
  
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in XMLStringWriter 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter | WriterOptions] = js.native
}
object BeginOptions {
  
  @scala.inline
  def apply(): BeginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginOptions]
  }
  
  @scala.inline
  implicit class BeginOptionsMutableBuilder[Self <: BeginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreDecorators(value: Boolean): Self = StObject.set(x, "ignoreDecorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreDecoratorsUndefined: Self = StObject.set(x, "ignoreDecorators", js.undefined)
    
    @scala.inline
    def setInvalidCharReplacement(value: String): Self = StObject.set(x, "invalidCharReplacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidCharReplacementUndefined: Self = StObject.set(x, "invalidCharReplacement", js.undefined)
    
    @scala.inline
    def setKeepNullAttributes(value: Boolean): Self = StObject.set(x, "keepNullAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepNullAttributesUndefined: Self = StObject.set(x, "keepNullAttributes", js.undefined)
    
    @scala.inline
    def setKeepNullNodes(value: Boolean): Self = StObject.set(x, "keepNullNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepNullNodesUndefined: Self = StObject.set(x, "keepNullNodes", js.undefined)
    
    @scala.inline
    def setNoDoubleEncoding(value: Boolean): Self = StObject.set(x, "noDoubleEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDoubleEncodingUndefined: Self = StObject.set(x, "noDoubleEncoding", js.undefined)
    
    @scala.inline
    def setNoValidation(value: Boolean): Self = StObject.set(x, "noValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoValidationUndefined: Self = StObject.set(x, "noValidation", js.undefined)
    
    @scala.inline
    def setSeparateArrayItems(value: Boolean): Self = StObject.set(x, "separateArrayItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparateArrayItemsUndefined: Self = StObject.set(x, "separateArrayItems", js.undefined)
    
    @scala.inline
    def setStringify(value: XMLStringifier): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    
    @scala.inline
    def setWriter(value: XMLWriter | WriterOptions): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
