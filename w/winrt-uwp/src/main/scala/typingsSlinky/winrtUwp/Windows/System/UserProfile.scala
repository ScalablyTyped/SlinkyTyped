package typingsSlinky.winrtUwp.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import typingsSlinky.winrtUwp.anon.Second
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps get information about users, set globalization preferences, and control the lock screen image. */
object UserProfile {
  
  @js.native
  sealed trait AccountPictureKind extends StObject
  /** Allows you to request a specific image type when using GetAccountPicture . */
  @JSGlobal("Windows.System.UserProfile.AccountPictureKind")
  @js.native
  object AccountPictureKind extends StObject {
    
    /** Indicates you want the large image for the user's account. */
    @js.native
    sealed trait largeImage extends AccountPictureKind
    
    /** Indicates you want the small image for the user's account. */
    @js.native
    sealed trait smallImage extends AccountPictureKind
    
    /** Indicates you want the video for the user's account. */
    @js.native
    sealed trait video extends AccountPictureKind
  }
  
  @js.native
  sealed trait SetAccountPictureResult extends StObject
  /** A result that is returned when you try to set the image for a user account. */
  @JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
  @js.native
  object SetAccountPictureResult extends StObject {
    
    /** Indicates that the picture was not set because the AccountPictureChangeEnabled property is disabled, or the user cancelled the consent prompt. */
    @js.native
    sealed trait changeDisabled extends SetAccountPictureResult
    
    /** Indicates the picture or video was not set. */
    @js.native
    sealed trait failure extends SetAccountPictureResult
    
    /** Indicates the picture was not set because the file size was too large. */
    @js.native
    sealed trait fileSizeError extends SetAccountPictureResult
    
    /** Indicates that the picture was not set because the picture was too large. */
    @js.native
    sealed trait largeOrDynamicError extends SetAccountPictureResult
    
    /** Indicates the picture was successfully set. */
    @js.native
    sealed trait success extends SetAccountPictureResult
    
    /** Indicates that the video was not set because of its frame size was too large. */
    @js.native
    sealed trait videoFrameSizeError extends SetAccountPictureResult
  }
  
  @js.native
  sealed trait SetImageFeedResult extends StObject
  /** Specifies the result of a call to LockScreen.RequestSetImageFeedAsync */
  @JSGlobal("Windows.System.UserProfile.SetImageFeedResult")
  @js.native
  object SetImageFeedResult extends StObject {
    
    /** The feed was not set because the lock screen image slide show is disabled by group policy. */
    @js.native
    sealed trait changeDisabled extends SetImageFeedResult
    
    /** The image feed was set successfully. */
    @js.native
    sealed trait success extends SetImageFeedResult
    
    /** The operation was canceled by the user. */
    @js.native
    sealed trait userCanceled extends SetImageFeedResult
  }
  
  /** Provides a property that lets the caller retrieve the advertising ID, which is an ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. */
  @js.native
  trait AdvertisingManager extends StObject
  
  /** Represents a collection of settings that a user can opt-in to during the first run experience. */
  @js.native
  trait FirstSignInSettings extends StObject {
    
    /**
      * Returns an iterator for the items in the collection.
      * @return The iterator.
      */
    def first(): IIterator[IKeyValuePair[_, _]] = js.native
    
    /**
      * Determines whether the map view contains the specified key.
      * @param key The key to locate in the map view.
      * @return true if the key is found; otherwise, false.
      */
    def hasKey(key: String): Boolean = js.native
    
    /**
      * Returns the item in the map view with the specified key.
      * @param key The key to locate in the map view.
      * @return The item associated with the specified key.
      */
    def lookup(key: String): js.Any = js.native
    
    /** Returns the number of elements in the map. */
    var size: Double = js.native
    
    /**
      * Splits the map view into two views.
      */
    def split(): Second = js.native
  }
  object FirstSignInSettings {
    
    @scala.inline
    def apply(
      first: () => IIterator[IKeyValuePair[_, _]],
      hasKey: String => Boolean,
      lookup: String => js.Any,
      size: Double,
      split: () => Second
    ): FirstSignInSettings = {
      val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
      __obj.asInstanceOf[FirstSignInSettings]
    }
    
    @scala.inline
    implicit class FirstSignInSettingsMutableBuilder[Self <: FirstSignInSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirst(value: () => IIterator[IKeyValuePair[_, _]]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLookup(value: String => js.Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplit(value: () => Second): Self = StObject.set(x, "split", js.Any.fromFunction0(value))
    }
  }
  
  /** A static class for holding various user globalization preferences. */
  @js.native
  trait GlobalizationPreferences extends StObject
  
  /** Provides properties and methods to manage the full-screen image used as the lock screen background. */
  @js.native
  trait LockScreen extends StObject
  
  /** Represents information about the user, such as name and account picture. */
  @js.native
  trait UserInformation extends StObject
  
  /** Provides properties and methods to manage the user's desktop wallpaper and lock screen background image. */
  @js.native
  trait UserProfilePersonalizationSettings extends StObject {
    
    /**
      * Attempts to set the specified image file as the lock screen background image.
      * @param imageFile The image to set as the lock screen background.
      * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
      */
    def trySetLockScreenImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Attempts to set the specified image file as the desktop wallpaper image.
      * @param imageFile The image to set as the desktop background.
      * @return The result of the async operation. true if the background image was set successfully; otherwise, false.
      */
    def trySetWallpaperImageAsync(imageFile: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  object UserProfilePersonalizationSettings {
    
    @scala.inline
    def apply(
      trySetLockScreenImageAsync: StorageFile => IPromiseWithIAsyncOperation[Boolean],
      trySetWallpaperImageAsync: StorageFile => IPromiseWithIAsyncOperation[Boolean]
    ): UserProfilePersonalizationSettings = {
      val __obj = js.Dynamic.literal(trySetLockScreenImageAsync = js.Any.fromFunction1(trySetLockScreenImageAsync), trySetWallpaperImageAsync = js.Any.fromFunction1(trySetWallpaperImageAsync))
      __obj.asInstanceOf[UserProfilePersonalizationSettings]
    }
    
    @scala.inline
    implicit class UserProfilePersonalizationSettingsMutableBuilder[Self <: UserProfilePersonalizationSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrySetLockScreenImageAsync(value: StorageFile => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "trySetLockScreenImageAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrySetWallpaperImageAsync(value: StorageFile => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "trySetWallpaperImageAsync", js.Any.fromFunction1(value))
    }
  }
}
