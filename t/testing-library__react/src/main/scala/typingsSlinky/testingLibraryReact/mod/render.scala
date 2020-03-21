package typingsSlinky.testingLibraryReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.testingLibraryDom.getQueriesForElementMod.Queries
import typingsSlinky.testingLibraryReact.OmitRenderOptionsreadonly
import typingsSlinky.testingLibraryReact.RenderResultreadonlygetAl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "render")
@js.native
object render extends js.Object {
  def apply(ui: ReactElement): RenderResultreadonlygetAl = js.native
  def apply(ui: ReactElement, options: OmitRenderOptionsreadonly): RenderResultreadonlygetAl = js.native
  def apply[Q /* <: Queries */](ui: ReactElement, options: RenderOptions[Q]): RenderResult[Q] = js.native
}

