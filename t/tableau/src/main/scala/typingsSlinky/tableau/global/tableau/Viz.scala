package typingsSlinky.tableau.global.tableau

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tableau.tableau.VizCreateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Viz")
@js.native
class Viz protected ()
  extends typingsSlinky.tableau.tableau.Viz {
  /**
    * Creates a new Tableau Viz inside of the given HTML container, which is typically a <div> element.
    * Each option as well as the options parameter is optional.
    * If there is already a Viz associated with the parentElement, an exception is thrown.
    * Before reusing the parentElement you must first call dispose().
    */
  def this(node: HTMLElement, url: String) = this()
  def this(node: HTMLElement, url: String, options: VizCreateOptions) = this()
}

