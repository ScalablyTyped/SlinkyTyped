package typingsSlinky.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/dom/types/role-helpers", JSImport.Namespace)
@js.native
object roleHelpersMod extends js.Object {
  
  def computeHeadingLevel(element: Element): js.UndefOr[Double] = js.native
  
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = js.native
  
  def isInaccessible(element: Element): Boolean = js.native
  
  def logRoles(container: HTMLElement): String = js.native
}
