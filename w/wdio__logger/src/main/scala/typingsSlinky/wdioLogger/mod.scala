package typingsSlinky.wdioLogger

import typingsSlinky.loglevel.mod.LogLevelDesc
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@wdio/logger", JSImport.Default)
    @js.native
    def apply(name: String): typingsSlinky.loglevel.mod.Logger = js.native
    @JSImport("@wdio/logger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/logger", "default.clearLogger")
    @js.native
    def clearLogger: js.Function0[Unit] = js.native
    @scala.inline
    def clearLogger_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearLogger")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger", "default.setLevel")
    @js.native
    def setLevel: js.Function2[/* name */ String, /* level */ LogLevelDesc, Unit] = js.native
    @scala.inline
    def setLevel_=(x: js.Function2[/* name */ String, /* level */ LogLevelDesc, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger", "default.setLogLevelsConfig")
    @js.native
    def setLogLevelsConfig: js.Function2[
        /* logLevels */ js.UndefOr[Record[String, LogLevelDesc]], 
        /* wdioLogLevel */ js.UndefOr[LogLevelDesc], 
        Unit
      ] = js.native
    @scala.inline
    def setLogLevelsConfig_=(
      x: js.Function2[
          /* logLevels */ js.UndefOr[Record[String, LogLevelDesc]], 
          /* wdioLogLevel */ js.UndefOr[LogLevelDesc], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setLogLevelsConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger", "default.waitForBuffer")
    @js.native
    def waitForBuffer: js.Function0[js.Promise[js.Any]] = js.native
    @scala.inline
    def waitForBuffer_=(x: js.Function0[js.Promise[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForBuffer")(x.asInstanceOf[js.Any])
  }
  
  type Logger = typingsSlinky.loglevel.mod.Logger
}
