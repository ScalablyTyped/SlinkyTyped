package typingsSlinky.winrt.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaExtension extends StObject {
  
  def setProperties(configuration: IPropertySet): Unit = js.native
}
object IMediaExtension {
  
  @scala.inline
  def apply(setProperties: IPropertySet => Unit): IMediaExtension = {
    val __obj = js.Dynamic.literal(setProperties = js.Any.fromFunction1(setProperties))
    __obj.asInstanceOf[IMediaExtension]
  }
  
  @scala.inline
  implicit class IMediaExtensionMutableBuilder[Self <: IMediaExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetProperties(value: IPropertySet => Unit): Self = StObject.set(x, "setProperties", js.Any.fromFunction1(value))
  }
}
