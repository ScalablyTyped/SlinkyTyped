package typingsSlinky.winrt.global.Windows.Storage.Pickers

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
@js.native
class FilePickerFileTypesOrderedMap ()
  extends typingsSlinky.winrt.Windows.Storage.Pickers.FilePickerFileTypesOrderedMap {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, IVector[String]]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, IVector[String]] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: IVector[String]): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): IVector[String] = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

