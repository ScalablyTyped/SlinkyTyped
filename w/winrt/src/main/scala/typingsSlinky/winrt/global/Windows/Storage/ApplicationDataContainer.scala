package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.ApplicationDataContainer")
@js.native
class ApplicationDataContainer ()
  extends typingsSlinky.winrt.Windows.Storage.ApplicationDataContainer {
  /* CompleteClass */
  override var containers: IMapView[String, typingsSlinky.winrt.Windows.Storage.ApplicationDataContainer] = js.native
  /* CompleteClass */
  override var locality: typingsSlinky.winrt.Windows.Storage.ApplicationDataLocality = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var values: IPropertySet = js.native
  /* CompleteClass */
  override def createContainer(name: String, disposition: typingsSlinky.winrt.Windows.Storage.ApplicationDataCreateDisposition): typingsSlinky.winrt.Windows.Storage.ApplicationDataContainer = js.native
  /* CompleteClass */
  override def deleteContainer(name: String): Unit = js.native
}

