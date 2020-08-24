package typingsSlinky.winrt.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.AccessCache")
@js.native
object AccessCache extends js.Object {
  @js.native
  class AccessListEntryView ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.AccessListEntryView
  
  @js.native
  class ItemRemovedEventArgs ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.ItemRemovedEventArgs
  
  @js.native
  class StorageApplicationPermissions ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.StorageApplicationPermissions
  
  @js.native
  class StorageItemAccessList ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemAccessList
  
  @js.native
  class StorageItemMostRecentlyUsedList ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
  
  @js.native
  object AccessCacheOptions extends js.Object {
    /* 1 */ val disallowUserInput: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput with Double = js.native
    /* 2 */ val fastLocationsOnly: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.none with Double = js.native
    /* 4 */ val suppressAccessTimeUpdate: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate with Double = js.native
    /* 3 */ val useReadOnlyCachedCopy: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions with Double] = js.native
  }
  
  /* static members */
  @js.native
  object StorageApplicationPermissions extends js.Object {
    var futureAccessList: typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    var mostRecentlyUsedList: typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
  }
  
}

