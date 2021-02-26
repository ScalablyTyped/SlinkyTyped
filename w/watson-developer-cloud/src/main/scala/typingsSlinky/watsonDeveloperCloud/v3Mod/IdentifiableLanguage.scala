package typingsSlinky.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IdentifiableLanguage. */
@js.native
trait IdentifiableLanguage extends StObject {
  
  /** The language code for an identifiable language. */
  var language: String = js.native
  
  /** The name of the identifiable language. */
  var name: String = js.native
}
object IdentifiableLanguage {
  
  @scala.inline
  def apply(language: String, name: String): IdentifiableLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiableLanguage]
  }
  
  @scala.inline
  implicit class IdentifiableLanguageMutableBuilder[Self <: IdentifiableLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
