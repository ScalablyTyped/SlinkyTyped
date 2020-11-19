package typingsSlinky.testingLibraryReact.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.testingLibraryDom.suggestionsMod.Method
import typingsSlinky.testingLibraryDom.suggestionsMod.Suggestion
import typingsSlinky.testingLibraryDom.suggestionsMod.Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/react", "getSuggestedQuery")
@js.native
object getSuggestedQuery extends js.Object {
  
  def apply(element: HTMLElement): js.UndefOr[Suggestion] = js.native
  def apply(element: HTMLElement, variant: js.UndefOr[scala.Nothing], method: Method): js.UndefOr[Suggestion] = js.native
  def apply(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = js.native
  def apply(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = js.native
}
