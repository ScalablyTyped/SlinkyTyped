package typingsSlinky.winrt.Windows.Storage.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryOptions extends js.Object {
  var applicationSearchFilter: String = js.native
  var dateStackOption: DateStackOption = js.native
  var fileTypeFilter: IVector[String] = js.native
  var folderDepth: FolderDepth = js.native
  var groupPropertyName: String = js.native
  var indexerOption: IndexerOption = js.native
  var language: String = js.native
  var sortOrder: IVector[SortEntry] = js.native
  var userSearchFilter: String = js.native
  def loadFromString(value: String): Unit = js.native
  def saveToString(): String = js.native
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
}

object IQueryOptions {
  @scala.inline
  def apply(
    applicationSearchFilter: String,
    dateStackOption: DateStackOption,
    fileTypeFilter: IVector[String],
    folderDepth: FolderDepth,
    groupPropertyName: String,
    indexerOption: IndexerOption,
    language: String,
    loadFromString: String => Unit,
    saveToString: () => String,
    setPropertyPrefetch: (PropertyPrefetchOptions, IIterable[String]) => Unit,
    setThumbnailPrefetch: (ThumbnailMode, Double, ThumbnailOptions) => Unit,
    sortOrder: IVector[SortEntry],
    userSearchFilter: String
  ): IQueryOptions = {
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter.asInstanceOf[js.Any], dateStackOption = dateStackOption.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], folderDepth = folderDepth.asInstanceOf[js.Any], groupPropertyName = groupPropertyName.asInstanceOf[js.Any], indexerOption = indexerOption.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], loadFromString = js.Any.fromFunction1(loadFromString), saveToString = js.Any.fromFunction0(saveToString), setPropertyPrefetch = js.Any.fromFunction2(setPropertyPrefetch), setThumbnailPrefetch = js.Any.fromFunction3(setThumbnailPrefetch), sortOrder = sortOrder.asInstanceOf[js.Any], userSearchFilter = userSearchFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryOptions]
  }
  @scala.inline
  implicit class IQueryOptionsOps[Self <: IQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationSearchFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationSearchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateStackOption(value: DateStackOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStackOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileTypeFilter(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderDepth(value: FolderDepth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexerOption(value: IndexerOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexerOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadFromString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFromString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSaveToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveToString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPropertyPrefetch(value: (PropertyPrefetchOptions, IIterable[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPropertyPrefetch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetThumbnailPrefetch(value: (ThumbnailMode, Double, ThumbnailOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThumbnailPrefetch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSortOrder(value: IVector[SortEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSearchFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSearchFilter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

