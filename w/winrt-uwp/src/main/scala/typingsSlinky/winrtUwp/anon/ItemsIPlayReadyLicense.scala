package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyLicense
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsIPlayReadyLicense extends StObject {
  
  /** The items in the collection. */ var items: IPlayReadyLicense = js.native
  
  /** The number of items in the collection. */ var returnValue: Double = js.native
}
object ItemsIPlayReadyLicense {
  
  @scala.inline
  def apply(items: IPlayReadyLicense, returnValue: Double): ItemsIPlayReadyLicense = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadyLicense]
  }
  
  @scala.inline
  implicit class ItemsIPlayReadyLicenseMutableBuilder[Self <: ItemsIPlayReadyLicense] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: IPlayReadyLicense): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
