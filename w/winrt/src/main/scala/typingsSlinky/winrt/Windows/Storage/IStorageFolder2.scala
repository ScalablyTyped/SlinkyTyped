package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageFolder2 extends js.Object {
  
  def tryGetItemAsync(name: String): IAsyncOperation[IStorageItem] = js.native
}
object IStorageFolder2 {
  
  @scala.inline
  def apply(tryGetItemAsync: String => IAsyncOperation[IStorageItem]): IStorageFolder2 = {
    val __obj = js.Dynamic.literal(tryGetItemAsync = js.Any.fromFunction1(tryGetItemAsync))
    __obj.asInstanceOf[IStorageFolder2]
  }
  
  @scala.inline
  implicit class IStorageFolder2Ops[Self <: IStorageFolder2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTryGetItemAsync(value: String => IAsyncOperation[IStorageItem]): Self = this.set("tryGetItemAsync", js.Any.fromFunction1(value))
  }
}
