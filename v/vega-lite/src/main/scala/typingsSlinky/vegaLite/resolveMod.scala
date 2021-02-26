package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channelMod.ScaleChannel
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.srcResolveMod.Resolve
import typingsSlinky.vegaLite.srcResolveMod.ResolveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  @JSImport("vega-lite/build/src/compile/resolve", "defaultScaleResolve")
  @js.native
  def defaultScaleResolve(channel: ScaleChannel, model: Model): ResolveMode = js.native
  
  @JSImport("vega-lite/build/src/compile/resolve", "parseGuideResolve")
  @js.native
  def parseGuideResolve(resolve: Resolve, channel: ScaleChannel): ResolveMode = js.native
}
