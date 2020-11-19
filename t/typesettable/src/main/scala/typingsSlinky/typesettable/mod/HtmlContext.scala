package typingsSlinky.typesettable.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable", "HtmlContext")
@js.native
class HtmlContext protected ()
  extends typingsSlinky.typesettable.contextsMod.HtmlContext {
  /**
    * @param element - The CSS font styles applied to `element` will determine the
    * size of text measurements. Also the default text block container.
    * @param className - added to new text blocks
    * @param addTitle - enable title attribute to be added to new text blocks.
    */
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, className: String) = this()
  def this(element: HTMLElement, className: js.UndefOr[scala.Nothing], addTitle: Boolean) = this()
  def this(element: HTMLElement, className: String, addTitle: Boolean) = this()
}
