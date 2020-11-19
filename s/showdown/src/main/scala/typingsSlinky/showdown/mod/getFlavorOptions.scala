package typingsSlinky.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("showdown", "getFlavorOptions")
@js.native
object getFlavorOptions extends js.Object {
  
  /**
    * Get the options of a specified flavor. Returns undefined if the flavor was not found.
    *
    * @param name - Name of the flavor.
    * @returns Returns options object of the given flavor `name`.
    */
  def apply(name: Flavor): js.UndefOr[ShowdownOptions] = js.native
}
