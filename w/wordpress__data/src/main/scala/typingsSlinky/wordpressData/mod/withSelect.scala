package typingsSlinky.wordpressData.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/data", "withSelect")
@js.native
object withSelect extends js.Object {
  
  def apply[SP, P, IP](
    mapSelectToProps: js.Function2[/* sel */ js.Function1[/* key */ String, SelectorMap], /* ownProps */ P with IP, SP]
  ): js.Function1[/* component */ ReactComponentClass[P with IP with SP], ReactComponentClass[P]] = js.native
}
