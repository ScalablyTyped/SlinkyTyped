package typingsSlinky.winrt.global.Windows.UI

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.UI.StartScreen.TileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.StartScreen")
@js.native
object StartScreen extends js.Object {
  @js.native
  class SecondaryTile ()
    extends typingsSlinky.winrt.Windows.UI.StartScreen.SecondaryTile {
    def this(tileId: String) = this()
    def this(
      tileId: String,
      shortName: String,
      displayName: String,
      args: String,
      tileOptions: TileOptions,
      logoReference: Uri
    ) = this()
    def this(
      tileId: String,
      shortName: String,
      displayName: String,
      args: String,
      tileOptions: TileOptions,
      logoReference: Uri,
      wideLogoReference: Uri
    ) = this()
  }
  
  @js.native
  object ForegroundText extends js.Object {
    /* 0 */ val dark: typingsSlinky.winrt.Windows.UI.StartScreen.ForegroundText.dark with Double = js.native
    /* 1 */ val light: typingsSlinky.winrt.Windows.UI.StartScreen.ForegroundText.light with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.StartScreen.ForegroundText with Double] = js.native
  }
  
  /* static members */
  @js.native
  object SecondaryTile extends js.Object {
    def exists(tileId: String): Boolean = js.native
    def findAllAsync(): IAsyncOperation[IVectorView[typingsSlinky.winrt.Windows.UI.StartScreen.SecondaryTile]] = js.native
    def findAllAsync(applicationId: String): IAsyncOperation[IVectorView[typingsSlinky.winrt.Windows.UI.StartScreen.SecondaryTile]] = js.native
    def findAllForPackageAsync(): IAsyncOperation[IVectorView[typingsSlinky.winrt.Windows.UI.StartScreen.SecondaryTile]] = js.native
  }
  
  @js.native
  object TileOptions extends js.Object {
    /* 3 */ val copyOnDeployment: typingsSlinky.winrt.Windows.UI.StartScreen.TileOptions.copyOnDeployment with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.UI.StartScreen.TileOptions.none with Double = js.native
    /* 1 */ val showNameOnLogo: typingsSlinky.winrt.Windows.UI.StartScreen.TileOptions.showNameOnLogo with Double = js.native
    /* 2 */ val showNameOnWideLogo: typingsSlinky.winrt.Windows.UI.StartScreen.TileOptions.showNameOnWideLogo with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.StartScreen.TileOptions with Double] = js.native
  }
  
}

