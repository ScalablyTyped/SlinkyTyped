package typingsSlinky.testingLibraryReact.anon

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import typingsSlinky.prettyFormat.mod.OptionsReceived
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @testing-library/react.@testing-library/react.RenderResult<{ readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute}> */
@js.native
trait RenderResultreadonlygetAl extends js.Object {
  
  def asFragment(): DocumentFragment = js.native
  
  var baseElement: Element = js.native
  
  var container: Element = js.native
  
  def debug(): Unit = js.native
  def debug(
    baseElement: js.UndefOr[scala.Nothing],
    maxLength: js.UndefOr[scala.Nothing],
    options: OptionsReceived
  ): Unit = js.native
  def debug(baseElement: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
  def debug(baseElement: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(baseElement: js.Array[Element | DocumentFragment]): Unit = js.native
  def debug(
    baseElement: js.Array[Element | DocumentFragment],
    maxLength: js.UndefOr[scala.Nothing],
    options: OptionsReceived
  ): Unit = js.native
  def debug(baseElement: js.Array[Element | DocumentFragment], maxLength: Double): Unit = js.native
  def debug(baseElement: js.Array[Element | DocumentFragment], maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(baseElement: DocumentFragment): Unit = js.native
  def debug(baseElement: DocumentFragment, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def debug(baseElement: DocumentFragment, maxLength: Double): Unit = js.native
  def debug(baseElement: DocumentFragment, maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(baseElement: Element): Unit = js.native
  def debug(baseElement: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def debug(baseElement: Element, maxLength: Double): Unit = js.native
  def debug(baseElement: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  
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
  
  def rerender(ui: ReactElement): Unit = js.native
  
  def unmount(): Boolean = js.native
}
