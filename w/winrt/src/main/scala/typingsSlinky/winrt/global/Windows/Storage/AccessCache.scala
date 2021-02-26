package typingsSlinky.winrt.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccessCache {
  
  @JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
  @js.native
  object AccessCacheOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions with Double] = js.native
    
    /* 1 */ val disallowUserInput: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput with Double = js.native
    
    /* 2 */ val fastLocationsOnly: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.none with Double = js.native
    
    /* 4 */ val suppressAccessTimeUpdate: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate with Double = js.native
    
    /* 3 */ val useReadOnlyCachedCopy: typingsSlinky.winrt.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.AccessCache.AccessListEntryView")
  @js.native
  class AccessListEntryView ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.AccessListEntryView
  
  @JSGlobal("Windows.Storage.AccessCache.ItemRemovedEventArgs")
  @js.native
  class ItemRemovedEventArgs ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.ItemRemovedEventArgs
  
  @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
  @js.native
  class StorageApplicationPermissions ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.StorageApplicationPermissions
  /* static members */
  object StorageApplicationPermissions {
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.futureAccessList")
    @js.native
    def futureAccessList: typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    @scala.inline
    def futureAccessList_=(x: typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemAccessList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("futureAccessList")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.mostRecentlyUsedList")
    @js.native
    def mostRecentlyUsedList: typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
    @scala.inline
    def mostRecentlyUsedList_=(x: typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mostRecentlyUsedList")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Storage.AccessCache.StorageItemAccessList")
  @js.native
  class StorageItemAccessList ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemAccessList
  
  @JSGlobal("Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList")
  @js.native
  class StorageItemMostRecentlyUsedList ()
    extends typingsSlinky.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
}
