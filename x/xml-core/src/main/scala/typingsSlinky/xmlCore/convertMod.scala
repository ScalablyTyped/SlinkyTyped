package typingsSlinky.xmlCore

import typingsSlinky.std.BufferSource
import typingsSlinky.xmlCore.typesMod.XmlBufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-core/dist/types/convert", JSImport.Namespace)
@js.native
object convertMod extends js.Object {
  
  @js.native
  class Convert () extends js.Object
  /* static members */
  @js.native
  object Convert extends js.Object {
    
    /* protected */ def Base64Padding(base64: String): String = js.native
    
    def FromBase64(base64Text: String): js.typedarray.Uint8Array = js.native
    
    def FromBase64Url(base64url: String): js.typedarray.Uint8Array = js.native
    
    def FromBinary(text: String): js.typedarray.Uint8Array = js.native
    
    /**
      * Converts Date to string
      *
      * @static
      * @param {Date} dateTime
      * @returns {string}
      *
      * @memberOf Convert
      */
    def FromDateTime(dateTime: js.Date): String = js.native
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} hexString
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    def FromHex(hexString: String): js.typedarray.Uint8Array = js.native
    
    def FromString(str: String): js.typedarray.Uint8Array = js.native
    def FromString(str: String, enc: XmlBufferEncoding): js.typedarray.Uint8Array = js.native
    
    def FromUtf8String(text: String): js.typedarray.Uint8Array = js.native
    
    def ToBase64(buf: js.typedarray.Uint8Array): String = js.native
    
    def ToBase64Url(data: js.typedarray.Uint8Array): String = js.native
    
    def ToBinary(buffer: js.typedarray.Uint8Array): String = js.native
    
    /**
      * Converts string to Date
      *
      * @static
      * @param {string} dateTime
      * @returns {Date}
      *
      * @memberOf Convert
      */
    def ToDateTime(dateTime: String): js.Date = js.native
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    def ToHex(buffer: js.typedarray.Uint8Array): String = js.native
    
    def ToString(buffer: BufferSource): String = js.native
    def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
    
    def ToUtf8String(buffer: js.typedarray.Uint8Array): String = js.native
  }
}
