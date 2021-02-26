package typingsSlinky.stripJsonComments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Strip comments from JSON. Lets you use comments in your JSON files!
  It will replace single-line comments `//` and multi-line comments `/ **\/` with whitespace. This allows JSON error positions to remain as close as possible to the original source.
  @param jsonString - Accepts a string with JSON.
  @returns A JSON string without comments.
  @example
  ```
  const json = `{
  	// Rainbows
  	"unicorn": "cake"
  }`;
  JSON.parse(stripJsonComments(json));
  //=> {unicorn: 'cake'}
  ```
  */
  @JSImport("strip-json-comments", JSImport.Namespace)
  @js.native
  def apply(jsonString: String): String = js.native
  @JSImport("strip-json-comments", JSImport.Namespace)
  @js.native
  def apply(jsonString: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Replace comments with whitespace instead of stripping them entirely.
    		@default true
    		*/
    val whitespace: js.UndefOr[Boolean] = js.native
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
      def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
}
