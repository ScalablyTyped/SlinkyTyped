package typingsSlinky.sipDotJs

import typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log/levels", JSImport.Namespace)
@js.native
object libCoreLogLevelsMod extends js.Object {
  @js.native
  sealed trait Levels extends js.Object
  
  @js.native
  object Levels extends js.Object {
    @js.native
    sealed trait debug extends Levels
    
    @js.native
    sealed trait error extends Levels
    
    @js.native
    sealed trait log extends Levels
    
    @js.native
    sealed trait warn extends Levels
    
    /* 3 */ val debug: typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels.debug with Double = js.native
    /* 0 */ val error: typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels.error with Double = js.native
    /* 2 */ val log: typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels.log with Double = js.native
    /* 1 */ val warn: typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels.warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Levels with Double] = js.native
  }
  
}

