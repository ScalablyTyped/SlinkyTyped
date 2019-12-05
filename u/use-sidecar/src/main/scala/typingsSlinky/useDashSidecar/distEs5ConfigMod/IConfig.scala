package typingsSlinky.useDashSidecar.distEs5ConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  def onError(e: js.Error): Unit
}

object IConfig {
  @scala.inline
  def apply(onError: js.Error => Unit): IConfig = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError))
  
    __obj.asInstanceOf[IConfig]
  }
}

