package typingsSlinky.terminalDashKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object terminalMod {
  import typingsSlinky.nextgenDashEvents.nextgenDashEventsMod.^
  import typingsSlinky.terminalDashKit.Anon_BG
  import typingsSlinky.terminalDashKit.Anon_BaseDir

  type Autocompletion = (js.Function2[
    /* inputString */ String, 
    /* callback */ Callback[String | AutocompletionArray[String]], 
    Unit
  ]) | (js.Function1[/* inputString */ String, js.Promise[String | AutocompletionArray[String]]])
  type CTerminal = Terminal with (js.Function1[/* repeated */ js.Any, Terminal])
  type Callback[T] = (js.Function1[/* err */ js.Any, Unit]) | (js.Function2[/* err */ js.UndefOr[scala.Nothing], /* arg */ T, Unit])
  type Chainable[T] = T with ChainableInterface[T]
  type IFileInputOptions = InputFieldOptions with Anon_BaseDir
  type Palette = js.Array[Anon_BG]
  type Terminal = Impl with ^ 
}
