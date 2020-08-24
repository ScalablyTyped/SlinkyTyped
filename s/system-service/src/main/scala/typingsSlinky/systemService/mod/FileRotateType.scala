package typingsSlinky.systemService.mod

import typingsSlinky.systemLogger.mod.fileRotateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("system-service", "FileRotateType")
@js.native
object FileRotateType extends js.Object {
  /* 2 */ val daily: typingsSlinky.systemLogger.mod.fileRotateType.daily with Double = js.native
  /* 3 */ val hourly: typingsSlinky.systemLogger.mod.fileRotateType.hourly with Double = js.native
  /* 4 */ val minutely: typingsSlinky.systemLogger.mod.fileRotateType.minutely with Double = js.native
  /* 0 */ val monthly: typingsSlinky.systemLogger.mod.fileRotateType.monthly with Double = js.native
  /* 1 */ val weekly: typingsSlinky.systemLogger.mod.fileRotateType.weekly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[fileRotateType with Double] = js.native
}

