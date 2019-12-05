package typingsSlinky.atStorybookUi

import typingsSlinky.atStorybookUi.atStorybookUiNumbers.`false`
import typingsSlinky.atStorybookUi.distKeyboardPlatformMod.OperatingSystem
import typingsSlinky.atStorybookUi.distKeyboardPlatformMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/keyboard/platform", JSImport.Namespace)
@js.native
object distKeyboardPlatformMod extends js.Object {
  @js.native
  sealed trait OperatingSystem extends js.Object
  
  @js.native
  sealed trait Platform extends js.Object
  
  val OS: OperatingSystem = js.native
  val isLinux: `false` = js.native
  val isMacintosh: `false` = js.native
  val isWindows: `false` = js.native
  @js.native
  object OperatingSystem extends js.Object {
    @js.native
    sealed trait Linux extends OperatingSystem
    
    @js.native
    sealed trait Macintosh extends OperatingSystem
    
    @js.native
    sealed trait Windows extends OperatingSystem
    
    /* 3 */ val Linux: typingsSlinky.atStorybookUi.distKeyboardPlatformMod.OperatingSystem.Linux with Double = js.native
    /* 2 */ val Macintosh: typingsSlinky.atStorybookUi.distKeyboardPlatformMod.OperatingSystem.Macintosh with Double = js.native
    /* 1 */ val Windows: typingsSlinky.atStorybookUi.distKeyboardPlatformMod.OperatingSystem.Windows with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperatingSystem with Double] = js.native
  }
  
  @js.native
  object Platform extends js.Object {
    @js.native
    sealed trait Linux extends Platform
    
    @js.native
    sealed trait Mac extends Platform
    
    @js.native
    sealed trait Windows extends Platform
    
    /* 1 */ val Linux: typingsSlinky.atStorybookUi.distKeyboardPlatformMod.Platform.Linux with Double = js.native
    /* 0 */ val Mac: typingsSlinky.atStorybookUi.distKeyboardPlatformMod.Platform.Mac with Double = js.native
    /* 2 */ val Windows: typingsSlinky.atStorybookUi.distKeyboardPlatformMod.Platform.Windows with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Platform with Double] = js.native
  }
  
}

