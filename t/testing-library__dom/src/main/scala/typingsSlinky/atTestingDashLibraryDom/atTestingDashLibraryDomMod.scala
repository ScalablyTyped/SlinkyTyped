package typingsSlinky.atTestingDashLibraryDom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atTestingDashLibraryDom.atTestingDashLibraryDomBooleans.`false`
import typingsSlinky.atTestingDashLibraryDom.configMod.Config
import typingsSlinky.atTestingDashLibraryDom.configMod.ConfigFn
import typingsSlinky.atTestingDashLibraryDom.eventsMod.CreateObject
import typingsSlinky.atTestingDashLibraryDom.eventsMod.FireFunction
import typingsSlinky.atTestingDashLibraryDom.eventsMod.FireObject
import typingsSlinky.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.BoundFunctions
import typingsSlinky.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.Queries
import typingsSlinky.atTestingDashLibraryDom.matchesMod.DefaultNormalizerOptions
import typingsSlinky.atTestingDashLibraryDom.matchesMod.NormalizerFn
import typingsSlinky.atTestingDashLibraryDom.queriesMod.AllByBoundAttribute
import typingsSlinky.atTestingDashLibraryDom.queriesMod.AllByRole
import typingsSlinky.atTestingDashLibraryDom.queriesMod.AllByText
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
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.AllByAttribute
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.BuiltQueryMethods
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.GetAllBy
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.QueryByAttribute
import typingsSlinky.atTestingDashLibraryDom.screenMod.Screen
import typingsSlinky.atTestingDashLibraryDom.waitDashForDashElementMod.WaitForElementOptions
import typingsSlinky.prettyDashFormat.prettyDashFormatMod.OptionsReceived
import typingsSlinky.std.HTMLDocument
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom", JSImport.Namespace)
@js.native
object atTestingDashLibraryDomMod extends js.Object {
  val createEvent: CreateObject = js.native
  val findAllByAltText: FindAllByBoundAttribute = js.native
  val findAllByDisplayValue: FindAllByBoundAttribute = js.native
  val findAllByLabelText: FindAllByText = js.native
  val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
  val findAllByRole: FindAllByRole = js.native
  val findAllByTestId: FindAllByBoundAttribute = js.native
  val findAllByText: FindAllByText = js.native
  val findAllByTitle: FindAllByBoundAttribute = js.native
  val findByAltText: FindByBoundAttribute = js.native
  val findByDisplayValue: FindByBoundAttribute = js.native
  val findByLabelText: FindByText = js.native
  val findByPlaceholderText: FindByBoundAttribute = js.native
  val findByRole: FindByRole = js.native
  val findByTestId: FindByBoundAttribute = js.native
  val findByText: FindByText = js.native
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
  val getByLabelText: GetByText = js.native
  val getByPlaceholderText: GetByBoundAttribute = js.native
  val getByRole: GetByRole = js.native
  val getByTestId: GetByBoundAttribute = js.native
  val getByText: GetByText = js.native
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
  val queryByAttribute: QueryByAttribute = js.native
  val queryByDisplayValue: QueryByBoundAttribute = js.native
  val queryByLabelText: QueryByText = js.native
  val queryByPlaceholderText: QueryByBoundAttribute = js.native
  val queryByRole: QueryByRole = js.native
  val queryByTestId: QueryByBoundAttribute = js.native
  val queryByText: QueryByText = js.native
  val queryByTitle: QueryByBoundAttribute = js.native
  val screen: Screen[Typeofqueries] = js.native
  def buildQueries[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
  def configure(configDelta: ConfigFn): Unit = js.native
  def configure(configDelta: Partial[Config]): Unit = js.native
  def getDefaultNormalizer(): NormalizerFn = js.native
  def getDefaultNormalizer(options: DefaultNormalizerOptions): NormalizerFn = js.native
  def getElementError(message: String, container: HTMLElement): js.Error = js.native
  def getNodeText(node: HTMLElement): String = js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = js.native
  def isInaccessible(element: Element): Boolean = js.native
  def logDOM(): Unit = js.native
  def logDOM(dom: typingsSlinky.std.Element): Unit = js.native
  def logDOM(dom: typingsSlinky.std.Element, maxLength: Double): Unit = js.native
  def logDOM(dom: typingsSlinky.std.Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def logDOM(dom: HTMLDocument): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: Double): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
  def logRoles(container: HTMLElement): String = js.native
  def prettyDOM(): String | `false` = js.native
  def prettyDOM(dom: typingsSlinky.std.Element): String | `false` = js.native
  def prettyDOM(dom: typingsSlinky.std.Element, maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: typingsSlinky.std.Element, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  def wait(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def wait(callback: js.Function0[Unit], options: Anon_Interval): js.Promise[Unit] = js.native
  def waitForDomChange(): js.Promise[_] = js.native
  def waitForDomChange(options: Anon_Container): js.Promise[_] = js.native
  def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitForElement[T](callback: js.Function0[T], options: WaitForElementOptions): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T], options: Anon_Container): js.Promise[T] = js.native
  @js.native
  object queries extends js.Object {
    val findAllByAltText: FindAllByBoundAttribute = js.native
    val findAllByDisplayValue: FindAllByBoundAttribute = js.native
    val findAllByLabelText: FindAllByText = js.native
    val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
    val findAllByRole: FindAllByRole = js.native
    val findAllByTestId: FindAllByBoundAttribute = js.native
    val findAllByText: FindAllByText = js.native
    val findAllByTitle: FindAllByBoundAttribute = js.native
    val findByAltText: FindByBoundAttribute = js.native
    val findByDisplayValue: FindByBoundAttribute = js.native
    val findByLabelText: FindByText = js.native
    val findByPlaceholderText: FindByBoundAttribute = js.native
    val findByRole: FindByRole = js.native
    val findByTestId: FindByBoundAttribute = js.native
    val findByText: FindByText = js.native
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
    val getByLabelText: GetByText = js.native
    val getByPlaceholderText: GetByBoundAttribute = js.native
    val getByRole: GetByRole = js.native
    val getByTestId: GetByBoundAttribute = js.native
    val getByText: GetByText = js.native
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
    val queryByLabelText: QueryByText = js.native
    val queryByPlaceholderText: QueryByBoundAttribute = js.native
    val queryByRole: QueryByRole = js.native
    val queryByTestId: QueryByBoundAttribute = js.native
    val queryByText: QueryByText = js.native
    val queryByTitle: QueryByBoundAttribute = js.native
  }
  
  @js.native
  object queryHelpers extends js.Object {
    val queryAllByAttribute: AllByAttribute = js.native
    val queryByAttribute: QueryByAttribute = js.native
    def buildQueries[Arguments /* <: js.Array[_] */](
      queryByAll: GetAllBy[Arguments],
      getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
      getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
    ): BuiltQueryMethods[Arguments] = js.native
    def getElementError(message: String, container: HTMLElement): js.Error = js.native
  }
  
  @js.native
  object within extends js.Object {
    def apply[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
    def apply[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  }
  
}

