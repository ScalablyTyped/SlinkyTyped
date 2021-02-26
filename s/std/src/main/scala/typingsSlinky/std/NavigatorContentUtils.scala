package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorContentUtils extends StObject {
  
  def registerProtocolHandler(scheme: java.lang.String, url: java.lang.String, title: java.lang.String): Unit = js.native
  
  def unregisterProtocolHandler(scheme: java.lang.String, url: java.lang.String): Unit = js.native
}
object NavigatorContentUtils {
  
  @scala.inline
  def apply(
    registerProtocolHandler: (java.lang.String, java.lang.String, java.lang.String) => Unit,
    unregisterProtocolHandler: (java.lang.String, java.lang.String) => Unit
  ): org.scalajs.dom.raw.NavigatorContentUtils = {
    val __obj = js.Dynamic.literal(registerProtocolHandler = js.Any.fromFunction3(registerProtocolHandler), unregisterProtocolHandler = js.Any.fromFunction2(unregisterProtocolHandler))
    __obj.asInstanceOf[org.scalajs.dom.raw.NavigatorContentUtils]
  }
  
  @scala.inline
  implicit class NavigatorContentUtilsMutableBuilder[Self <: org.scalajs.dom.raw.NavigatorContentUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterProtocolHandler(value: (java.lang.String, java.lang.String, java.lang.String) => Unit): Self = StObject.set(x, "registerProtocolHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnregisterProtocolHandler(value: (java.lang.String, java.lang.String) => Unit): Self = StObject.set(x, "unregisterProtocolHandler", js.Any.fromFunction2(value))
  }
}
