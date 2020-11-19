package typingsSlinky.typesettable.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.typesettable.abstractMeasurerMod.IDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable", "HtmlUtils")
@js.native
class HtmlUtils ()
  extends typingsSlinky.typesettable.contextsMod.HtmlUtils
/* static members */
@JSImport("typesettable", "HtmlUtils")
@js.native
object HtmlUtils extends js.Object {
  
  /**
    * Adds the variadic classnames to the Element
    */
  def addClasses(element: Element, classNames: String*): Unit = js.native
  
  /**
    * Appends an HTML element with the specified tag name to the provided element.
    * The variadic classnames are added to the new element.
    *
    * Returns the new element.
    */
  def append(element: Element, tagName: String, classNames: String*): HTMLElement = js.native
  
  /**
    * Creates and returns a new HTMLElement with the attached classnames.
    */
  def create(tagName: String, classNames: String*): HTMLElement = js.native
  
  /**
    * Returns the width/height of HTMLElement's bounding box
    */
  def getDimensions(element: HTMLElement): IDimensions = js.native
}
