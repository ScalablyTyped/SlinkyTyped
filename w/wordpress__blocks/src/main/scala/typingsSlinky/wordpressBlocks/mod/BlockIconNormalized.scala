package typingsSlinky.wordpressBlocks.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockIconNormalized extends js.Object {
  var background: js.UndefOr[String] = js.native
  var foreground: js.UndefOr[String] = js.native
  var shadowColor: js.UndefOr[String] = js.native
  var src: Icon | ReactElement | ReactComponentClass[js.Object] = js.native
}

object BlockIconNormalized {
  @scala.inline
  def apply(src: Icon | ReactElement | ReactComponentClass[js.Object]): BlockIconNormalized = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockIconNormalized]
  }
  @scala.inline
  implicit class BlockIconNormalizedOps[Self <: BlockIconNormalized] (val x: Self) extends AnyVal {
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
    def setSrcReactElement(value: ReactElement): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: Icon | ReactElement | ReactComponentClass[js.Object]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setForeground(value: String): Self = this.set("foreground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
  }
  
}

