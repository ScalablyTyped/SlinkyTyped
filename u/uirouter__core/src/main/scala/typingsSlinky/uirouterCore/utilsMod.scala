package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.anon.Configuration
import typingsSlinky.uirouterCore.anon.Hash
import typingsSlinky.uirouterCore.anon.Instantiable
import typingsSlinky.uirouterCore.anon.InstantiableLocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.routerMod.UIRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@uirouter/core/lib/vanilla/utils", "buildUrl")
  @js.native
  def buildUrl(loc: LocationServices): String = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/utils", "getParams")
  @js.native
  def getParams(queryString: String): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/utils", "keyValsToObjectR")
  @js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/utils", "locationPluginFactory")
  @js.native
  def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, Configuration] = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/utils", "parseUrl")
  @js.native
  def parseUrl(url: String): Hash = js.native
}
