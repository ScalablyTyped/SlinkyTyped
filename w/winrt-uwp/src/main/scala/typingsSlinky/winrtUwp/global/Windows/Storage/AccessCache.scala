package typingsSlinky.winrtUwp.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables and manages access to the most recently used (MRU) list of storage items, and to the list of storage items that the application has saved for efficient future access. */
@JSGlobal("Windows.Storage.AccessCache")
@js.native
object AccessCache extends js.Object {
  
  /** Describes the behavior to use when the app accesses an item in a list. */
  @js.native
  object AccessCacheOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions with Double
      ] = js.native
    
    /* 1 */ val disallowUserInput: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput with Double = js.native
    
    /* 2 */ val fastLocationsOnly: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.none with Double = js.native
    
    /* 4 */ val suppressAccessTimeUpdate: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate with Double = js.native
    
    /* 3 */ val useReadOnlyCachedCopy: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy with Double = js.native
  }
  
  /** A list of the entries that are in your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property) and in your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). */
  @js.native
  abstract class AccessListEntryView ()
    extends typingsSlinky.winrtUwp.Windows.Storage.AccessCache.AccessListEntryView
  
  /** Provides data about an ItemRemoved event. */
  @js.native
  abstract class ItemRemovedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Storage.AccessCache.ItemRemovedEventArgs
  
  /** Describes the extent of the visibility of a storage item added to the most recently used (MRU) list. */
  @js.native
  object RecentStorageItemVisibility extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility with Double
      ] = js.native
    
    /* 1 */ val appAndSystem: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility.appAndSystem with Double = js.native
    
    /* 0 */ val appOnly: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility.appOnly with Double = js.native
  }
  
  /** Provides static properties for you to get your app's most recently used list (MRU) (use StorageApplicationPermissions.MostRecentlyUsedList ) and future-access list (use StorageApplicationPermissions.FutureAccessList . */
  @js.native
  abstract class StorageApplicationPermissions ()
    extends typingsSlinky.winrtUwp.Windows.Storage.AccessCache.StorageApplicationPermissions
  /* static members */
  @js.native
  object StorageApplicationPermissions extends js.Object {
    
    /** Gets an object that represents a list that an app maintains so that the app can store files and/or locations (like folders) and easily access these items in the future. */
    var futureAccessList: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    
    /** Gets an object that represents a list that an app can use to track the files and/or locations (like folders) that the app has accessed most recently. */
    var mostRecentlyUsedList: typingsSlinky.winrtUwp.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
  }
  
  /** Represents your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). By picking files and folders, your user grants your app permission to access items that might not be accessible otherwise. If you add these items to your future-access list then you'll retain that permission when your app wants to access those items again later. Items are stored in the future-access list as StorageFile and StorageFolder objects. */
  @js.native
  abstract class StorageItemAccessList ()
    extends typingsSlinky.winrtUwp.Windows.Storage.AccessCache.StorageItemAccessList
  
  /** Represents your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property). You use your MRU to track items (files and/or folders) that the user has accessed most recently. Items are stored in the MRU as StorageFile and StorageFolder objects. */
  @js.native
  abstract class StorageItemMostRecentlyUsedList ()
    extends typingsSlinky.winrtUwp.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
}
