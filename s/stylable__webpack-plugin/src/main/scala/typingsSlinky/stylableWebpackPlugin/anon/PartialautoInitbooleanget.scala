package typingsSlinky.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoInit :boolean,   getAutoInitModule :any | undefined,   globalInjection :(p : string): string | undefined}> */
@js.native
trait PartialautoInitbooleanget extends StObject {
  
  var autoInit: js.UndefOr[Boolean] = js.native
  
  var getAutoInitModule: js.UndefOr[js.Any] = js.native
  
  var globalInjection: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
}
object PartialautoInitbooleanget {
  
  @scala.inline
  def apply(): PartialautoInitbooleanget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoInitbooleanget]
  }
  
  @scala.inline
  implicit class PartialautoInitbooleangetMutableBuilder[Self <: PartialautoInitbooleanget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoInit(value: Boolean): Self = StObject.set(x, "autoInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInitUndefined: Self = StObject.set(x, "autoInit", js.undefined)
    
    @scala.inline
    def setGetAutoInitModule(value: js.Any): Self = StObject.set(x, "getAutoInitModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAutoInitModuleUndefined: Self = StObject.set(x, "getAutoInitModule", js.undefined)
    
    @scala.inline
    def setGlobalInjection(value: /* p */ String => String): Self = StObject.set(x, "globalInjection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGlobalInjectionUndefined: Self = StObject.set(x, "globalInjection", js.undefined)
  }
}
