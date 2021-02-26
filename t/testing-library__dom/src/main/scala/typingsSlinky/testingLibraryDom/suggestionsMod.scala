package typingsSlinky.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.testingLibraryDom.testingLibraryDomStrings.alttext_
import typingsSlinky.testingLibraryDom.testingLibraryDomStrings.displayvalue_
import typingsSlinky.testingLibraryDom.testingLibraryDomStrings.labeltext_
import typingsSlinky.testingLibraryDom.testingLibraryDomStrings.placeholdertext_
import typingsSlinky.testingLibraryDom.testingLibraryDomStrings.role_
import typingsSlinky.testingLibraryDom.testingLibraryDomStrings.testid_
import typingsSlinky.testingLibraryDom.testingLibraryDomStrings.text_
import typingsSlinky.testingLibraryDom.testingLibraryDomStrings.title_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionsMod {
  
  @JSImport("@testing-library/dom/types/suggestions", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/dom/types/suggestions", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: js.UndefOr[scala.Nothing], method: Method): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/dom/types/suggestions", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = js.native
  @JSImport("@testing-library/dom/types/suggestions", "getSuggestedQuery")
  @js.native
  def getSuggestedQuery(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Role
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.role_
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.LabelText
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.labeltext_
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.PlaceholderText
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.placeholdertext_
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Text
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.text_
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.DisplayValue
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.displayvalue_
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.AltText
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.alttext_
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Title
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.title_
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.TestId
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.testid_
  */
  trait Method extends StObject
  object Method {
    
    @scala.inline
    def AltText: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.AltText = "AltText".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.AltText]
    
    @scala.inline
    def DisplayValue: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.DisplayValue = "DisplayValue".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.DisplayValue]
    
    @scala.inline
    def LabelText: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.LabelText = "LabelText".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.LabelText]
    
    @scala.inline
    def PlaceholderText: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.PlaceholderText = "PlaceholderText".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.PlaceholderText]
    
    @scala.inline
    def Role: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Role = "Role".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Role]
    
    @scala.inline
    def TestId: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.TestId = "TestId".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.TestId]
    
    @scala.inline
    def Text: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Text = "Text".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Text]
    
    @scala.inline
    def Title: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Title = "Title".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.Title]
    
    @scala.inline
    def alttext: alttext_ = "alttext".asInstanceOf[alttext_]
    
    @scala.inline
    def displayvalue: displayvalue_ = "displayvalue".asInstanceOf[displayvalue_]
    
    @scala.inline
    def labeltext: labeltext_ = "labeltext".asInstanceOf[labeltext_]
    
    @scala.inline
    def placeholdertext: placeholdertext_ = "placeholdertext".asInstanceOf[placeholdertext_]
    
    @scala.inline
    def role: role_ = "role".asInstanceOf[role_]
    
    @scala.inline
    def testid: testid_ = "testid".asInstanceOf[testid_]
    
    @scala.inline
    def text: text_ = "text".asInstanceOf[text_]
    
    @scala.inline
    def title: title_ = "title".asInstanceOf[title_]
  }
  
  type QueryArgs = js.Tuple2[String, js.UndefOr[QueryOptions]]
  
  type QueryOptions = StringDictionary[js.RegExp | Boolean]
  
  @js.native
  trait Suggestion extends StObject {
    
    var queryArgs: QueryArgs = js.native
    
    var queryMethod: String = js.native
    
    var queryName: String = js.native
    
    var variant: String = js.native
    
    var warning: js.UndefOr[String] = js.native
  }
  object Suggestion {
    
    @scala.inline
    def apply(queryArgs: QueryArgs, queryMethod: String, queryName: String, variant: String): Suggestion = {
      val __obj = js.Dynamic.literal(queryArgs = queryArgs.asInstanceOf[js.Any], queryMethod = queryMethod.asInstanceOf[js.Any], queryName = queryName.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggestion]
    }
    
    @scala.inline
    implicit class SuggestionMutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryArgs(value: QueryArgs): Self = StObject.set(x, "queryArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryMethod(value: String): Self = StObject.set(x, "queryMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryName(value: String): Self = StObject.set(x, "queryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.get
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.getAll
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.query
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.queryAll
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.find
    - typingsSlinky.testingLibraryDom.testingLibraryDomStrings.findAll
  */
  trait Variant extends StObject
  object Variant {
    
    @scala.inline
    def find: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.find = "find".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.find]
    
    @scala.inline
    def findAll: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.findAll = "findAll".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.findAll]
    
    @scala.inline
    def get: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.get = "get".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.get]
    
    @scala.inline
    def getAll: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.getAll = "getAll".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.getAll]
    
    @scala.inline
    def query: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.query = "query".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.query]
    
    @scala.inline
    def queryAll: typingsSlinky.testingLibraryDom.testingLibraryDomStrings.queryAll = "queryAll".asInstanceOf[typingsSlinky.testingLibraryDom.testingLibraryDomStrings.queryAll]
  }
}
