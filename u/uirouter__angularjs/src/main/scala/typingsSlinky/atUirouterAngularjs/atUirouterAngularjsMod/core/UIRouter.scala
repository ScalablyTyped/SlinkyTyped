package typingsSlinky.atUirouterAngularjs.atUirouterAngularjsMod.core

import typingsSlinky.atUirouterCore.libCommonCoreservicesMod.LocationConfig
import typingsSlinky.atUirouterCore.libCommonCoreservicesMod.LocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internalapi
  */
class UIRouter ()
  extends typingsSlinky.atUirouterCore.atUirouterCoreMod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}

