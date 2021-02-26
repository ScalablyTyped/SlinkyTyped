package typingsSlinky.storybookCore

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookCore.anon.ClientApi
import typingsSlinky.storybookCore.typesMod.Loadable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadCsfMod {
  
  @JSImport("@storybook/core/dist/client/preview/loadCsf", "loadCsf")
  @js.native
  def loadCsf(hasClientApiStoryStoreConfigApi: ClientApi): js.Function4[
    /* framework */ String, 
    /* loadable */ Loadable, 
    /* m */ NodeModule, 
    /* showDeprecationWarning */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
}
