package typingsSlinky.swaggerSailsHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon extends js.Object {
  /**
  				 * This route will match any routes that aren't bound in the app via a custom route configuration
  				 * or a blueprint.
  				 */
  @JSName("/*")
  def SlashAsterisk(req: js.Any, res: js.Any, next: js.Function0[_]): js.Any = js.native
}

object Anon {
  @scala.inline
  def apply(SlashAsterisk: (js.Any, js.Any, js.Function0[_]) => js.Any): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/*")(js.Any.fromFunction3(SlashAsterisk))
    __obj.asInstanceOf[Anon]
  }
  @scala.inline
  implicit class AnonOps[Self <: Anon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlashAsterisk(value: (js.Any, js.Any, js.Function0[_]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("/*")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

