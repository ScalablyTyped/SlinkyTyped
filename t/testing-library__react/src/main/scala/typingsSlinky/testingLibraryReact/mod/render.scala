package typingsSlinky.testingLibraryReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.testingLibraryDom.getQueriesForElementMod.Queries
import typingsSlinky.testingLibraryReact.anon.OmitRenderOptionsreadonly
import typingsSlinky.testingLibraryReact.anon.RenderResultreadonlygetAl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/react", "render")
@js.native
object render extends js.Object {
  
  def apply(ui: ReactElement): RenderResultreadonlygetAl = js.native
  def apply(ui: ReactElement, options: OmitRenderOptionsreadonly): RenderResultreadonlygetAl = js.native
  def apply[Q /* <: Queries */](ui: ReactElement, options: RenderOptions[Q]): RenderResult[Q] = js.native
}
