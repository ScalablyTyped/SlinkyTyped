package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBVersionChangeEventInit extends EventInit {
  
  var newVersion: js.UndefOr[Double | Null] = js.native
  
  var oldVersion: js.UndefOr[Double] = js.native
}
object IDBVersionChangeEventInit {
  
  @scala.inline
  def apply(): IDBVersionChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBVersionChangeEventInit]
  }
  
  @scala.inline
  implicit class IDBVersionChangeEventInitMutableBuilder[Self <: IDBVersionChangeEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVersion(value: Double): Self = StObject.set(x, "newVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewVersionNull: Self = StObject.set(x, "newVersion", null)
    
    @scala.inline
    def setNewVersionUndefined: Self = StObject.set(x, "newVersion", js.undefined)
    
    @scala.inline
    def setOldVersion(value: Double): Self = StObject.set(x, "oldVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldVersionUndefined: Self = StObject.set(x, "oldVersion", js.undefined)
  }
}
