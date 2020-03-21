package typingsSlinky.unstatedNext.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container[Value, State] extends js.Object {
  var Provider: ReactComponentClass[ContainerProviderProps[State]]
  def useContainer(): Value
}

object Container {
  @scala.inline
  def apply[Value, State](Provider: ReactComponentClass[ContainerProviderProps[State]], useContainer: () => Value): Container[Value, State] = {
    val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useContainer = js.Any.fromFunction0(useContainer))
  
    __obj.asInstanceOf[Container[Value, State]]
  }
}

