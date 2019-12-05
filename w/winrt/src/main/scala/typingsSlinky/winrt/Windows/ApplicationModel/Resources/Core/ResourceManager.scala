package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
@js.native
class ResourceManager () extends IResourceManager {
  /* CompleteClass */
  override var allResourceMaps: IMapView[String, ResourceMap] = js.native
  /* CompleteClass */
  override var defaultContext: ResourceContext = js.native
  /* CompleteClass */
  override var mainResourceMap: ResourceMap = js.native
  /* CompleteClass */
  override def loadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
  /* CompleteClass */
  override def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
@js.native
object ResourceManager extends js.Object {
  var current: ResourceManager = js.native
  def isResourceReference(resourceReference: String): Boolean = js.native
}

