package typingsSlinky.useGlobalHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactInterface extends js.Object {
  def useEffect(args: js.Any*): js.Any = js.native
  def useMemo(args: js.Any*): js.Any = js.native
  def useState(args: js.Any*): js.Any = js.native
}

object ReactInterface {
  @scala.inline
  def apply(
    useEffect: /* repeated */ js.Any => js.Any,
    useMemo: /* repeated */ js.Any => js.Any,
    useState: /* repeated */ js.Any => js.Any
  ): ReactInterface = {
    val __obj = js.Dynamic.literal(useEffect = js.Any.fromFunction1(useEffect), useMemo = js.Any.fromFunction1(useMemo), useState = js.Any.fromFunction1(useState))
    __obj.asInstanceOf[ReactInterface]
  }
  @scala.inline
  implicit class ReactInterfaceOps[Self <: ReactInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseEffect(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEffect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseMemo(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMemo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseState(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

