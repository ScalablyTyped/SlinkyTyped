package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceManager extends js.Object {
  var allResourceMaps: IMapView[String, ResourceMap] = js.native
  var defaultContext: ResourceContext = js.native
  var mainResourceMap: ResourceMap = js.native
  def loadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
  def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
}

object IResourceManager {
  @scala.inline
  def apply(
    allResourceMaps: IMapView[String, ResourceMap],
    defaultContext: ResourceContext,
    loadPriFiles: IIterable[IStorageFile] => Unit,
    mainResourceMap: ResourceMap,
    unloadPriFiles: IIterable[IStorageFile] => Unit
  ): IResourceManager = {
    val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap.asInstanceOf[js.Any], unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
    __obj.asInstanceOf[IResourceManager]
  }
  @scala.inline
  implicit class IResourceManagerOps[Self <: IResourceManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllResourceMaps(value: IMapView[String, ResourceMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allResourceMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultContext(value: ResourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadPriFiles(value: IIterable[IStorageFile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPriFiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMainResourceMap(value: ResourceMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainResourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnloadPriFiles(value: IIterable[IStorageFile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unloadPriFiles")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

