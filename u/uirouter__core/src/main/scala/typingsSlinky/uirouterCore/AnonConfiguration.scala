package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfiguration extends js.Object {
  var configuration: LocationConfig
  var name: String
  var service: LocationServices
  def dispose(router: UIRouter): Unit
}

object AnonConfiguration {
  @scala.inline
  def apply(configuration: LocationConfig, dispose: UIRouter => Unit, name: String, service: LocationServices): AnonConfiguration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfiguration]
  }
}

