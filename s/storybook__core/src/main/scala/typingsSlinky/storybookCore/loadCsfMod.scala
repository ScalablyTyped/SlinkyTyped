package typingsSlinky.storybookCore

import typingsSlinky.node.NodeModule
import typingsSlinky.storybookCore.anon.ClientApi
import typingsSlinky.storybookCore.typesMod.Loadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/core/dist/client/preview/loadCsf", JSImport.Namespace)
@js.native
object loadCsfMod extends js.Object {
  
  def loadCsf(hasClientApiStoryStoreConfigApi: ClientApi): js.Function4[
    /* framework */ String, 
    /* loadable */ Loadable, 
    /* m */ NodeModule, 
    /* showDeprecationWarning */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
}
