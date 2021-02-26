package typingsSlinky.uifabricUtilities

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object irenderfunctionMod {
  
  type IRenderFunction[P] = js.Function2[
    /* props */ js.UndefOr[P], 
    /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[P], ReactElement | Null]], 
    ReactElement | Null
  ]
}
