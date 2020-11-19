package typingsSlinky.storybookUi

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/keyboard/platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  
  val OS: OperatingSystem = js.native
  
  val isLinux: /* false */ Boolean = js.native
  
  val isMacintosh: /* false */ Boolean = js.native
  
  val isWindows: /* false */ Boolean = js.native
  
  @js.native
  sealed trait OperatingSystem extends js.Object
  @js.native
  object OperatingSystem extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperatingSystem with Double] = js.native
    
    @js.native
    sealed trait Linux extends OperatingSystem
    /* 3 */ @js.native
    object Linux extends TopLevel[Linux with Double]
    
    @js.native
    sealed trait Macintosh extends OperatingSystem
    /* 2 */ @js.native
    object Macintosh extends TopLevel[Macintosh with Double]
    
    @js.native
    sealed trait Windows extends OperatingSystem
    /* 1 */ @js.native
    object Windows extends TopLevel[Windows with Double]
  }
  
  @js.native
  sealed trait Platform extends js.Object
  @js.native
  object Platform extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Platform with Double] = js.native
    
    @js.native
    sealed trait Linux extends Platform
    /* 1 */ @js.native
    object Linux extends TopLevel[Linux with Double]
    
    @js.native
    sealed trait Mac extends Platform
    /* 0 */ @js.native
    object Mac extends TopLevel[Mac with Double]
    
    @js.native
    sealed trait Windows extends Platform
    /* 2 */ @js.native
    object Windows extends TopLevel[Windows with Double]
  }
}
