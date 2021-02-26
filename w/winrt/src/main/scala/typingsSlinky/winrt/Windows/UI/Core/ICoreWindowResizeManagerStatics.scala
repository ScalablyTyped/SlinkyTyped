package typingsSlinky.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreWindowResizeManagerStatics extends StObject {
  
  def getForCurrentView(): CoreWindowResizeManager = js.native
}
object ICoreWindowResizeManagerStatics {
  
  @scala.inline
  def apply(getForCurrentView: () => CoreWindowResizeManager): ICoreWindowResizeManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[ICoreWindowResizeManagerStatics]
  }
  
  @scala.inline
  implicit class ICoreWindowResizeManagerStaticsMutableBuilder[Self <: ICoreWindowResizeManagerStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetForCurrentView(value: () => CoreWindowResizeManager): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
