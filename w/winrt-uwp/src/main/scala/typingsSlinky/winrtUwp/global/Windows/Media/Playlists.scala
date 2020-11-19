package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for creating and saving media playlists for playback. */
@JSGlobal("Windows.Media.Playlists")
@js.native
object Playlists extends js.Object {
  
  /** Provides access to a media playlist. */
  @js.native
  /** Creates a new instance of a Playlist object. */
  class Playlist ()
    extends typingsSlinky.winrtUwp.Windows.Media.Playlists.Playlist
  /* static members */
  @js.native
  object Playlist extends js.Object {
    
    /**
      * Asynchronously loads files into a playlist.
      * @param file Represents the files to load.
      * @return Represents the asynchronous operation for loading the playlist. The GetResults method of this IAsyncOperation object returns the playlist.
      */
    def loadAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Media.Playlists.Playlist] = js.native
  }
  
  /** Indicates the format of a playlist file. */
  @js.native
  object PlaylistFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Media.Playlists.PlaylistFormat with Double] = js.native
    
    /* 2 */ val m3u: typingsSlinky.winrtUwp.Windows.Media.Playlists.PlaylistFormat.m3u with Double = js.native
    
    /* 0 */ val windowsMedia: typingsSlinky.winrtUwp.Windows.Media.Playlists.PlaylistFormat.windowsMedia with Double = js.native
    
    /* 1 */ val zune: typingsSlinky.winrtUwp.Windows.Media.Playlists.PlaylistFormat.zune with Double = js.native
  }
}
