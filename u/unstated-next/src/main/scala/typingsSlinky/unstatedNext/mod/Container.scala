package typingsSlinky.unstatedNext.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container[Value, State] extends js.Object {
  var Provider: ReactComponentClass[ContainerProviderProps[State]] = js.native
  def useContainer(): Value = js.native
}

object Container {
  @scala.inline
  def apply[Value, State](Provider: ReactComponentClass[ContainerProviderProps[State]], useContainer: () => Value): Container[Value, State] = {
    val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useContainer = js.Any.fromFunction0(useContainer))
    __obj.asInstanceOf[Container[Value, State]]
  }
  @scala.inline
  implicit class ContainerOps[Self[value, state] <: Container[value, state], Value, State] (val x: Self[Value, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Value, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Value, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Value, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Value, State]) with Other]
    @scala.inline
    def withProvider(value: ReactComponentClass[ContainerProviderProps[State]]): Self[Value, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseContainer(value: () => Value): Self[Value, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContainer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

