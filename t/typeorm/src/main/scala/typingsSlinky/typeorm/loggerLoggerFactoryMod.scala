package typingsSlinky.typeorm

import typingsSlinky.typeorm.loggerLoggerMod.Logger
import typingsSlinky.typeorm.loggerLoggerOptionsMod.LoggerOptions
import typingsSlinky.typeorm.typeormStrings.`advanced-console`
import typingsSlinky.typeorm.typeormStrings.`simple-console`
import typingsSlinky.typeorm.typeormStrings.debug
import typingsSlinky.typeorm.typeormStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerLoggerFactoryMod {
  
  @JSImport("typeorm/logger/LoggerFactory", "LoggerFactory")
  @js.native
  class LoggerFactory () extends StObject {
    
    /**
      * Creates a new logger depend on a given connection's driver.
      */
    def create(): Logger = js.native
    def create(logger: js.UndefOr[scala.Nothing], options: LoggerOptions): Logger = js.native
    def create(logger: Logger): Logger = js.native
    def create(logger: Logger, options: LoggerOptions): Logger = js.native
    @JSName("create")
    def create_advancedconsole(logger: `advanced-console`): Logger = js.native
    @JSName("create")
    def create_advancedconsole(logger: `advanced-console`, options: LoggerOptions): Logger = js.native
    @JSName("create")
    def create_debug(logger: debug): Logger = js.native
    @JSName("create")
    def create_debug(logger: debug, options: LoggerOptions): Logger = js.native
    @JSName("create")
    def create_file(logger: file): Logger = js.native
    @JSName("create")
    def create_file(logger: file, options: LoggerOptions): Logger = js.native
    @JSName("create")
    def create_simpleconsole(logger: `simple-console`): Logger = js.native
    @JSName("create")
    def create_simpleconsole(logger: `simple-console`, options: LoggerOptions): Logger = js.native
  }
}
