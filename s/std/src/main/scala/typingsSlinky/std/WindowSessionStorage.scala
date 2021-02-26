package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowSessionStorage extends StObject {
  
  val sessionStorage: org.scalajs.dom.raw.Storage = js.native
}
object WindowSessionStorage {
  
  @scala.inline
  def apply(sessionStorage: org.scalajs.dom.raw.Storage): org.scalajs.dom.raw.WindowSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.WindowSessionStorage]
  }
  
  @scala.inline
  implicit class WindowSessionStorageMutableBuilder[Self <: org.scalajs.dom.raw.WindowSessionStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionStorage(value: org.scalajs.dom.raw.Storage): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
