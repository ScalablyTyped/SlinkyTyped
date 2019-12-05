package typingsSlinky.atTestingDashLibraryDom

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atTestingDashLibraryDom.matchesMod.Matcher
import typingsSlinky.atTestingDashLibraryDom.matchesMod.MatcherOptions
import typingsSlinky.atTestingDashLibraryDom.queriesMod.AllByBoundAttribute
import typingsSlinky.atTestingDashLibraryDom.queriesMod.AllByRole
import typingsSlinky.atTestingDashLibraryDom.queriesMod.AllByText
import typingsSlinky.atTestingDashLibraryDom.queriesMod.ByRoleOptions
import typingsSlinky.atTestingDashLibraryDom.queriesMod.FindAllByBoundAttribute
import typingsSlinky.atTestingDashLibraryDom.queriesMod.FindAllByRole
import typingsSlinky.atTestingDashLibraryDom.queriesMod.FindAllByText
import typingsSlinky.atTestingDashLibraryDom.queriesMod.FindByBoundAttribute
import typingsSlinky.atTestingDashLibraryDom.queriesMod.FindByRole
import typingsSlinky.atTestingDashLibraryDom.queriesMod.FindByText
import typingsSlinky.atTestingDashLibraryDom.queriesMod.GetByBoundAttribute
import typingsSlinky.atTestingDashLibraryDom.queriesMod.GetByRole
import typingsSlinky.atTestingDashLibraryDom.queriesMod.GetByText
import typingsSlinky.atTestingDashLibraryDom.queriesMod.QueryByBoundAttribute
import typingsSlinky.atTestingDashLibraryDom.queriesMod.QueryByRole
import typingsSlinky.atTestingDashLibraryDom.queriesMod.QueryByText
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.SelectorMatcherOptions
import typingsSlinky.atTestingDashLibraryDom.waitDashForDashElementMod.WaitForElementOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofqueries extends js.Object {
  val findAllByAltText: FindAllByBoundAttribute
  val findAllByDisplayValue: FindAllByBoundAttribute
  val findAllByLabelText: FindAllByText
  val findAllByPlaceholderText: FindAllByBoundAttribute
  val findAllByRole: FindAllByRole
  val findAllByTestId: FindAllByBoundAttribute
  val findAllByText: FindAllByText
  val findAllByTitle: FindAllByBoundAttribute
  val findByAltText: FindByBoundAttribute
  val findByDisplayValue: FindByBoundAttribute
  val findByLabelText: FindByText
  val findByPlaceholderText: FindByBoundAttribute
  val findByRole: FindByRole
  val findByTestId: FindByBoundAttribute
  val findByText: FindByText
  val findByTitle: FindByBoundAttribute
  val getAllByAltText: AllByBoundAttribute
  val getAllByDisplayValue: AllByBoundAttribute
  val getAllByLabelText: AllByText
  val getAllByPlaceholderText: AllByBoundAttribute
  val getAllByRole: AllByRole
  val getAllByTestId: AllByBoundAttribute
  val getAllByText: AllByText
  val getAllByTitle: AllByBoundAttribute
  val getByAltText: GetByBoundAttribute
  val getByDisplayValue: GetByBoundAttribute
  val getByLabelText: GetByText
  val getByPlaceholderText: GetByBoundAttribute
  val getByRole: GetByRole
  val getByTestId: GetByBoundAttribute
  val getByText: GetByText
  val getByTitle: GetByBoundAttribute
  val queryAllByAltText: AllByBoundAttribute
  val queryAllByDisplayValue: AllByBoundAttribute
  val queryAllByLabelText: AllByText
  val queryAllByPlaceholderText: AllByBoundAttribute
  val queryAllByRole: AllByRole
  val queryAllByTestId: AllByBoundAttribute
  val queryAllByText: AllByText
  val queryAllByTitle: AllByBoundAttribute
  val queryByAltText: QueryByBoundAttribute
  val queryByDisplayValue: QueryByBoundAttribute
  val queryByLabelText: QueryByText
  val queryByPlaceholderText: QueryByBoundAttribute
  val queryByRole: QueryByRole
  val queryByTestId: QueryByBoundAttribute
  val queryByText: QueryByText
  val queryByTitle: QueryByBoundAttribute
}

object Typeofqueries {
  @scala.inline
  def apply(
    findAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    getAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
    getAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement],
    getAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
    getAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    getByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    getByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement,
    getByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    getByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement,
    getByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    getByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement,
    getByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    queryAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
    queryAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement],
    queryAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
    queryAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
    queryByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
    queryByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null,
    queryByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
    queryByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement | Null,
    queryByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
    queryByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null,
    queryByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
  ): Typeofqueries = {
    val __obj = js.Dynamic.literal(findAllByAltText = js.Any.fromFunction4(findAllByAltText), findAllByDisplayValue = js.Any.fromFunction4(findAllByDisplayValue), findAllByLabelText = js.Any.fromFunction4(findAllByLabelText), findAllByPlaceholderText = js.Any.fromFunction4(findAllByPlaceholderText), findAllByRole = js.Any.fromFunction4(findAllByRole), findAllByTestId = js.Any.fromFunction4(findAllByTestId), findAllByText = js.Any.fromFunction4(findAllByText), findAllByTitle = js.Any.fromFunction4(findAllByTitle), findByAltText = js.Any.fromFunction4(findByAltText), findByDisplayValue = js.Any.fromFunction4(findByDisplayValue), findByLabelText = js.Any.fromFunction4(findByLabelText), findByPlaceholderText = js.Any.fromFunction4(findByPlaceholderText), findByRole = js.Any.fromFunction4(findByRole), findByTestId = js.Any.fromFunction4(findByTestId), findByText = js.Any.fromFunction4(findByText), findByTitle = js.Any.fromFunction4(findByTitle), getAllByAltText = js.Any.fromFunction3(getAllByAltText), getAllByDisplayValue = js.Any.fromFunction3(getAllByDisplayValue), getAllByLabelText = js.Any.fromFunction3(getAllByLabelText), getAllByPlaceholderText = js.Any.fromFunction3(getAllByPlaceholderText), getAllByRole = js.Any.fromFunction3(getAllByRole), getAllByTestId = js.Any.fromFunction3(getAllByTestId), getAllByText = js.Any.fromFunction3(getAllByText), getAllByTitle = js.Any.fromFunction3(getAllByTitle), getByAltText = js.Any.fromFunction3(getByAltText), getByDisplayValue = js.Any.fromFunction3(getByDisplayValue), getByLabelText = js.Any.fromFunction3(getByLabelText), getByPlaceholderText = js.Any.fromFunction3(getByPlaceholderText), getByRole = js.Any.fromFunction3(getByRole), getByTestId = js.Any.fromFunction3(getByTestId), getByText = js.Any.fromFunction3(getByText), getByTitle = js.Any.fromFunction3(getByTitle), queryAllByAltText = js.Any.fromFunction3(queryAllByAltText), queryAllByDisplayValue = js.Any.fromFunction3(queryAllByDisplayValue), queryAllByLabelText = js.Any.fromFunction3(queryAllByLabelText), queryAllByPlaceholderText = js.Any.fromFunction3(queryAllByPlaceholderText), queryAllByRole = js.Any.fromFunction3(queryAllByRole), queryAllByTestId = js.Any.fromFunction3(queryAllByTestId), queryAllByText = js.Any.fromFunction3(queryAllByText), queryAllByTitle = js.Any.fromFunction3(queryAllByTitle), queryByAltText = js.Any.fromFunction3(queryByAltText), queryByDisplayValue = js.Any.fromFunction3(queryByDisplayValue), queryByLabelText = js.Any.fromFunction3(queryByLabelText), queryByPlaceholderText = js.Any.fromFunction3(queryByPlaceholderText), queryByRole = js.Any.fromFunction3(queryByRole), queryByTestId = js.Any.fromFunction3(queryByTestId), queryByText = js.Any.fromFunction3(queryByText), queryByTitle = js.Any.fromFunction3(queryByTitle))
  
    __obj.asInstanceOf[Typeofqueries]
  }
}

