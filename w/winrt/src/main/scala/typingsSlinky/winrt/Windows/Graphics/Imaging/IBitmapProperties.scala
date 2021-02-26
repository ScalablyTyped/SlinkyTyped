package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapProperties extends IBitmapPropertiesView {
  
  def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[String, BitmapTypedValue]]): IAsyncAction = js.native
}
object IBitmapProperties {
  
  @scala.inline
  def apply(
    getPropertiesAsync: IIterable[String] => IAsyncOperation[BitmapPropertySet],
    setPropertiesAsync: IIterable[IKeyValuePair[String, BitmapTypedValue]] => IAsyncAction
  ): IBitmapProperties = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), setPropertiesAsync = js.Any.fromFunction1(setPropertiesAsync))
    __obj.asInstanceOf[IBitmapProperties]
  }
  
  @scala.inline
  implicit class IBitmapPropertiesMutableBuilder[Self <: IBitmapProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetPropertiesAsync(value: IIterable[IKeyValuePair[String, BitmapTypedValue]] => IAsyncAction): Self = StObject.set(x, "setPropertiesAsync", js.Any.fromFunction1(value))
  }
}
