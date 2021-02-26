package typingsSlinky.swag

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.swag.anon.TypeofHandlebars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("swag", JSImport.Namespace)
  @js.native
  val ^ : SwagStatic = js.native
  
  @js.native
  trait SwagStatic extends StObject {
    
    def registerHelpers(handlebars: TypeofHandlebars): Unit = js.native
  }
  object SwagStatic {
    
    @scala.inline
    def apply(registerHelpers: TypeofHandlebars => Unit): SwagStatic = {
      val __obj = js.Dynamic.literal(registerHelpers = js.Any.fromFunction1(registerHelpers))
      __obj.asInstanceOf[SwagStatic]
    }
    
    @scala.inline
    implicit class SwagStaticMutableBuilder[Self <: SwagStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegisterHelpers(value: TypeofHandlebars => Unit): Self = StObject.set(x, "registerHelpers", js.Any.fromFunction1(value))
    }
  }
  
  type _To = SwagStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SwagStatic = ^
}
