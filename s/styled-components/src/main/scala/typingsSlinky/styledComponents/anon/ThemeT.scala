package typingsSlinky.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeT[T] extends js.Object {
  var theme: js.UndefOr[T] = js.undefined
}

object ThemeT {
  @scala.inline
  def apply[T](): ThemeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeT[T]]
  }
  @scala.inline
  implicit class ThemeTOps[Self <: ThemeT[_], T] (val x: Self with ThemeT[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTheme(value: T): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

