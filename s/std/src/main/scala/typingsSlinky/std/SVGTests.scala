package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGTests extends StObject {
  
  val requiredExtensions: org.scalajs.dom.raw.SVGStringList = js.native
  
  val systemLanguage: org.scalajs.dom.raw.SVGStringList = js.native
}
object SVGTests {
  
  @scala.inline
  def apply(
    requiredExtensions: org.scalajs.dom.raw.SVGStringList,
    systemLanguage: org.scalajs.dom.raw.SVGStringList
  ): org.scalajs.dom.raw.SVGTests = {
    val __obj = js.Dynamic.literal(requiredExtensions = requiredExtensions.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGTests]
  }
  
  @scala.inline
  implicit class SVGTestsMutableBuilder[Self <: org.scalajs.dom.raw.SVGTests] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredExtensions(value: org.scalajs.dom.raw.SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguage(value: org.scalajs.dom.raw.SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
  }
}
