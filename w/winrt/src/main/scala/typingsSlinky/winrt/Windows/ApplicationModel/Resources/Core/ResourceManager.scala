package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceManager extends IResourceManager
object ResourceManager {
  
  @scala.inline
  def apply(
    allResourceMaps: IMapView[String, ResourceMap],
    defaultContext: ResourceContext,
    loadPriFiles: IIterable[IStorageFile] => Unit,
    mainResourceMap: ResourceMap,
    unloadPriFiles: IIterable[IStorageFile] => Unit
  ): ResourceManager = {
    val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap.asInstanceOf[js.Any], unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
    __obj.asInstanceOf[ResourceManager]
  }
}
