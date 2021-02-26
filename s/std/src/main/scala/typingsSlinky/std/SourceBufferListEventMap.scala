package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceBufferListEventMap extends StObject {
  
  var addsourcebuffer: org.scalajs.dom.raw.Event = js.native
  
  var removesourcebuffer: org.scalajs.dom.raw.Event = js.native
}
object SourceBufferListEventMap {
  
  @scala.inline
  def apply(addsourcebuffer: org.scalajs.dom.raw.Event, removesourcebuffer: org.scalajs.dom.raw.Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
  
  @scala.inline
  implicit class SourceBufferListEventMapMutableBuilder[Self <: SourceBufferListEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddsourcebuffer(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "addsourcebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovesourcebuffer(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "removesourcebuffer", value.asInstanceOf[js.Any])
  }
}
