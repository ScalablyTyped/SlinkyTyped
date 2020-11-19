package typingsSlinky.uirouterCore.mod

import typingsSlinky.uirouterCore.anon.Configuration
import typingsSlinky.uirouterCore.anon.Instantiable
import typingsSlinky.uirouterCore.anon.InstantiableLocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "locationPluginFactory")
@js.native
object locationPluginFactory extends js.Object {
  
  def apply(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ typingsSlinky.uirouterCore.routerMod.UIRouter, Configuration] = js.native
}
