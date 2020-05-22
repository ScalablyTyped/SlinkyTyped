package typingsSlinky.wordpressCompose

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressCompose.wordpressComposeStrings.setState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/compose/higher-order/with-state", JSImport.Namespace)
@js.native
object withStateMod extends js.Object {
  // prettier-ignore
  def default[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typingsSlinky.wordpressCompose.wordpressComposeStrings.default with TopLevel[SP]
  ): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, (/* keyof SP */ String) | setState]]
  ] = js.native
}

