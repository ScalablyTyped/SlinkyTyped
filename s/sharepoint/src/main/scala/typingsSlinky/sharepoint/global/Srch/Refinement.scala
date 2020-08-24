package typingsSlinky.sharepoint.global.Srch

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.Refinement")
@js.native
class Refinement protected ()
  extends typingsSlinky.sharepoint.Srch.Refinement {
  def this(elem: Element) = this()
}

/* static members */
@JSGlobal("Srch.Refinement")
@js.native
object Refinement extends js.Object {
  def createRefinementTextbox(name: String): Element = js.native
  def ensureUserSpecifiedRefinerValueHasWhiteSpaceQuotes(inputText: String): String = js.native
  /** Gets expanded state of the specified filter from cookie */
  def getExpanded(filterName: String): String = js.native
  def getRefinementLocalizedTitle(propertyName: String): String = js.native
  def getRefinementTitle(currentRefinemntControl: typingsSlinky.sharepoint.Srch.RefinementControl): String = js.native
  def multiRefinerSpecifyOtherFilterValue(
    refinerName: String,
    clientControl: typingsSlinky.sharepoint.Srch.Refinement,
    useContains: Boolean,
    useKQL: Boolean
  ): Unit = js.native
  /** Save expanded state of the specified filter to cookie */
  def setExpanded(filterName: String, value: String): Unit = js.native
  def submitMultiRefinement(
    name: String,
    control: typingsSlinky.sharepoint.Srch.Refinement,
    useContains: Boolean,
    useKQL: Boolean
  ): Unit = js.native
}

