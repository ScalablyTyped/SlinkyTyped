package typingsSlinky.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFilterInfo extends _WSKeys {
  
  /** Range of the AutoFilter table */
  var ref: String = js.native
}
object AutoFilterInfo {
  
  @scala.inline
  def apply(ref: String): AutoFilterInfo = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFilterInfo]
  }
  
  @scala.inline
  implicit class AutoFilterInfoMutableBuilder[Self <: AutoFilterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
