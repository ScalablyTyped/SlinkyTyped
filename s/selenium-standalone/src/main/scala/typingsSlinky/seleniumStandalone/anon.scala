package typingsSlinky.seleniumStandalone

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictx
    extends /* x */ StringDictionary[js.Any] {
    
    var installPath: String = js.native
  }
  object Dictx {
    
    @scala.inline
    def apply(installPath: String): Dictx = {
      val __obj = js.Dynamic.literal(installPath = installPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx]
    }
    
    @scala.inline
    implicit class DictxMutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstallPath(value: String): Self = StObject.set(x, "installPath", value.asInstanceOf[js.Any])
    }
  }
}
