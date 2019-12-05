package typingsSlinky.atTestingDashLibraryReact.atTestingDashLibraryReactMod

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderResult[Q /* <: Queries */] extends js.Object {
  var baseElement: HTMLElement = js.native
  var container: HTMLElement = js.native
  def asFragment(): DocumentFragment = js.native
  def debug(): Unit = js.native
  def debug(baseElement: js.Array[typingsSlinky.std.HTMLElement | typingsSlinky.std.DocumentFragment]): Unit = js.native
  def debug(baseElement: typingsSlinky.std.DocumentFragment): Unit = js.native
  def debug(baseElement: typingsSlinky.std.HTMLElement): Unit = js.native
  def rerender(ui: ReactElement): Unit = js.native
  def unmount(): Boolean = js.native
}

