package typingsSlinky.turistFetch

import typingsSlinky.nodeFetch.mod.Response
import typingsSlinky.turistFetch.agentWrapperMod.default
import typingsSlinky.turistFetch.typesMod.FetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redirectMod {
  
  @JSImport("@turist/fetch/dist/redirect", "isRedirect")
  @js.native
  def isRedirect(v: Double): Boolean = js.native
  
  @JSImport("@turist/fetch/dist/redirect", "makeRedirectOpts")
  @js.native
  def makeRedirectOpts(res: Response, opts: FetchOptions, agentWrapper: default): js.Tuple2[String, FetchOptions] = js.native
}
