package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageItem
import typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataPackage extends StObject {
  
  def getView(): DataPackageView = js.native
  
  var ondestroyed: js.Any = js.native
  
  var onoperationcompleted: js.Any = js.native
  
  var properties: DataPackagePropertySet = js.native
  
  var requestedOperation: DataPackageOperation = js.native
  
  var resourceMap: IMap[String, RandomAccessStreamReference] = js.native
  
  def setBitmap(value: RandomAccessStreamReference): Unit = js.native
  
  def setData(formatId: String, value: js.Any): Unit = js.native
  
  def setDataProvider(formatId: String, delayRenderer: DataProviderHandler): Unit = js.native
  
  def setHtmlFormat(value: String): Unit = js.native
  
  def setRtf(value: String): Unit = js.native
  
  def setStorageItems(value: IIterable[IStorageItem]): Unit = js.native
  def setStorageItems(value: IIterable[IStorageItem], readOnly: Boolean): Unit = js.native
  
  def setText(value: String): Unit = js.native
  
  def setUri(value: Uri): Unit = js.native
}
