package typingsSlinky.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.prettyFormat.mod.OptionsReceived
import typingsSlinky.testingLibraryDom.anon.Container
import typingsSlinky.testingLibraryDom.anon.Interval
import typingsSlinky.testingLibraryDom.anon.MutationObserverOptions
import typingsSlinky.testingLibraryDom.anon.PartialConfig
import typingsSlinky.testingLibraryDom.configMod.ConfigFn
import typingsSlinky.testingLibraryDom.eventsMod.CreateObject
import typingsSlinky.testingLibraryDom.eventsMod.FireFunction
import typingsSlinky.testingLibraryDom.eventsMod.FireObject
import typingsSlinky.testingLibraryDom.getQueriesForElementMod.BoundFunction
import typingsSlinky.testingLibraryDom.getQueriesForElementMod.BoundFunctions
import typingsSlinky.testingLibraryDom.getQueriesForElementMod.Queries
import typingsSlinky.testingLibraryDom.matchesMod.DefaultNormalizerOptions
import typingsSlinky.testingLibraryDom.matchesMod.NormalizerFn
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
import typingsSlinky.testingLibraryDom.queryHelpersMod.AllByAttribute
import typingsSlinky.testingLibraryDom.queryHelpersMod.BuiltQueryMethods
import typingsSlinky.testingLibraryDom.queryHelpersMod.GetAllBy
import typingsSlinky.testingLibraryDom.queryHelpersMod.QueryByAttribute_
import typingsSlinky.testingLibraryDom.testingLibraryDomBooleans.`false`
import typingsSlinky.testingLibraryDom.waitForElementMod.WaitForElementOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val createEvent: CreateObject = js.native
  val findAllByAltText: FindAllByBoundAttribute = js.native
  val findAllByDisplayValue: FindAllByBoundAttribute = js.native
  val findAllByLabelText: FindAllByText_ = js.native
  val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
  val findAllByRole: FindAllByRole_ = js.native
  val findAllByTestId: FindAllByBoundAttribute = js.native
  val findAllByText: FindAllByText_ = js.native
  val findAllByTitle: FindAllByBoundAttribute = js.native
  val findByAltText: FindByBoundAttribute = js.native
  val findByDisplayValue: FindByBoundAttribute = js.native
  val findByLabelText: FindByText_ = js.native
  val findByPlaceholderText: FindByBoundAttribute = js.native
  val findByRole: FindByRole_ = js.native
  val findByTestId: FindByBoundAttribute = js.native
  val findByText: FindByText_ = js.native
  val findByTitle: FindByBoundAttribute = js.native
  val fireEvent: FireFunction with FireObject = js.native
  val getAllByAltText: AllByBoundAttribute = js.native
  val getAllByDisplayValue: AllByBoundAttribute = js.native
  val getAllByLabelText: AllByText = js.native
  val getAllByPlaceholderText: AllByBoundAttribute = js.native
  val getAllByRole: AllByRole = js.native
  val getAllByTestId: AllByBoundAttribute = js.native
  val getAllByText: AllByText = js.native
  val getAllByTitle: AllByBoundAttribute = js.native
  val getByAltText: GetByBoundAttribute = js.native
  val getByDisplayValue: GetByBoundAttribute = js.native
  val getByLabelText: GetByText_ = js.native
  val getByPlaceholderText: GetByBoundAttribute = js.native
  val getByRole: GetByRole_ = js.native
  val getByTestId: GetByBoundAttribute = js.native
  val getByText: GetByText_ = js.native
  val getByTitle: GetByBoundAttribute = js.native
  val queryAllByAltText: AllByBoundAttribute = js.native
  val queryAllByAttribute: AllByAttribute = js.native
  val queryAllByDisplayValue: AllByBoundAttribute = js.native
  val queryAllByLabelText: AllByText = js.native
  val queryAllByPlaceholderText: AllByBoundAttribute = js.native
  val queryAllByRole: AllByRole = js.native
  val queryAllByTestId: AllByBoundAttribute = js.native
  val queryAllByText: AllByText = js.native
  val queryAllByTitle: AllByBoundAttribute = js.native
  val queryByAltText: QueryByBoundAttribute = js.native
  val queryByAttribute: QueryByAttribute_ = js.native
  val queryByDisplayValue: QueryByBoundAttribute = js.native
  val queryByLabelText: QueryByText_ = js.native
  val queryByPlaceholderText: QueryByBoundAttribute = js.native
  val queryByRole: QueryByRole_ = js.native
  val queryByTestId: QueryByBoundAttribute = js.native
  val queryByText: QueryByText_ = js.native
  val queryByTitle: QueryByBoundAttribute = js.native
  def buildQueries[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
  def configure(configDelta: PartialConfig): Unit = js.native
  def configure(configDelta: ConfigFn): Unit = js.native
  def getDefaultNormalizer(): NormalizerFn = js.native
  def getDefaultNormalizer(options: DefaultNormalizerOptions): NormalizerFn = js.native
  def getElementError(message: String, container: HTMLElement): js.Error = js.native
  def getNodeText(node: HTMLElement): String = js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = js.native
  def isInaccessible(element: Element): Boolean = js.native
  def logDOM(): Unit = js.native
  def logDOM(dom: Element): Unit = js.native
  def logDOM(dom: Element, maxLength: Double): Unit = js.native
  def logDOM(dom: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def logDOM(dom: HTMLDocument): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: Double): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
  def logRoles(container: HTMLElement): String = js.native
  def prettyDOM(): String | `false` = js.native
  def prettyDOM(dom: Element): String | `false` = js.native
  def prettyDOM(dom: Element, maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  def wait(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def wait(callback: js.Function0[Unit], options: Interval): js.Promise[Unit] = js.native
  def waitFor[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitFor[T](callback: js.Function0[T], options: Container): js.Promise[T] = js.native
  def waitForDomChange(): js.Promise[_] = js.native
  def waitForDomChange(options: MutationObserverOptions): js.Promise[_] = js.native
  def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitForElement[T](callback: js.Function0[T], options: WaitForElementOptions): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: T): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: T, options: Container): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T], options: Container): js.Promise[T] = js.native
  @js.native
  object queries extends js.Object {
    val findAllByAltText: FindAllByBoundAttribute = js.native
    val findAllByDisplayValue: FindAllByBoundAttribute = js.native
    val findAllByLabelText: FindAllByText_ = js.native
    val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
    val findAllByRole: FindAllByRole_ = js.native
    val findAllByTestId: FindAllByBoundAttribute = js.native
    val findAllByText: FindAllByText_ = js.native
    val findAllByTitle: FindAllByBoundAttribute = js.native
    val findByAltText: FindByBoundAttribute = js.native
    val findByDisplayValue: FindByBoundAttribute = js.native
    val findByLabelText: FindByText_ = js.native
    val findByPlaceholderText: FindByBoundAttribute = js.native
    val findByRole: FindByRole_ = js.native
    val findByTestId: FindByBoundAttribute = js.native
    val findByText: FindByText_ = js.native
    val findByTitle: FindByBoundAttribute = js.native
    val getAllByAltText: AllByBoundAttribute = js.native
    val getAllByDisplayValue: AllByBoundAttribute = js.native
    val getAllByLabelText: AllByText = js.native
    val getAllByPlaceholderText: AllByBoundAttribute = js.native
    val getAllByRole: AllByRole = js.native
    val getAllByTestId: AllByBoundAttribute = js.native
    val getAllByText: AllByText = js.native
    val getAllByTitle: AllByBoundAttribute = js.native
    val getByAltText: GetByBoundAttribute = js.native
    val getByDisplayValue: GetByBoundAttribute = js.native
    val getByLabelText: GetByText_ = js.native
    val getByPlaceholderText: GetByBoundAttribute = js.native
    val getByRole: GetByRole_ = js.native
    val getByTestId: GetByBoundAttribute = js.native
    val getByText: GetByText_ = js.native
    val getByTitle: GetByBoundAttribute = js.native
    val queryAllByAltText: AllByBoundAttribute = js.native
    val queryAllByDisplayValue: AllByBoundAttribute = js.native
    val queryAllByLabelText: AllByText = js.native
    val queryAllByPlaceholderText: AllByBoundAttribute = js.native
    val queryAllByRole: AllByRole = js.native
    val queryAllByTestId: AllByBoundAttribute = js.native
    val queryAllByText: AllByText = js.native
    val queryAllByTitle: AllByBoundAttribute = js.native
    val queryByAltText: QueryByBoundAttribute = js.native
    val queryByDisplayValue: QueryByBoundAttribute = js.native
    val queryByLabelText: QueryByText_ = js.native
    val queryByPlaceholderText: QueryByBoundAttribute = js.native
    val queryByRole: QueryByRole_ = js.native
    val queryByTestId: QueryByBoundAttribute = js.native
    val queryByText: QueryByText_ = js.native
    val queryByTitle: QueryByBoundAttribute = js.native
  }
  
  @js.native
  object queryHelpers extends js.Object {
    val queryAllByAttribute: AllByAttribute = js.native
    val queryByAttribute: QueryByAttribute_ = js.native
    def buildQueries[Arguments /* <: js.Array[_] */](
      queryByAll: GetAllBy[Arguments],
      getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
      getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
    ): BuiltQueryMethods[Arguments] = js.native
    def getElementError(message: String, container: HTMLElement): js.Error = js.native
  }
  
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
  
  @js.native
  object within extends js.Object {
    def apply[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
    def apply[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  }
  
}

