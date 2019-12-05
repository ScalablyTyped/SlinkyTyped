package typingsSlinky.winrt.Windows.Storage.FileProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThumbnailMode extends js.Object

@JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
@js.native
object ThumbnailMode extends js.Object {
  @js.native
  sealed trait documentsView extends ThumbnailMode
  
  @js.native
  sealed trait listView extends ThumbnailMode
  
  @js.native
  sealed trait musicView extends ThumbnailMode
  
  @js.native
  sealed trait picturesView extends ThumbnailMode
  
  @js.native
  sealed trait singleItem extends ThumbnailMode
  
  @js.native
  sealed trait videosView extends ThumbnailMode
  
  /* 3 */ val documentsView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.documentsView with Double = js.native
  /* 4 */ val listView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.listView with Double = js.native
  /* 2 */ val musicView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.musicView with Double = js.native
  /* 0 */ val picturesView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.picturesView with Double = js.native
  /* 5 */ val singleItem: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.singleItem with Double = js.native
  /* 1 */ val videosView: typingsSlinky.winrt.Windows.Storage.FileProperties.ThumbnailMode.videosView with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThumbnailMode with Double] = js.native
}

