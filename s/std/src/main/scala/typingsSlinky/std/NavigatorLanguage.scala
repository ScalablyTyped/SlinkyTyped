package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorLanguage extends StObject {
  
  val language: java.lang.String = js.native
  
  val languages: js.Array[java.lang.String] = js.native
}
object NavigatorLanguage {
  
  @scala.inline
  def apply(language: java.lang.String, languages: js.Array[java.lang.String]): org.scalajs.dom.raw.NavigatorLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.NavigatorLanguage]
  }
  
  @scala.inline
  implicit class NavigatorLanguageMutableBuilder[Self <: org.scalajs.dom.raw.NavigatorLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: java.lang.String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: js.Array[java.lang.String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: java.lang.String*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
