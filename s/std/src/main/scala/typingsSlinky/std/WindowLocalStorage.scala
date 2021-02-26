package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowLocalStorage extends StObject {
  
  val localStorage: org.scalajs.dom.raw.Storage = js.native
}
object WindowLocalStorage {
  
  @scala.inline
  def apply(localStorage: org.scalajs.dom.raw.Storage): org.scalajs.dom.raw.WindowLocalStorage = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.WindowLocalStorage]
  }
  
  @scala.inline
  implicit class WindowLocalStorageMutableBuilder[Self <: org.scalajs.dom.raw.WindowLocalStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalStorage(value: org.scalajs.dom.raw.Storage): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
  }
}
