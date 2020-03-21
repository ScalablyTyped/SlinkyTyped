package typingsSlinky.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
  @js.native
  class Logger protected ()
    extends typingsSlinky.sipJs.loggerMod.Logger {
    def this(logger: typingsSlinky.sipJs.loggerFactoryMod.LoggerFactory, category: String) = this()
    def this(logger: typingsSlinky.sipJs.loggerFactoryMod.LoggerFactory, category: String, label: String) = this()
  }
  
  @js.native
  class LoggerFactory ()
    extends typingsSlinky.sipJs.loggerFactoryMod.LoggerFactory
  
  @js.native
  object Levels extends js.Object {
    /* 3 */ val debug: typingsSlinky.sipJs.levelsMod.Levels.debug with Double = js.native
    /* 0 */ val error: typingsSlinky.sipJs.levelsMod.Levels.error with Double = js.native
    /* 2 */ val log: typingsSlinky.sipJs.levelsMod.Levels.log with Double = js.native
    /* 1 */ val warn: typingsSlinky.sipJs.levelsMod.Levels.warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sipJs.levelsMod.Levels with Double] = js.native
  }
  
}

