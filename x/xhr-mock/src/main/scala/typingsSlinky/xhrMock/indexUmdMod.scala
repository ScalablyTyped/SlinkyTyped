package typingsSlinky.xhrMock

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.std.XMLHttpRequest
import typingsSlinky.xhrMock.xhrmockMod.XHRMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexUmdMod {
  
  object default extends Shortcut {
    
    @JSImport("xhr-mock/lib/index.umd", JSImport.Default)
    @js.native
    val ^ : XHRMock = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("xhr-mock/lib/index.umd", "default.RealXMLHttpRequest")
    @js.native
    class RealXMLHttpRequest () extends XMLHttpRequest
    
    type _To = XHRMock
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: XHRMock = ^
  }
}
