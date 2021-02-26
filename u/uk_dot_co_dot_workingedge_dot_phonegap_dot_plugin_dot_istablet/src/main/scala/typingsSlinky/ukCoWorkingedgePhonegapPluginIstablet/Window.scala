package typingsSlinky.ukCoWorkingedgePhonegapPluginIstablet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  /**
    * Indicates whether the current device is a tablet or a phone.
    * True if the device is a tablet; false if the device is a phone.
    */
  var isTablet: Boolean = js.native
}
object Window {
  
  @scala.inline
  def apply(isTablet: Boolean): Window = {
    val __obj = js.Dynamic.literal(isTablet = isTablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
  }
}
