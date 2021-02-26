package typingsSlinky.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreWindowDialogFactory extends StObject {
  
  def createWithTitle(title: String): CoreWindowDialog = js.native
}
object ICoreWindowDialogFactory {
  
  @scala.inline
  def apply(createWithTitle: String => CoreWindowDialog): ICoreWindowDialogFactory = {
    val __obj = js.Dynamic.literal(createWithTitle = js.Any.fromFunction1(createWithTitle))
    __obj.asInstanceOf[ICoreWindowDialogFactory]
  }
  
  @scala.inline
  implicit class ICoreWindowDialogFactoryMutableBuilder[Self <: ICoreWindowDialogFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithTitle(value: String => CoreWindowDialog): Self = StObject.set(x, "createWithTitle", js.Any.fromFunction1(value))
  }
}
