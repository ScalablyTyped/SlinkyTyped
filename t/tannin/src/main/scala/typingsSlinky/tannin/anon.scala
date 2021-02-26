package typingsSlinky.tannin

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tannin.mod.TanninDomainMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] {
    
    @JSName("")
    var _empty: TanninDomainMetadata | (js.Tuple2[String, String]) = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(_empty: TanninDomainMetadata | (js.Tuple2[String, String])): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_empty(value: TanninDomainMetadata | (js.Tuple2[String, String])): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
}
