package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.ZH
import typingsSlinky.screeps.screepsStrings.ZO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait K extends StObject {
  
  var H: ZH = js.native
  
  var K: typingsSlinky.screeps.screepsStrings.ZK = js.native
  
  var O: ZO = js.native
}
object K {
  
  @scala.inline
  def apply(H: ZH, K: typingsSlinky.screeps.screepsStrings.ZK, O: ZO): K = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[K]
  }
  
  @scala.inline
  implicit class KMutableBuilder[Self <: K] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: ZH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK(value: typingsSlinky.screeps.screepsStrings.ZK): Self = StObject.set(x, "K", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: ZO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
