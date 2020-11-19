package typingsSlinky.systemService.mod

import typingsSlinky.systemLogger.mod.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("system-service", "Level")
@js.native
object Level extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[level with Double] = js.native
  
  /* 4 */ val debug: typingsSlinky.systemLogger.mod.level.debug with Double = js.native
  
  /* 0 */ val error: typingsSlinky.systemLogger.mod.level.error with Double = js.native
  
  /* 2 */ val info: typingsSlinky.systemLogger.mod.level.info with Double = js.native
  
  /* 5 */ val silly: typingsSlinky.systemLogger.mod.level.silly with Double = js.native
  
  /* 3 */ val verbose: typingsSlinky.systemLogger.mod.level.verbose with Double = js.native
  
  /* 1 */ val warn: typingsSlinky.systemLogger.mod.level.warn with Double = js.native
}
