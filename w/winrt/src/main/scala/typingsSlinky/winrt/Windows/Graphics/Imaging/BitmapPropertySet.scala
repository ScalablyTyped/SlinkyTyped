package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
@js.native
class BitmapPropertySet () extends IMap[String, BitmapTypedValue] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, BitmapTypedValue]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, BitmapTypedValue] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: BitmapTypedValue): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): BitmapTypedValue = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

