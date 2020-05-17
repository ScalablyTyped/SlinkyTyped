package typingsSlinky.uirouterAngularjs.mod.core

import typingsSlinky.uirouterCore.anon.Configuration
import typingsSlinky.uirouterCore.anon.Instantiable
import typingsSlinky.uirouterCore.anon.InstantiableLocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.locationPluginFactory")
@js.native
object locationPluginFactory extends js.Object {
  def apply(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ typingsSlinky.uirouterCore.routerMod.UIRouter, Configuration] = js.native
}

