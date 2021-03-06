package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstSecond extends StObject {
  
  var first: IMapView[String, NamedResource] = js.native
  
  var second: IMapView[String, NamedResource] = js.native
}
object FirstSecond {
  
  @scala.inline
  def apply(first: IMapView[String, NamedResource], second: IMapView[String, NamedResource]): FirstSecond = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstSecond]
  }
  
  @scala.inline
  implicit class FirstSecondMutableBuilder[Self <: FirstSecond] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: IMapView[String, NamedResource]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: IMapView[String, NamedResource]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}
