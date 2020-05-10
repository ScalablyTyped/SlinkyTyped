package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BackgroundProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundProps extends js.Object {
  val background: js.UndefOr[ResponsiveValue[BackgroundProperty[String]]] = js.native
}

object BackgroundProps {
  @scala.inline
  def apply(): BackgroundProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundProps]
  }
  @scala.inline
  implicit class BackgroundPropsOps[Self <: BackgroundProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: ResponsiveValue[BackgroundProperty[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
  }
  
}

