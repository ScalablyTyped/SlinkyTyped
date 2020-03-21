package typingsSlinky.testingLibraryVue.mod

import typingsSlinky.prettyFormat.mod.OptionsReceived
import typingsSlinky.std.Element
import typingsSlinky.std.HTMLDocument
import typingsSlinky.testingLibraryDom.getQueriesForElementMod.BoundFunction
import typingsSlinky.testingLibraryDom.queriesMod.AllByBoundAttribute
import typingsSlinky.testingLibraryDom.queriesMod.AllByRole
import typingsSlinky.testingLibraryDom.queriesMod.AllByText
import typingsSlinky.testingLibraryDom.queriesMod.FindAllByBoundAttribute
import typingsSlinky.testingLibraryDom.queriesMod.FindAllByRole_
import typingsSlinky.testingLibraryDom.queriesMod.FindAllByText_
import typingsSlinky.testingLibraryDom.queriesMod.FindByBoundAttribute
import typingsSlinky.testingLibraryDom.queriesMod.FindByRole_
import typingsSlinky.testingLibraryDom.queriesMod.FindByText_
import typingsSlinky.testingLibraryDom.queriesMod.GetByBoundAttribute
import typingsSlinky.testingLibraryDom.queriesMod.GetByRole_
import typingsSlinky.testingLibraryDom.queriesMod.GetByText_
import typingsSlinky.testingLibraryDom.queriesMod.QueryByBoundAttribute
import typingsSlinky.testingLibraryDom.queriesMod.QueryByRole_
import typingsSlinky.testingLibraryDom.queriesMod.QueryByText_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "screen")
@js.native
object screen extends js.Object {
  var findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
  var findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
  var findAllByLabelText: BoundFunction[FindAllByText_] = js.native
  var findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
  var findAllByRole: BoundFunction[FindAllByRole_] = js.native
  var findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
  var findAllByText: BoundFunction[FindAllByText_] = js.native
  var findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
  var findByAltText: BoundFunction[FindByBoundAttribute] = js.native
  var findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
  var findByLabelText: BoundFunction[FindByText_] = js.native
  var findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
  var findByRole: BoundFunction[FindByRole_] = js.native
  var findByTestId: BoundFunction[FindByBoundAttribute] = js.native
  var findByText: BoundFunction[FindByText_] = js.native
  var findByTitle: BoundFunction[FindByBoundAttribute] = js.native
  var getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
  var getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
  var getAllByLabelText: BoundFunction[AllByText] = js.native
  var getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
  var getAllByRole: BoundFunction[AllByRole] = js.native
  var getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
  var getAllByText: BoundFunction[AllByText] = js.native
  var getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
  var getByAltText: BoundFunction[GetByBoundAttribute] = js.native
  var getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
  var getByLabelText: BoundFunction[GetByText_] = js.native
  var getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
  var getByRole: BoundFunction[GetByRole_] = js.native
  var getByTestId: BoundFunction[GetByBoundAttribute] = js.native
  var getByText: BoundFunction[GetByText_] = js.native
  var getByTitle: BoundFunction[GetByBoundAttribute] = js.native
  var queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
  var queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
  var queryAllByLabelText: BoundFunction[AllByText] = js.native
  var queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
  var queryAllByRole: BoundFunction[AllByRole] = js.native
  var queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
  var queryAllByText: BoundFunction[AllByText] = js.native
  var queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
  var queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
  var queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
  var queryByLabelText: BoundFunction[QueryByText_] = js.native
  var queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
  var queryByRole: BoundFunction[QueryByRole_] = js.native
  var queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
  var queryByText: BoundFunction[QueryByText_] = js.native
  var queryByTitle: BoundFunction[QueryByBoundAttribute] = js.native
  def debug(element: js.Array[Element | HTMLDocument]): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = js.native
  /**
    * Convenience function for `pretty-dom` which also allows an array
    * of elements
    */
  def debug(element: Element): Unit = js.native
  def debug(element: Element, maxLength: Double): Unit = js.native
  def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(element: HTMLDocument): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
}

