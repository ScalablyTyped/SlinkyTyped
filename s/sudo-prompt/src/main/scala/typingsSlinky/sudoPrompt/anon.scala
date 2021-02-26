package typingsSlinky.sudoPrompt

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Env extends StObject {
    
    var env: js.UndefOr[StringDictionary[String]] = js.native
    
    var icns: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object Env {
    
    @scala.inline
    def apply(): Env = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Env]
    }
    
    @scala.inline
    implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setIcns(value: String): Self = StObject.set(x, "icns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcnsUndefined: Self = StObject.set(x, "icns", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
