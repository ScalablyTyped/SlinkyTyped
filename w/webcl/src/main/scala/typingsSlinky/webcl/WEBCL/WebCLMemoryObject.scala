package typingsSlinky.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6
@js.native
trait WebCLMemoryObject extends StObject {
  
  def getInfo(name: MemInfo): js.Any = js.native
  
  def release(): Unit = js.native
}
object WebCLMemoryObject {
  
  @scala.inline
  def apply(getInfo: MemInfo => js.Any, release: () => Unit): WebCLMemoryObject = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLMemoryObject]
  }
  
  @scala.inline
  implicit class WebCLMemoryObjectMutableBuilder[Self <: WebCLMemoryObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInfo(value: MemInfo => js.Any): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
  }
}
