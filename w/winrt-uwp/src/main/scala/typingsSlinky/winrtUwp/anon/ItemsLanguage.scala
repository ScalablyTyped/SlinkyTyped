package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Globalization.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsLanguage extends StObject {
  
  /** An array of Language items that start at startIndex in the HttpLanguageHeaderValueCollection . */ var items: Language = js.native
  
  /** The number of items retrieved. */ var returnValue: Double = js.native
}
object ItemsLanguage {
  
  @scala.inline
  def apply(items: Language, returnValue: Double): ItemsLanguage = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsLanguage]
  }
  
  @scala.inline
  implicit class ItemsLanguageMutableBuilder[Self <: ItemsLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: Language): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
