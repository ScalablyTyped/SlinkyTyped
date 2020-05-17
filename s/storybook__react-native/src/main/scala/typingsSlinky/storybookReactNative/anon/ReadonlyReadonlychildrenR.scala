package typingsSlinky.storybookReactNative.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{}> & std.Readonly<{  children ? :react.react.ReactNode}> */
@js.native
trait ReadonlyReadonlychildrenR extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.native
}

object ReadonlyReadonlychildrenR {
  @scala.inline
  def apply(): ReadonlyReadonlychildrenR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyReadonlychildrenR]
  }
  @scala.inline
  implicit class ReadonlyReadonlychildrenROps[Self <: ReadonlyReadonlychildrenR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

