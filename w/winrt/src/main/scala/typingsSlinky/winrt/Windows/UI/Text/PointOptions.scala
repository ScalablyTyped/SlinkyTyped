package typingsSlinky.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointOptions extends js.Object

@JSGlobal("Windows.UI.Text.PointOptions")
@js.native
object PointOptions extends js.Object {
  @js.native
  sealed trait allowOffClient extends PointOptions
  
  @js.native
  sealed trait clientCoordinates extends PointOptions
  
  @js.native
  sealed trait includeInset extends PointOptions
  
  @js.native
  sealed trait noHorizontalScroll extends PointOptions
  
  @js.native
  sealed trait noVerticalScroll extends PointOptions
  
  @js.native
  sealed trait none extends PointOptions
  
  @js.native
  sealed trait start extends PointOptions
  
  @js.native
  sealed trait transform extends PointOptions
  
  /* 4 */ val allowOffClient: typingsSlinky.winrt.Windows.UI.Text.PointOptions.allowOffClient with Double = js.native
  /* 3 */ val clientCoordinates: typingsSlinky.winrt.Windows.UI.Text.PointOptions.clientCoordinates with Double = js.native
  /* 1 */ val includeInset: typingsSlinky.winrt.Windows.UI.Text.PointOptions.includeInset with Double = js.native
  /* 6 */ val noHorizontalScroll: typingsSlinky.winrt.Windows.UI.Text.PointOptions.noHorizontalScroll with Double = js.native
  /* 7 */ val noVerticalScroll: typingsSlinky.winrt.Windows.UI.Text.PointOptions.noVerticalScroll with Double = js.native
  /* 0 */ val none: typingsSlinky.winrt.Windows.UI.Text.PointOptions.none with Double = js.native
  /* 2 */ val start: typingsSlinky.winrt.Windows.UI.Text.PointOptions.start with Double = js.native
  /* 5 */ val transform: typingsSlinky.winrt.Windows.UI.Text.PointOptions.transform with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointOptions with Double] = js.native
}

