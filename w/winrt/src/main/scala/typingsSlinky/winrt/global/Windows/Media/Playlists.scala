package typingsSlinky.winrt.global.Windows.Media

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Media.Playlists")
@js.native
object Playlists extends js.Object {
  
  @js.native
  class Playlist ()
    extends typingsSlinky.winrt.Windows.Media.Playlists.Playlist
  /* static members */
  @js.native
  object Playlist extends js.Object {
    
    def loadAsync(file: IStorageFile): IAsyncOperation[typingsSlinky.winrt.Windows.Media.Playlists.Playlist] = js.native
  }
  
  @js.native
  object PlaylistFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Media.Playlists.PlaylistFormat with Double] = js.native
    
    /* 2 */ val m3u: typingsSlinky.winrt.Windows.Media.Playlists.PlaylistFormat.m3u with Double = js.native
    
    /* 0 */ val windowsMedia: typingsSlinky.winrt.Windows.Media.Playlists.PlaylistFormat.windowsMedia with Double = js.native
    
    /* 1 */ val zune: typingsSlinky.winrt.Windows.Media.Playlists.PlaylistFormat.zune with Double = js.native
  }
}
