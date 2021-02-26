package typingsSlinky.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePathMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/base-path", "BasePath")
  @js.native
  class BasePath () extends StObject {
    
    def add(fileName: String): Unit = js.native
    
    var basePaths: js.Any = js.native
    
    def reset(): Unit = js.native
    
    def trim(fileName: String): String = js.native
  }
  /* static members */
  object BasePath {
    
    @JSImport("typedoc/dist/lib/converter/utils/base-path", "BasePath.normalize")
    @js.native
    def normalize(path: String): String = js.native
  }
}
