package typingsSlinky.uirouterAngularjs.mod.core

import typingsSlinky.uirouterCore.AnonConfiguration
import typingsSlinky.uirouterCore.AnonInstantiable
import typingsSlinky.uirouterCore.AnonInstantiableLocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.locationPluginFactory")
@js.native
object locationPluginFactory extends js.Object {
  def apply(
    name: String,
    isHtml5: Boolean,
    serviceClass: AnonInstantiable,
    configurationClass: AnonInstantiableLocationConfig
  ): js.Function1[/* uiRouter */ typingsSlinky.uirouterCore.routerMod.UIRouter, AnonConfiguration] = js.native
}

