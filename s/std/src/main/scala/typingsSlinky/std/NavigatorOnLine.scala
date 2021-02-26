package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorOnLine extends StObject {
  
  val onLine: scala.Boolean = js.native
}
object NavigatorOnLine {
  
  @scala.inline
  def apply(onLine: scala.Boolean): org.scalajs.dom.raw.NavigatorOnLine = {
    val __obj = js.Dynamic.literal(onLine = onLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.NavigatorOnLine]
  }
  
  @scala.inline
  implicit class NavigatorOnLineMutableBuilder[Self <: org.scalajs.dom.raw.NavigatorOnLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnLine(value: scala.Boolean): Self = StObject.set(x, "onLine", value.asInstanceOf[js.Any])
  }
}
