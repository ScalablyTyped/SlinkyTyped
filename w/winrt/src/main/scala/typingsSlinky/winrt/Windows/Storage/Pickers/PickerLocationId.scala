package typingsSlinky.winrt.Windows.Storage.Pickers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerLocationId extends js.Object

@JSGlobal("Windows.Storage.Pickers.PickerLocationId")
@js.native
object PickerLocationId extends js.Object {
  @js.native
  sealed trait computerFolder extends PickerLocationId
  
  @js.native
  sealed trait desktop extends PickerLocationId
  
  @js.native
  sealed trait documentsLibrary extends PickerLocationId
  
  @js.native
  sealed trait downloads extends PickerLocationId
  
  @js.native
  sealed trait homeGroup extends PickerLocationId
  
  @js.native
  sealed trait musicLibrary extends PickerLocationId
  
  @js.native
  sealed trait picturesLibrary extends PickerLocationId
  
  @js.native
  sealed trait videosLibrary extends PickerLocationId
  
  /* 1 */ val computerFolder: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId.computerFolder with Double = js.native
  /* 2 */ val desktop: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId.desktop with Double = js.native
  /* 0 */ val documentsLibrary: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId.documentsLibrary with Double = js.native
  /* 3 */ val downloads: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId.downloads with Double = js.native
  /* 4 */ val homeGroup: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId.homeGroup with Double = js.native
  /* 5 */ val musicLibrary: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId.musicLibrary with Double = js.native
  /* 6 */ val picturesLibrary: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId.picturesLibrary with Double = js.native
  /* 7 */ val videosLibrary: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId.videosLibrary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerLocationId with Double] = js.native
}

