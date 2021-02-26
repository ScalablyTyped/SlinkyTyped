package typingsSlinky.wordpressCompose

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressCompose.wordpressComposeStrings.setState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withStateMod {
  
  // prettier-ignore
  @JSImport("@wordpress/compose/higher-order/with-state", JSImport.Default)
  @js.native
  def default[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typingsSlinky.wordpressCompose.wordpressComposeStrings.default with TopLevel[SP]
  ): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, (/* keyof SP */ String) | setState]]
  ] = js.native
}
