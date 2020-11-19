package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionMode extends js.Object
@JSImport("vscode", "ExtensionMode")
@js.native
object ExtensionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionMode with Double] = js.native
  
  /**
    * The extension is running from an `--extensionDevelopmentPath` provided
    * when launching VS Code.
    */
  @js.native
  sealed trait Development extends ExtensionMode
  /* 2 */ @js.native
  object Development extends TopLevel[Development with Double]
  
  /**
    * The extension is installed normally (for example, from the marketplace
    * or VSIX) in VS Code.
    */
  @js.native
  sealed trait Production extends ExtensionMode
  /* 1 */ @js.native
  object Production extends TopLevel[Production with Double]
  
  /**
    * The extension is running from an `--extensionTestsPath` and
    * the extension host is running unit tests.
    */
  @js.native
  sealed trait Test extends ExtensionMode
  /* 3 */ @js.native
  object Test extends TopLevel[Test with Double]
}
