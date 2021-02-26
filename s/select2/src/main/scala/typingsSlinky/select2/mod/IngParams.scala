package typingsSlinky.select2.mod

import typingsSlinky.select2.select2Strings.close
import typingsSlinky.select2.select2Strings.open
import typingsSlinky.select2.select2Strings.select
import typingsSlinky.select2.select2Strings.unselect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngParams extends StObject {
  
  var name: select | open | close | unselect = js.native
  
  var prevented: Boolean = js.native
}
object IngParams {
  
  @scala.inline
  def apply(name: select | open | close | unselect, prevented: Boolean): IngParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prevented = prevented.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngParams]
  }
  
  @scala.inline
  implicit class IngParamsMutableBuilder[Self <: IngParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: select | open | close | unselect): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevented(value: Boolean): Self = StObject.set(x, "prevented", value.asInstanceOf[js.Any])
  }
}
