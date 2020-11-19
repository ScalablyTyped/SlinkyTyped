package typingsSlinky.uifabricUtilities

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/IRenderFunction", JSImport.Namespace)
@js.native
object irenderfunctionMod extends js.Object {
  
  type IRenderFunction[P] = js.Function2[
    /* props */ js.UndefOr[P], 
    /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[P], ReactElement | Null]], 
    ReactElement | Null
  ]
}
