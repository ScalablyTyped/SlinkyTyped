package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstSecond extends js.Object {
  
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
  implicit class FirstSecondOps[Self <: FirstSecond] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirst(value: IMapView[String, NamedResource]): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: IMapView[String, NamedResource]): Self = this.set("second", value.asInstanceOf[js.Any])
  }
}
