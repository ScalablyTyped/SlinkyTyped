package typingsSlinky.testingLibraryReact

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.prettyFormat.mod.OptionsReceived
import typingsSlinky.prettyFormat.typesMod.NewPlugin
import typingsSlinky.testingLibraryDom.anon.Interval
import typingsSlinky.testingLibraryDom.anon.PartialConfig
import typingsSlinky.testingLibraryDom.configMod.Config
import typingsSlinky.testingLibraryDom.configMod.ConfigFn
import typingsSlinky.testingLibraryDom.eventsMod.CreateFunction
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
import typingsSlinky.testingLibraryDom.suggestionsMod.Method
import typingsSlinky.testingLibraryDom.suggestionsMod.Suggestion
import typingsSlinky.testingLibraryDom.suggestionsMod.Variant
import typingsSlinky.testingLibraryDom.waitForMod.waitForOptions
import typingsSlinky.testingLibraryReact.anon.FnCall
import typingsSlinky.testingLibraryReact.anon.OmitRenderOptionsreadonly
import typingsSlinky.testingLibraryReact.anon.RenderResultreadonlygetAl
import typingsSlinky.testingLibraryReact.mod.RenderOptions
import typingsSlinky.testingLibraryReact.mod.RenderResult
import typingsSlinky.testingLibraryReact.testingLibraryReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pureMod {
  
  @JSImport("@testing-library/react/types/pure", "act")
  @js.native
  val act: FnCall | (js.Function1[/* callback */ js.Function0[Unit], Unit]) = js.native
  
  @JSImport("@testing-library/react/types/pure", "buildQueries")
  @js.native
  def buildQueries[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
  
  @JSImport("@testing-library/react/types/pure", "cleanup")
  @js.native
  def cleanup(): Unit = js.native
  
  @JSImport("@testing-library/react/types/pure", "computeHeadingLevel")
  @js.native
  def computeHeadingLevel(element: Element): js.UndefOr[Double] = js.native
  
  @JSImport("@testing-library/react/types/pure", "configure")
  @js.native
  def configure(configDelta: PartialConfig): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "configure")
  @js.native
  def configure(configDelta: ConfigFn): Unit = js.native
  
  @JSImport("@testing-library/react/types/pure", "createEvent")
  @js.native
  val createEvent: CreateObject with CreateFunction = js.native
  
  @JSImport("@testing-library/react/types/pure", "findAllByAltText")
  @js.native
  val findAllByAltText: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findAllByDisplayValue")
  @js.native
  val findAllByDisplayValue: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findAllByLabelText")
  @js.native
  val findAllByLabelText: FindAllByText_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "findAllByPlaceholderText")
  @js.native
  val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findAllByRole")
  @js.native
  val findAllByRole: FindAllByRole_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "findAllByTestId")
  @js.native
  val findAllByTestId: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findAllByText")
  @js.native
  val findAllByText: FindAllByText_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "findAllByTitle")
  @js.native
  val findAllByTitle: FindAllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findByAltText")
  @js.native
  val findByAltText: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findByDisplayValue")
  @js.native
  val findByDisplayValue: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findByLabelText")
  @js.native
  val findByLabelText: FindByText_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "findByPlaceholderText")
  @js.native
  val findByPlaceholderText: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findByRole")
  @js.native
  val findByRole: FindByRole_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "findByTestId")
  @js.native
  val findByTestId: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "findByText")
  @js.native
  val findByText: FindByText_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "findByTitle")
  @js.native
  val findByTitle: FindByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "fireEvent")
  @js.native
  val fireEvent: FireFunction with FireObject = js.native
  
  @JSImport("@testing-library/react/types/pure", "getAllByAltText")
  @js.native
  val getAllByAltText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getAllByDisplayValue")
  @js.native
  val getAllByDisplayValue: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getAllByLabelText")
  @js.native
  val getAllByLabelText: AllByText = js.native
  
  @JSImport("@testing-library/react/types/pure", "getAllByPlaceholderText")
  @js.native
  val getAllByPlaceholderText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getAllByRole")
  @js.native
  val getAllByRole: AllByRole = js.native
  
  @JSImport("@testing-library/react/types/pure", "getAllByTestId")
  @js.native
  val getAllByTestId: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getAllByText")
  @js.native
  val getAllByText: AllByText = js.native
  
  @JSImport("@testing-library/react/types/pure", "getAllByTitle")
  @js.native
  val getAllByTitle: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getByAltText")
  @js.native
  val getByAltText: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getByDisplayValue")
  @js.native
  val getByDisplayValue: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getByLabelText")
  @js.native
  val getByLabelText: GetByText_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "getByPlaceholderText")
  @js.native
  val getByPlaceholderText: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getByRole")
  @js.native
  val getByRole: GetByRole_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "getByTestId")
  @js.native
  val getByTestId: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getByText")
  @js.native
  val getByText: GetByText_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "getByTitle")
  @js.native
  val getByTitle: GetByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "getConfig")
  @js.native
  def getConfig(): Config = js.native
  
  @JSImport("@testing-library/react/types/pure", "getDefaultNormalizer")
  @js.native
  def getDefaultNormalizer(): NormalizerFn = js.native
  @JSImport("@testing-library/react/types/pure", "getDefaultNormalizer")
  @js.native
  def getDefaultNormalizer(options: DefaultNormalizerOptions): NormalizerFn = js.native
  
  @JSImport("@testing-library/react/types/pure", "getElementError")
  @js.native
  def getElementError(message: String, container: HTMLElement): js.Error = js.native
  
  @JSImport("@testing-library/react/types/pure", "getNodeText")
  @js.native
  def getNodeText(node: HTMLElement): String = js.native
  
  @JSImport("@testing-library/react/types/pure", "getQueriesForElement")
  @js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  @JSImport("@testing-library/react/types/pure", "getQueriesForElement")
  @js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  
  @JSImport("@testing-library/react/types/pure", "getRoles")
  @js.native
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = js.native
  
  @JSImport("@testing-library/react/types/pure", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/react/types/pure", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: js.UndefOr[scala.Nothing], method: Method): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/react/types/pure", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/react/types/pure", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = js.native
  
  @JSImport("@testing-library/react/types/pure", "isInaccessible")
  @js.native
  def isInaccessible(element: Element): Boolean = js.native
  
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: Element): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: Double): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: Double): Unit = js.native
  @JSImport("@testing-library/react/types/pure", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
  
  @JSImport("@testing-library/react/types/pure", "logRoles")
  @js.native
  def logRoles(container: HTMLElement): String = js.native
  
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/react/types/pure", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  
  object prettyFormat {
    
    /**
      * Returns a presentation string of your `val` object
      * @param val any potential JavaScript object
      * @param options Custom settings
      */
    @JSImport("@testing-library/react/types/pure", "prettyFormat")
    @js.native
    def apply(`val`: js.Any): String = js.native
    @JSImport("@testing-library/react/types/pure", "prettyFormat")
    @js.native
    def apply(`val`: js.Any, options: typingsSlinky.prettyFormat.typesMod.OptionsReceived): String = js.native
    
    object plugins {
      
      @JSImport("@testing-library/react/types/pure", "prettyFormat.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/react/types/pure", "prettyFormat.plugins.AsymmetricMatcher")
      @js.native
      def AsymmetricMatcher: NewPlugin = js.native
      @scala.inline
      def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react/types/pure", "prettyFormat.plugins.ConvertAnsi")
      @js.native
      def ConvertAnsi: NewPlugin = js.native
      @scala.inline
      def ConvertAnsi_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertAnsi")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react/types/pure", "prettyFormat.plugins.DOMCollection")
      @js.native
      def DOMCollection: NewPlugin = js.native
      @scala.inline
      def DOMCollection_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react/types/pure", "prettyFormat.plugins.DOMElement")
      @js.native
      def DOMElement: NewPlugin = js.native
      @scala.inline
      def DOMElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react/types/pure", "prettyFormat.plugins.Immutable")
      @js.native
      def Immutable: NewPlugin = js.native
      @scala.inline
      def Immutable_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react/types/pure", "prettyFormat.plugins.ReactElement")
      @js.native
      def ReactElement: NewPlugin = js.native
      @scala.inline
      def ReactElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/react/types/pure", "prettyFormat.plugins.ReactTestComponent")
      @js.native
      def ReactTestComponent: NewPlugin = js.native
      @scala.inline
      def ReactTestComponent_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
    }
  }
  
  object queries {
    
    @JSImport("@testing-library/react/types/pure", "queries.findAllByAltText")
    @js.native
    val findAllByAltText: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findAllByDisplayValue")
    @js.native
    val findAllByDisplayValue: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findAllByLabelText")
    @js.native
    val findAllByLabelText: FindAllByText_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findAllByPlaceholderText")
    @js.native
    val findAllByPlaceholderText: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findAllByRole")
    @js.native
    val findAllByRole: FindAllByRole_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findAllByTestId")
    @js.native
    val findAllByTestId: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findAllByText")
    @js.native
    val findAllByText: FindAllByText_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findAllByTitle")
    @js.native
    val findAllByTitle: FindAllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findByAltText")
    @js.native
    val findByAltText: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findByDisplayValue")
    @js.native
    val findByDisplayValue: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findByLabelText")
    @js.native
    val findByLabelText: FindByText_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findByPlaceholderText")
    @js.native
    val findByPlaceholderText: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findByRole")
    @js.native
    val findByRole: FindByRole_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findByTestId")
    @js.native
    val findByTestId: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findByText")
    @js.native
    val findByText: FindByText_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.findByTitle")
    @js.native
    val findByTitle: FindByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getAllByAltText")
    @js.native
    val getAllByAltText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getAllByDisplayValue")
    @js.native
    val getAllByDisplayValue: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getAllByLabelText")
    @js.native
    val getAllByLabelText: AllByText = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getAllByPlaceholderText")
    @js.native
    val getAllByPlaceholderText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getAllByRole")
    @js.native
    val getAllByRole: AllByRole = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getAllByTestId")
    @js.native
    val getAllByTestId: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getAllByText")
    @js.native
    val getAllByText: AllByText = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getAllByTitle")
    @js.native
    val getAllByTitle: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getByAltText")
    @js.native
    val getByAltText: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getByDisplayValue")
    @js.native
    val getByDisplayValue: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getByLabelText")
    @js.native
    val getByLabelText: GetByText_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getByPlaceholderText")
    @js.native
    val getByPlaceholderText: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getByRole")
    @js.native
    val getByRole: GetByRole_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getByTestId")
    @js.native
    val getByTestId: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getByText")
    @js.native
    val getByText: GetByText_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.getByTitle")
    @js.native
    val getByTitle: GetByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryAllByAltText")
    @js.native
    val queryAllByAltText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryAllByDisplayValue")
    @js.native
    val queryAllByDisplayValue: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryAllByLabelText")
    @js.native
    val queryAllByLabelText: AllByText = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryAllByPlaceholderText")
    @js.native
    val queryAllByPlaceholderText: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryAllByRole")
    @js.native
    val queryAllByRole: AllByRole = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryAllByTestId")
    @js.native
    val queryAllByTestId: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryAllByText")
    @js.native
    val queryAllByText: AllByText = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryAllByTitle")
    @js.native
    val queryAllByTitle: AllByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryByAltText")
    @js.native
    val queryByAltText: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryByDisplayValue")
    @js.native
    val queryByDisplayValue: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryByLabelText")
    @js.native
    val queryByLabelText: QueryByText_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryByPlaceholderText")
    @js.native
    val queryByPlaceholderText: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryByRole")
    @js.native
    val queryByRole: QueryByRole_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryByTestId")
    @js.native
    val queryByTestId: QueryByBoundAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryByText")
    @js.native
    val queryByText: QueryByText_ = js.native
    
    @JSImport("@testing-library/react/types/pure", "queries.queryByTitle")
    @js.native
    val queryByTitle: QueryByBoundAttribute = js.native
  }
  
  @JSImport("@testing-library/react/types/pure", "queryAllByAltText")
  @js.native
  val queryAllByAltText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryAllByAttribute")
  @js.native
  val queryAllByAttribute: AllByAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryAllByDisplayValue")
  @js.native
  val queryAllByDisplayValue: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryAllByLabelText")
  @js.native
  val queryAllByLabelText: AllByText = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryAllByPlaceholderText")
  @js.native
  val queryAllByPlaceholderText: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryAllByRole")
  @js.native
  val queryAllByRole: AllByRole = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryAllByTestId")
  @js.native
  val queryAllByTestId: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryAllByText")
  @js.native
  val queryAllByText: AllByText = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryAllByTitle")
  @js.native
  val queryAllByTitle: AllByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByAltText")
  @js.native
  val queryByAltText: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByAttribute")
  @js.native
  val queryByAttribute: QueryByAttribute_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByDisplayValue")
  @js.native
  val queryByDisplayValue: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByLabelText")
  @js.native
  val queryByLabelText: QueryByText_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByPlaceholderText")
  @js.native
  val queryByPlaceholderText: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByRole")
  @js.native
  val queryByRole: QueryByRole_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByTestId")
  @js.native
  val queryByTestId: QueryByBoundAttribute = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByText")
  @js.native
  val queryByText: QueryByText_ = js.native
  
  @JSImport("@testing-library/react/types/pure", "queryByTitle")
  @js.native
  val queryByTitle: QueryByBoundAttribute = js.native
  
  object queryHelpers {
    
    @JSImport("@testing-library/react/types/pure", "queryHelpers.buildQueries")
    @js.native
    def buildQueries[Arguments /* <: js.Array[_] */](
      queryByAll: GetAllBy[Arguments],
      getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
      getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
    ): BuiltQueryMethods[Arguments] = js.native
    
    @JSImport("@testing-library/react/types/pure", "queryHelpers.getElementError")
    @js.native
    def getElementError(message: String, container: HTMLElement): js.Error = js.native
    
    @JSImport("@testing-library/react/types/pure", "queryHelpers.queryAllByAttribute")
    @js.native
    val queryAllByAttribute: AllByAttribute = js.native
    
    @JSImport("@testing-library/react/types/pure", "queryHelpers.queryByAttribute")
    @js.native
    val queryByAttribute: QueryByAttribute_ = js.native
  }
  
  @JSImport("@testing-library/react/types/pure", "render")
  @js.native
  def render(ui: ReactElement): RenderResultreadonlygetAl = js.native
  @JSImport("@testing-library/react/types/pure", "render")
  @js.native
  def render(ui: ReactElement, options: OmitRenderOptionsreadonly): RenderResultreadonlygetAl = js.native
  @JSImport("@testing-library/react/types/pure", "render")
  @js.native
  def render[Q /* <: Queries */](ui: ReactElement, options: RenderOptions[Q]): RenderResult[Q] = js.native
  
  /* Inlined @testing-library/dom.@testing-library/dom/types/screen.Screen<{ readonly getByLabelText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByLabelText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByLabelText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByPlaceholderText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByText :@testing-library/dom.@testing-library/dom/types/queries.GetByText,  readonly getAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly queryByText :@testing-library/dom.@testing-library/dom/types/queries.QueryByText,  readonly queryAllByText :@testing-library/dom.@testing-library/dom/types/queries.AllByText,  readonly findByText :@testing-library/dom.@testing-library/dom/types/queries.FindByText,  readonly findAllByText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByText,  readonly getByAltText :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByAltText :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByAltText :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByTitle :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTitle :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTitle :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByDisplayValue :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute,  readonly getByRole :@testing-library/dom.@testing-library/dom/types/queries.GetByRole,  readonly getAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly queryByRole :@testing-library/dom.@testing-library/dom/types/queries.QueryByRole,  readonly queryAllByRole :@testing-library/dom.@testing-library/dom/types/queries.AllByRole,  readonly findByRole :@testing-library/dom.@testing-library/dom/types/queries.FindByRole,  readonly findAllByRole :@testing-library/dom.@testing-library/dom/types/queries.FindAllByRole,  readonly getByTestId :@testing-library/dom.@testing-library/dom/types/queries.GetByBoundAttribute,  readonly getAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly queryByTestId :@testing-library/dom.@testing-library/dom/types/queries.QueryByBoundAttribute,  readonly queryAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.AllByBoundAttribute,  readonly findByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindByBoundAttribute,  readonly findAllByTestId :@testing-library/dom.@testing-library/dom/types/queries.FindAllByBoundAttribute}> */
  object screen {
    
    @JSImport("@testing-library/react/types/pure", "screen")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenience function for `pretty-dom` which also allows an array
      * of elements
      */
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: js.Array[Element | HTMLDocument]): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(
      element: js.Array[Element | HTMLDocument],
      maxLength: js.UndefOr[scala.Nothing],
      options: OptionsReceived
    ): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: Element): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: Element, maxLength: Double): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: HTMLDocument): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: HTMLDocument, maxLength: Double): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.debug")
    @js.native
    def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
    
    @JSImport("@testing-library/react/types/pure", "screen.findAllByAltText")
    @js.native
    def findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByAltText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findAllByDisplayValue")
    @js.native
    def findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByDisplayValue_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findAllByLabelText")
    @js.native
    def findAllByLabelText: BoundFunction[FindAllByText_] = js.native
    @scala.inline
    def findAllByLabelText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findAllByPlaceholderText")
    @js.native
    def findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByPlaceholderText_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findAllByRole")
    @js.native
    def findAllByRole: BoundFunction[FindAllByRole_] = js.native
    @scala.inline
    def findAllByRole_=(x: BoundFunction[FindAllByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findAllByTestId")
    @js.native
    def findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByTestId_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findAllByText")
    @js.native
    def findAllByText: BoundFunction[FindAllByText_] = js.native
    @scala.inline
    def findAllByText_=(x: BoundFunction[FindAllByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findAllByTitle")
    @js.native
    def findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
    @scala.inline
    def findAllByTitle_=(x: BoundFunction[FindAllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findByAltText")
    @js.native
    def findByAltText: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByAltText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findByDisplayValue")
    @js.native
    def findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByDisplayValue_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findByLabelText")
    @js.native
    def findByLabelText: BoundFunction[FindByText_] = js.native
    @scala.inline
    def findByLabelText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findByPlaceholderText")
    @js.native
    def findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByPlaceholderText_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findByRole")
    @js.native
    def findByRole: BoundFunction[FindByRole_] = js.native
    @scala.inline
    def findByRole_=(x: BoundFunction[FindByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findByTestId")
    @js.native
    def findByTestId: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByTestId_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findByText")
    @js.native
    def findByText: BoundFunction[FindByText_] = js.native
    @scala.inline
    def findByText_=(x: BoundFunction[FindByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.findByTitle")
    @js.native
    def findByTitle: BoundFunction[FindByBoundAttribute] = js.native
    @scala.inline
    def findByTitle_=(x: BoundFunction[FindByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getAllByAltText")
    @js.native
    def getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getAllByDisplayValue")
    @js.native
    def getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getAllByLabelText")
    @js.native
    def getAllByLabelText: BoundFunction[AllByText] = js.native
    @scala.inline
    def getAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getAllByPlaceholderText")
    @js.native
    def getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getAllByRole")
    @js.native
    def getAllByRole: BoundFunction[AllByRole] = js.native
    @scala.inline
    def getAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getAllByTestId")
    @js.native
    def getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getAllByText")
    @js.native
    def getAllByText: BoundFunction[AllByText] = js.native
    @scala.inline
    def getAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getAllByTitle")
    @js.native
    def getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def getAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getByAltText")
    @js.native
    def getByAltText: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByAltText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getByDisplayValue")
    @js.native
    def getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByDisplayValue_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getByLabelText")
    @js.native
    def getByLabelText: BoundFunction[GetByText_] = js.native
    @scala.inline
    def getByLabelText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getByPlaceholderText")
    @js.native
    def getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByPlaceholderText_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getByRole")
    @js.native
    def getByRole: BoundFunction[GetByRole_] = js.native
    @scala.inline
    def getByRole_=(x: BoundFunction[GetByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getByTestId")
    @js.native
    def getByTestId: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByTestId_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getByText")
    @js.native
    def getByText: BoundFunction[GetByText_] = js.native
    @scala.inline
    def getByText_=(x: BoundFunction[GetByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.getByTitle")
    @js.native
    def getByTitle: BoundFunction[GetByBoundAttribute] = js.native
    @scala.inline
    def getByTitle_=(x: BoundFunction[GetByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getByTitle")(x.asInstanceOf[js.Any])
    
    /**
      * Convenience function for `Testing Playground` which logs URL that
      * can be opened in a browser
      */
    @JSImport("@testing-library/react/types/pure", "screen.logTestingPlaygroundURL")
    @js.native
    def logTestingPlaygroundURL(): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.logTestingPlaygroundURL")
    @js.native
    def logTestingPlaygroundURL(element: Element): Unit = js.native
    @JSImport("@testing-library/react/types/pure", "screen.logTestingPlaygroundURL")
    @js.native
    def logTestingPlaygroundURL(element: HTMLDocument): Unit = js.native
    
    @JSImport("@testing-library/react/types/pure", "screen.queryAllByAltText")
    @js.native
    def queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByAltText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryAllByDisplayValue")
    @js.native
    def queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByDisplayValue_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryAllByLabelText")
    @js.native
    def queryAllByLabelText: BoundFunction[AllByText] = js.native
    @scala.inline
    def queryAllByLabelText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryAllByPlaceholderText")
    @js.native
    def queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByPlaceholderText_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryAllByRole")
    @js.native
    def queryAllByRole: BoundFunction[AllByRole] = js.native
    @scala.inline
    def queryAllByRole_=(x: BoundFunction[AllByRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryAllByTestId")
    @js.native
    def queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByTestId_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryAllByText")
    @js.native
    def queryAllByText: BoundFunction[AllByText] = js.native
    @scala.inline
    def queryAllByText_=(x: BoundFunction[AllByText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryAllByTitle")
    @js.native
    def queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
    @scala.inline
    def queryAllByTitle_=(x: BoundFunction[AllByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryAllByTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryByAltText")
    @js.native
    def queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByAltText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByAltText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryByDisplayValue")
    @js.native
    def queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByDisplayValue_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByDisplayValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryByLabelText")
    @js.native
    def queryByLabelText: BoundFunction[QueryByText_] = js.native
    @scala.inline
    def queryByLabelText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByLabelText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryByPlaceholderText")
    @js.native
    def queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByPlaceholderText_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByPlaceholderText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryByRole")
    @js.native
    def queryByRole: BoundFunction[QueryByRole_] = js.native
    @scala.inline
    def queryByRole_=(x: BoundFunction[QueryByRole_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByRole")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryByTestId")
    @js.native
    def queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByTestId_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTestId")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryByText")
    @js.native
    def queryByText: BoundFunction[QueryByText_] = js.native
    @scala.inline
    def queryByText_=(x: BoundFunction[QueryByText_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByText")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/react/types/pure", "screen.queryByTitle")
    @js.native
    def queryByTitle: BoundFunction[QueryByBoundAttribute] = js.native
    @scala.inline
    def queryByTitle_=(x: BoundFunction[QueryByBoundAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryByTitle")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@testing-library/react/types/pure", "waitFor")
  @js.native
  def waitFor[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = js.native
  @JSImport("@testing-library/react/types/pure", "waitFor")
  @js.native
  def waitFor[T](callback: js.Function0[T | js.Promise[T]], options: waitForOptions): js.Promise[T] = js.native
  
  @JSImport("@testing-library/react/types/pure", "waitForDomChange")
  @js.native
  def waitForDomChange(): js.Promise[_] = js.native
  @JSImport("@testing-library/react/types/pure", "waitForDomChange")
  @js.native
  def waitForDomChange(options: waitForOptions): js.Promise[_] = js.native
  
  @JSImport("@testing-library/react/types/pure", "waitForElement")
  @js.native
  def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = js.native
  @JSImport("@testing-library/react/types/pure", "waitForElement")
  @js.native
  def waitForElement[T](callback: js.Function0[T], options: waitForOptions): js.Promise[T] = js.native
  
  @JSImport("@testing-library/react/types/pure", "waitForElementToBeRemoved")
  @js.native
  def waitForElementToBeRemoved[T](callback: T): js.Promise[Unit] = js.native
  @JSImport("@testing-library/react/types/pure", "waitForElementToBeRemoved")
  @js.native
  def waitForElementToBeRemoved[T](callback: T, options: waitForOptions): js.Promise[Unit] = js.native
  @JSImport("@testing-library/react/types/pure", "waitForElementToBeRemoved")
  @js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[Unit] = js.native
  @JSImport("@testing-library/react/types/pure", "waitForElementToBeRemoved")
  @js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = js.native
  
  @JSImport("@testing-library/react/types/pure", "wait")
  @js.native
  def wait_(): js.Promise[Unit] = js.native
  @JSImport("@testing-library/react/types/pure", "wait")
  @js.native
  def wait_(callback: js.UndefOr[scala.Nothing], options: Interval): js.Promise[Unit] = js.native
  @JSImport("@testing-library/react/types/pure", "wait")
  @js.native
  def wait_(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  @JSImport("@testing-library/react/types/pure", "wait")
  @js.native
  def wait_(callback: js.Function0[Unit], options: Interval): js.Promise[Unit] = js.native
  
  /* was `typeof getQueriesForElement` */
  @JSImport("@testing-library/react/types/pure", "within")
  @js.native
  def within[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  @JSImport("@testing-library/react/types/pure", "within")
  @js.native
  def within[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
}
