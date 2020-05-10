package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowFlyoutFactory extends js.Object {
  def create(position: Point): CoreWindowFlyout = js.native
  def createWithTitle(position: Point, title: String): CoreWindowFlyout = js.native
}

object ICoreWindowFlyoutFactory {
  @scala.inline
  def apply(create: Point => CoreWindowFlyout, createWithTitle: (Point, String) => CoreWindowFlyout): ICoreWindowFlyoutFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
    __obj.asInstanceOf[ICoreWindowFlyoutFactory]
  }
  @scala.inline
  implicit class ICoreWindowFlyoutFactoryOps[Self <: ICoreWindowFlyoutFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Point => CoreWindowFlyout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateWithTitle(value: (Point, String) => CoreWindowFlyout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithTitle")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

