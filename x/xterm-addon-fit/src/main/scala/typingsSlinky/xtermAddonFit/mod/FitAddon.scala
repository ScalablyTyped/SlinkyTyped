package typingsSlinky.xtermAddonFit.mod

import typingsSlinky.xterm.mod.ITerminalAddon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xterm-addon-fit", "FitAddon")
@js.native
/**
  * Creates a new fit addon.
  */
class FitAddon () extends ITerminalAddon {
  
  /**
    * Resizes the terminal to the dimensions of its containing element.
    */
  def fit(): Unit = js.native
  
  /**
    * Gets the proposed dimensions that will be used for a fit.
    */
  def proposeDimensions(): ITerminalDimensions = js.native
}
