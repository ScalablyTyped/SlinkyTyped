package typingsSlinky.winrt.Windows.UI.StartScreen

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISecondaryTileStatics extends js.Object {
  
  def exists(tileId: String): Boolean = js.native
  
  def findAllAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  def findAllAsync(applicationId: String): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  
  def findAllForPackageAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
}
