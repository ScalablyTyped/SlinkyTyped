package typingsSlinky.winrt.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.IStorageFolder
import typingsSlinky.winrt.Windows.Storage.NameCollisionOption
import typingsSlinky.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Playlists {
  
  @js.native
  sealed trait PlaylistFormat extends StObject
  @JSGlobal("Windows.Media.Playlists.PlaylistFormat")
  @js.native
  object PlaylistFormat extends StObject {
    
    @js.native
    sealed trait m3u extends PlaylistFormat
    
    @js.native
    sealed trait windowsMedia extends PlaylistFormat
    
    @js.native
    sealed trait zune extends PlaylistFormat
  }
  
  @js.native
  trait IPlaylist extends StObject {
    
    var files: IVector[StorageFile] = js.native
    
    def saveAsAsync(saveLocation: IStorageFolder, desiredName: String, option: NameCollisionOption): IAsyncOperation[StorageFile] = js.native
    def saveAsAsync(
      saveLocation: IStorageFolder,
      desiredName: String,
      option: NameCollisionOption,
      playlistFormat: PlaylistFormat
    ): IAsyncOperation[StorageFile] = js.native
    
    def saveAsync(): IAsyncAction = js.native
  }
  
  @js.native
  trait IPlaylistStatics extends StObject {
    
    def loadAsync(file: IStorageFile): IAsyncOperation[Playlist] = js.native
  }
  object IPlaylistStatics {
    
    @scala.inline
    def apply(loadAsync: IStorageFile => IAsyncOperation[Playlist]): IPlaylistStatics = {
      val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction1(loadAsync))
      __obj.asInstanceOf[IPlaylistStatics]
    }
    
    @scala.inline
    implicit class IPlaylistStaticsMutableBuilder[Self <: IPlaylistStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadAsync(value: IStorageFile => IAsyncOperation[Playlist]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Playlist extends IPlaylist
}
