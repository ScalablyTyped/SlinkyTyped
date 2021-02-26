package typingsSlinky.sipJs

import typingsSlinky.sipJs.levelsMod.Levels
import typingsSlinky.sipJs.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerFactoryMod {
  
  @JSImport("sip.js/lib/core/log/logger-factory", "LoggerFactory")
  @js.native
  class LoggerFactory () extends StObject {
    
    var _connector: js.Any = js.native
    
    var _level: js.Any = js.native
    
    var builtinEnabled: Boolean = js.native
    
    def connector: js.UndefOr[
        js.Function4[
          /* level */ String, 
          /* category */ String, 
          /* label */ js.UndefOr[String], 
          /* content */ js.Any, 
          Unit
        ]
      ] = js.native
    def connector_=(
      value: js.UndefOr[
          js.Function4[
            /* level */ String, 
            /* category */ String, 
            /* label */ js.UndefOr[String], 
            /* content */ js.Any, 
            Unit
          ]
        ]
    ): Unit = js.native
    
    def genericLog(levelToLog: Levels, category: String, label: js.UndefOr[scala.Nothing], content: js.Any): Unit = js.native
    def genericLog(levelToLog: Levels, category: String, label: String, content: js.Any): Unit = js.native
    
    def getLogger(category: String): Logger = js.native
    def getLogger(category: String, label: String): Logger = js.native
    
    def level: Levels = js.native
    def level_=(newLevel: Levels): Unit = js.native
    
    var logger: js.Any = js.native
    
    var loggers: js.Any = js.native
    
    var print: js.Any = js.native
  }
}
