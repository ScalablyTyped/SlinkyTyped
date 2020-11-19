package typingsSlinky.uirouterCore.mod

import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internal
  */
class UIRouter ()
  extends typingsSlinky.uirouterCore.routerMod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: js.UndefOr[scala.Nothing], locationConfig: LocationConfig) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}
