package typingsSlinky.uirouterAngularjs.mod

import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internalapi
  */
class UIRouter ()
  extends typingsSlinky.uirouterCore.mod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}

