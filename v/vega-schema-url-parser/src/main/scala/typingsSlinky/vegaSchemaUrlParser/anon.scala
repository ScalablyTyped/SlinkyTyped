package typingsSlinky.vegaSchemaUrlParser

import typingsSlinky.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.`vega-lite`
import typingsSlinky.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.vega
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Library extends StObject {
    
    var library: vega | `vega-lite` = js.native
    
    var version: String = js.native
  }
  object Library {
    
    @scala.inline
    def apply(library: vega | `vega-lite`, version: String): Library = {
      val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Library]
    }
    
    @scala.inline
    implicit class LibraryMutableBuilder[Self <: Library] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLibrary(value: vega | `vega-lite`): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
