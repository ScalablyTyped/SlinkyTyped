package typingsSlinky.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bindingsversion extends StObject {
  
  var bindings_version: String = js.native
  
  var lang: String = js.native
  
  var lang_version: String = js.native
  
  var platform: String = js.native
  
  var publisher: String = js.native
  
  var uname: String = js.native
}
object Bindingsversion {
  
  @scala.inline
  def apply(
    bindings_version: String,
    lang: String,
    lang_version: String,
    platform: String,
    publisher: String,
    uname: String
  ): Bindingsversion = {
    val __obj = js.Dynamic.literal(bindings_version = bindings_version.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], lang_version = lang_version.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bindingsversion]
  }
  
  @scala.inline
  implicit class BindingsversionMutableBuilder[Self <: Bindingsversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings_version(value: String): Self = StObject.set(x, "bindings_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang_version(value: String): Self = StObject.set(x, "lang_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
  }
}
