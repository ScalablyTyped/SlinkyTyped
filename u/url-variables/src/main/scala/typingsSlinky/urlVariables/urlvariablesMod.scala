package typingsSlinky.urlVariables

import typingsSlinky.urlVariables.dictionaryMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("url-variables/lib/URLVariables", JSImport.Namespace)
@js.native
object urlvariablesMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class URLVariables () extends Dictionary[String] {
    /**
      * Construct from a URL-encoded string.
      *
      * The {@link decode decode()} method is automatically called to convert the string to properties of the {@link URLVariables} object.
      *
      * @param str A URL-encoded string containing name/value pairs.
      */
    def this(str: String) = this()
    
    /**
      * @hidden
      */
    var _Parse: js.Any = js.native
  }
  @js.native
  object URLVariables extends js.Object {
    
    def parse[T](str: String): T = js.native
    def parse[T](str: String, autoCase: Boolean): T = js.native
    
    def stringify[T](obj: T): String = js.native
    
    type Iterator = typingsSlinky.tstl.hashMapMod.HashMap.Iterator[String, String]
    
    type ReverseIterator = typingsSlinky.tstl.hashMapMod.HashMap.ReverseIterator[String, String]
  }
}
