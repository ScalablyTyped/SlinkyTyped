package typingsSlinky.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends StObject {
  
  var provider: typingsSlinky.storybookApi.providerMod.Provider = js.native
}
object Provider {
  
  @scala.inline
  def apply(provider: typingsSlinky.storybookApi.providerMod.Provider): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: typingsSlinky.storybookApi.providerMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
