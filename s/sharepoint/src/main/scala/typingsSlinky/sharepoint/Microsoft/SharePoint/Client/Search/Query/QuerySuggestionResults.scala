package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySuggestionResults extends ClientValueObject {
  
  def get_peopleNames(): js.Array[String] = js.native
  
  def get_personalResults(): js.Array[PersonalResultSuggestion] = js.native
  
  def get_queries(): js.Array[QuerySuggestionQuery] = js.native
  
  def set_peopleNames(value: js.Array[String]): Unit = js.native
  
  def set_personalResults(value: js.Array[PersonalResultSuggestion]): Unit = js.native
  
  def set_queries(value: js.Array[QuerySuggestionQuery]): Unit = js.native
}
object QuerySuggestionResults {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_peopleNames: () => js.Array[String],
    get_personalResults: () => js.Array[PersonalResultSuggestion],
    get_queries: () => js.Array[QuerySuggestionQuery],
    get_typeId: () => String,
    set_peopleNames: js.Array[String] => Unit,
    set_personalResults: js.Array[PersonalResultSuggestion] => Unit,
    set_queries: js.Array[QuerySuggestionQuery] => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): QuerySuggestionResults = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_peopleNames = js.Any.fromFunction0(get_peopleNames), get_personalResults = js.Any.fromFunction0(get_personalResults), get_queries = js.Any.fromFunction0(get_queries), get_typeId = js.Any.fromFunction0(get_typeId), set_peopleNames = js.Any.fromFunction1(set_peopleNames), set_personalResults = js.Any.fromFunction1(set_personalResults), set_queries = js.Any.fromFunction1(set_queries), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[QuerySuggestionResults]
  }
  
  @scala.inline
  implicit class QuerySuggestionResultsMutableBuilder[Self <: QuerySuggestionResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_peopleNames(value: () => js.Array[String]): Self = StObject.set(x, "get_peopleNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_personalResults(value: () => js.Array[PersonalResultSuggestion]): Self = StObject.set(x, "get_personalResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queries(value: () => js.Array[QuerySuggestionQuery]): Self = StObject.set(x, "get_queries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_peopleNames(value: js.Array[String] => Unit): Self = StObject.set(x, "set_peopleNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_personalResults(value: js.Array[PersonalResultSuggestion] => Unit): Self = StObject.set(x, "set_personalResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_queries(value: js.Array[QuerySuggestionQuery] => Unit): Self = StObject.set(x, "set_queries", js.Any.fromFunction1(value))
  }
}
