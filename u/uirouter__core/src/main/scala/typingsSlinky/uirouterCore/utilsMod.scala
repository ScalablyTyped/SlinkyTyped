package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.anon.Configuration
import typingsSlinky.uirouterCore.anon.Hash
import typingsSlinky.uirouterCore.anon.Instantiable
import typingsSlinky.uirouterCore.anon.InstantiableLocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def buildUrl(loc: LocationServices): String = js.native
  def getParams(queryString: String): js.Any = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, Configuration] = js.native
  def parseUrl(url: String): Hash = js.native
}

