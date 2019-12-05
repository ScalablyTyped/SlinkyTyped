package typingsSlinky.winrt.Windows.UI.StartScreen

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.UI.Color
import typingsSlinky.winrt.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecondaryTile extends js.Object {
  var arguments: String = js.native
  var backgroundColor: Color = js.native
  var displayName: String = js.native
  var foregroundText: ForegroundText = js.native
  var lockScreenBadgeLogo: Uri = js.native
  var lockScreenDisplayBadgeAndTileText: Boolean = js.native
  var logo: Uri = js.native
  var shortName: String = js.native
  var smallLogo: Uri = js.native
  var tileId: String = js.native
  var tileOptions: TileOptions = js.native
  var wideLogo: Uri = js.native
  def requestCreateAsync(): IAsyncOperation[Boolean] = js.native
  def requestCreateAsync(invocationPoint: Point): IAsyncOperation[Boolean] = js.native
  def requestCreateForSelectionAsync(selection: Rect): IAsyncOperation[Boolean] = js.native
  def requestCreateForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[Boolean] = js.native
  def requestDeleteAsync(): IAsyncOperation[Boolean] = js.native
  def requestDeleteAsync(invocationPoint: Point): IAsyncOperation[Boolean] = js.native
  def requestDeleteForSelectionAsync(selection: Rect): IAsyncOperation[Boolean] = js.native
  def requestDeleteForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[Boolean] = js.native
  def updateAsync(): IAsyncOperation[Boolean] = js.native
}

