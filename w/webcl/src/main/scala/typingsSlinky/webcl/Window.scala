package typingsSlinky.webcl

import typingsSlinky.webcl.WEBCL.WebCL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var webcl: WebCL = js.native
}
object Window {
  
  @scala.inline
  def apply(webcl: WebCL): Window = {
    val __obj = js.Dynamic.literal(webcl = webcl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebcl(value: WebCL): Self = StObject.set(x, "webcl", value.asInstanceOf[js.Any])
  }
}
