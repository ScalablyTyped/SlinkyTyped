package typingsSlinky.ytSearch.mod

import typingsSlinky.ytSearch.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yt-search", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(query: String): js.Promise[SearchResult] = js.native
  def apply(
    query: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
  ): Unit = js.native
  def apply(query: Options): js.Promise[SearchResult] = js.native
  def apply(
    query: Options,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
  ): Unit = js.native
  def apply(query: PlaylistMetadataOptions): js.Promise[PlaylistMetadataResult] = js.native
  def apply(
    query: PlaylistMetadataOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[js.Error | String | Null], 
      /* data */ PlaylistMetadataResult, 
      Unit
    ]
  ): Unit = js.native
  def apply(query: VideoMetadataOptions): js.Promise[VideoMetadataResult] = js.native
  def apply(
    query: VideoMetadataOptions,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ VideoMetadataResult, Unit]
  ): Unit = js.native
  
  def search(query: String): js.Promise[SearchResult] = js.native
  def search(
    query: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
  ): Unit = js.native
  def search(query: Options): js.Promise[SearchResult] = js.native
  def search(
    query: Options,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
  ): Unit = js.native
  def search(query: PlaylistMetadataOptions): js.Promise[PlaylistMetadataResult] = js.native
  def search(
    query: PlaylistMetadataOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[js.Error | String | Null], 
      /* data */ PlaylistMetadataResult, 
      Unit
    ]
  ): Unit = js.native
  def search(query: VideoMetadataOptions): js.Promise[VideoMetadataResult] = js.native
  def search(
    query: VideoMetadataOptions,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ VideoMetadataResult, Unit]
  ): Unit = js.native
  @JSName("search")
  var search_Original: FnCall = js.native
}
