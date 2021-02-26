package typingsSlinky.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartClientDeployment extends StObject {
  
  var simple: js.UndefOr[String] = js.native
  
  var weak: js.UndefOr[String] = js.native
}
object SmartClientDeployment {
  
  @scala.inline
  def apply(): SmartClientDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartClientDeployment]
  }
  
  @scala.inline
  implicit class SmartClientDeploymentMutableBuilder[Self <: SmartClientDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSimple(value: String): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
    
    @scala.inline
    def setWeak(value: String): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
