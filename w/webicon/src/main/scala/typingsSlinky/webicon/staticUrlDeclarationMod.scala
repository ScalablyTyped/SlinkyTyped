package typingsSlinky.webicon

import typingsSlinky.webicon.urlDeclarationBaseMod.UrlDeclarationBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticUrlDeclarationMod {
  
  @js.native
  trait StaticUrlDeclaration extends UrlDeclarationBase {
    
    @JSName("url")
    var url_StaticUrlDeclaration: js.UndefOr[String] = js.native
  }
  object StaticUrlDeclaration {
    
    @scala.inline
    def apply(): StaticUrlDeclaration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticUrlDeclaration]
    }
    
    @scala.inline
    implicit class StaticUrlDeclarationMutableBuilder[Self <: StaticUrlDeclaration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
