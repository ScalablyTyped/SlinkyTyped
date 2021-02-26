package typingsSlinky.winrt.global.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Playlists {
  
  @JSGlobal("Windows.Media.Playlists.Playlist")
  @js.native
  class Playlist ()
    extends typingsSlinky.winrt.Windows.Media.Playlists.Playlist
  /* static members */
  object Playlist {
    
    @JSGlobal("Windows.Media.Playlists.Playlist.loadAsync")
    @js.native
    def loadAsync(file: IStorageFile): IAsyncOperation[typingsSlinky.winrt.Windows.Media.Playlists.Playlist] = js.native
  }
  
  @JSGlobal("Windows.Media.Playlists.PlaylistFormat")
  @js.native
  object PlaylistFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.Playlists.PlaylistFormat with Double] = js.native
    
    /* 2 */ val m3u: typingsSlinky.winrt.Windows.Media.Playlists.PlaylistFormat.m3u with Double = js.native
    
    /* 0 */ val windowsMedia: typingsSlinky.winrt.Windows.Media.Playlists.PlaylistFormat.windowsMedia with Double = js.native
    
    /* 1 */ val zune: typingsSlinky.winrt.Windows.Media.Playlists.PlaylistFormat.zune with Double = js.native
  }
}
