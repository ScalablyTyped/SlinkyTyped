package typingsSlinky.uirouterCore.anon

import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.routerMod.UIRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends StObject {
  
  var configuration: LocationConfig = js.native
  
  def dispose(router: UIRouter): Unit = js.native
  
  var name: String = js.native
  
  var service: LocationServices = js.native
}
object Configuration {
  
  @scala.inline
  def apply(configuration: LocationConfig, dispose: UIRouter => Unit, name: String, service: LocationServices): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: LocationConfig): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: UIRouter => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: LocationServices): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
